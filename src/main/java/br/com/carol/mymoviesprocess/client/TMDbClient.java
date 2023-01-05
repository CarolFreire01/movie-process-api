package br.com.carol.mymoviesprocess.client;

import br.com.carol.mymoviesprocess.client.dto.MovieDto;
import br.com.carol.mymoviesprocess.enums.Language;
import java.util.List;
import java.util.UUID;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
    name = "TMDbClient",
    configuration = TMDbClientConfig.class,
    url = "${tmdb-api.base-url}"
)
public interface TMDbClient {

  @GetMapping("/movie/popular?api_key={api_key}&language={language}&page={page}")
  public List<MovieDto> getMovies(@PathVariable("language") Language language,
                                @PathVariable("page") Integer page,
                                @PathVariable("api_key") UUID apiKey);
}
