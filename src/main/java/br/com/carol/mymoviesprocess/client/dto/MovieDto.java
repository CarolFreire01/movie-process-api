package br.com.carol.mymoviesprocess.client.dto;

import br.com.carol.movie_process_api.api.models.Movie;
import com.fasterxml.jackson.annotation.JsonProperty;
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
  private List<MovieItemsDto> movieItemsDto;

  public static Movie[] MovieBuilder(MovieDto list, List<GenreDetailsDto> genreDto) {
    List<Movie> movies = new ArrayList<>();

    for (MovieItemsDto item : list.getMovieItemsDto()) {
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
      movie.genre(List.of(GenreDetailsDto.convertGenre(item, genreDto)));
      movies.add(movie);
    }

    return movies.toArray(new Movie[movies.size()]);
  }
}