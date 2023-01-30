package br.com.carol.mymoviesprocess.service;

import br.com.carol.movie_process_api.api.models.Movie;
import br.com.carol.mymoviesprocess.client.TMDbClient;
import br.com.carol.mymoviesprocess.client.dto.MovieDto;
import br.com.carol.mymoviesprocess.client.dto.MovieItemDto;
import br.com.carol.mymoviesprocess.enums.Language;
import br.com.carol.mymoviesprocess.utils.MovieBuilder;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

  @Value("feign.tmdb-api.param.api_key")
  private String apiKey;

  private final TMDbClient client;

  public List<Movie> findAllMovies(Integer page, String language) {

    MovieDto movies = client.getMovies(Language.valueOf(language).toString(), page, "89e7fa6a8dea2a8f40a9454070990f37");

    MovieBuilder movie = new MovieBuilder();

    Movie[] moviees = movie.MovieBuilder(movies);

    return List.of(moviees);
  }
}