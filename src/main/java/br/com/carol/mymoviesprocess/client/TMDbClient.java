package br.com.carol.mymoviesprocess.client;

import br.com.carol.mymoviesprocess.client.dto.GenreDto;
import br.com.carol.mymoviesprocess.client.dto.MovieDetailsDto;
import br.com.carol.mymoviesprocess.client.dto.MovieDto;
import br.com.carol.mymoviesprocess.enums.Language;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
    name = "TMDbClient",
    configuration = TMDbClientConfig.class,
    url = "${feign.tmdb-api.base-url}"
)
public interface TMDbClient {

  @GetMapping("/movie/popular?api_key={api_key}&language={language}&page={page}")
  public List<MovieDto> getMovies(@PathVariable("language") Language language,
                                @PathVariable("page") Integer page,
                                @PathVariable("api_key") UUID apiKey);

  @GetMapping("/genre/movie/list?api_key={api_key}&language={language}")
  public List<GenreDto> getGenres(@PathVariable("api_key") UUID apiKey,
                                  @PathVariable("language") Language language);

  @GetMapping("movie/{movie_id}?api_key={api_key}&language={language}")
  public MovieDetailsDto getMovieById(@PathVariable("movie_id") Long movieId,
                                      @PathVariable("api_key") UUID apiKey,
                                      @PathVariable("language") Language language);
}