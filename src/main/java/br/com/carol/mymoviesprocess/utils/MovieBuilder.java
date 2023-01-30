package br.com.carol.mymoviesprocess.utils;

import br.com.carol.movie_process_api.api.models.Movie;
import br.com.carol.mymoviesprocess.client.dto.MovieDto;
import br.com.carol.mymoviesprocess.client.dto.MovieItemDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import springfox.documentation.swagger2.mappers.ModelMapper;

@Getter
public class MovieBuilder {

  private  Long id;
  private  Boolean isAdult;
  private  List<Object> genre = null;
  private String originalLanguage;
  private String title;
  private String originalTitle;
  private String overview;
  private String posterPath;
  private OffsetDateTime releaseDate;
  private BigDecimal voteCount;
  private double voteAverage;

  public MovieBuilder() {
  }

  public static Movie[] MovieBuilder(MovieDto list) {
    List<Movie> movies = new ArrayList<>();

    for (MovieItemDto item : list.getMovieItemDto()) {
      Movie movie = new Movie();
      movie.setId(item.getId());
      movie.setTitle(item.getTitle());
      movie.setOriginalTitle(item.getOriginalTitle());
      movie.setTranslateTitle(item.getTranslateTitle());
      movie.overview(item.getOverview());
      movie.posterPath(item.getPosterPath());
      movie.releaseDate(item.getReleaseDate());
      movie.voteCount(item.getVoteCount());
      movie.voteAverage(item.getVoteAverage());
      movie.isAdult(item.isAdult());
      movie.genre(List.of(item.getGenre()));
      movies.add(movie);
    }

    return movies.toArray(new Movie[movies.size()]);
  }

}
