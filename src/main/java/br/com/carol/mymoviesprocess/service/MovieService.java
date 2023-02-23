package br.com.carol.mymoviesprocess.service;

import br.com.carol.movie_process_api.api.models.Movie;
import br.com.carol.movie_process_api.api.models.MovieDetails;
import br.com.carol.mymoviesprocess.client.TMDbClient;
import br.com.carol.mymoviesprocess.client.dto.GenreItemsDto;
import br.com.carol.mymoviesprocess.client.dto.GenreDetailsDto;
import br.com.carol.mymoviesprocess.client.dto.MovieDetailsDto;
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
  private final GenreService genreService;

  public List<Movie> findAllMovies(Integer page, String language) {

    GenreItemsDto genre = genreService.getGenres(language);

    MovieDto getMovies = client.getMovies(Language.valueOf(language).toString(), page, config.getApiKey());

    Movie[] movieList = MovieDto.movieBuilder(getMovies, GenreDetailsDto.build(genre));

    return List.of(movieList);
  }

  public MovieDetails findMovieById(Long movieId, String language) {

    MovieDetailsDto getDetails = client.getMovieById(movieId, config.getApiKey(), Language.valueOf(language).toString());

    return MovieDetailsDto.buildMovieDetails(getDetails);
  }
}