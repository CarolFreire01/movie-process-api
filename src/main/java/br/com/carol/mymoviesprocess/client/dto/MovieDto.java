package br.com.carol.mymoviesprocess.client.dto;

import br.com.carol.movie_process_api.api.models.Movie;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto{

  @JsonProperty("page")
  private int page;

  @JsonProperty("results")
  private List<MovieItemDto> movieItemDto;

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