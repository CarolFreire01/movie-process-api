package br.com.carol.mymoviesprocess.client;

import br.com.carol.mymoviesprocess.client.dto.GenreArray;
import br.com.carol.mymoviesprocess.client.dto.GenreDto;
import br.com.carol.mymoviesprocess.client.dto.MovieDetailsDto;
import br.com.carol.mymoviesprocess.client.dto.MovieDto;
import br.com.carol.mymoviesprocess.client.dto.MovieItemDto;
import br.com.carol.mymoviesprocess.enums.Language;
import java.util.List;
import java.util.UUID;
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
  public MovieDto getMovies(@PathVariable("language") String language,
                                @PathVariable("page") Integer page,
                                @PathVariable("api_key") String apiKey);

  @GetMapping("/genre/movie/list?api_key={api_key}&language={language}")
  public List<GenreArray> getGenres(@PathVariable("api_key") String apiKey,
                                  @PathVariable("language") String language);

  @GetMapping("movie/{movie_id}?api_key={api_key}&language={language}")
  public MovieDetailsDto getMovieById(@PathVariable("movie_id") Long movieId,
                                      @PathVariable("api_key") UUID apiKey,
                                      @PathVariable("language") String language);
}