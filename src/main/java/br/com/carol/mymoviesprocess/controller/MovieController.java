package br.com.carol.mymoviesprocess.controller;

import br.com.carol.movie_process_api.api.MovieApi;
import br.com.carol.movie_process_api.api.models.Movie;
import br.com.carol.movie_process_api.api.models.MovieDetails;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class MovieController implements MovieApi {

  @Override
  public ResponseEntity<MovieDetails> findMovieById(String movieId) {
    return null;
  }

  @Override
  public ResponseEntity<List<Movie>> listMovies(Integer offset, Integer limit) {
    return null;
  }
}
