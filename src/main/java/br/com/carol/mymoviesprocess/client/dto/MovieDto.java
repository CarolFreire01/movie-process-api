package br.com.carol.mymoviesprocess.client.dto;

import br.com.carol.movie_process_api.api.models.Movie;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MovieDto{

  @JsonProperty("page")
  private int page;

  @JsonProperty("results")
  private List<MovieItemDto> movieItemDto;

  private MovieDto build(Movie movie) {
    return MovieDto.builder()
        .movieItemDto(List.of(MovieItemDto.builder()
                                                .id(movie.getId())
                                                .originalLanguage(movie.getOriginalLanguage())
                                                .originalTitle(movie.getOriginalTitle())
                                                .overview(movie.getOverview())
                                                .posterPath(movie.getPosterPath())
                                                .releaseDate(LocalDate.from(movie.getReleaseDate()))
                                                .title(movie.getTitle())
                                                .voteCount(movie.getVoteCount())
                                                .voteAverage(movie.getVoteAverage())
                                                .adult(movie.getIsAdult())
                                                .build()))

        .build();
  }
}