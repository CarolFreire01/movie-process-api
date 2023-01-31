package br.com.carol.mymoviesprocess.service;

import br.com.carol.movie_process_api.api.models.Movie;
import br.com.carol.mymoviesprocess.client.TMDbClient;
import br.com.carol.mymoviesprocess.client.dto.MovieDto;
import br.com.carol.mymoviesprocess.config.MyConfig;
import br.com.carol.mymoviesprocess.enums.Language;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

  private final MyConfig config;
  private final TMDbClient client;

  public List<Movie> findAllMovies(Integer page, String language) {

    MovieDto getMovies = client.getMovies(Language.valueOf(language).toString(), page, config.getApiKey());

    Movie[] movieList = MovieDto.MovieBuilder(getMovies);

    return List.of(movieList);
  }
}