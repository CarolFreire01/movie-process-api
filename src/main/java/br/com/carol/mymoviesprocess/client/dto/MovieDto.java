package br.com.carol.mymoviesprocess.client.dto;

import br.com.carol.movie_process_api.api.models.Movie;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
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
}