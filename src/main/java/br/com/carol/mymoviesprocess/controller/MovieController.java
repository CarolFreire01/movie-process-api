package br.com.carol.mymoviesprocess.controller;

import br.com.carol.movie_process_api.api.MovieApi;
import br.com.carol.movie_process_api.api.models.Movie;
import br.com.carol.movie_process_api.api.models.MovieDetails;
import br.com.carol.mymoviesprocess.service.MovieService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MovieController implements MovieApi {

  private final MovieService service;

  @Override
  public ResponseEntity<MovieDetails> findMovieById(String movieId) {
    return null;
  }

  @Override
  public ResponseEntity<List<Movie>> listMovies(Integer offset, String language) {
    List<Movie> movie = service.findAllMovies(offset, language);
    return ResponseEntity.ok(movie);
  }
}
