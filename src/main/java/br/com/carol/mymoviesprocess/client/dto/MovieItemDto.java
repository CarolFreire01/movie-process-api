package br.com.carol.mymoviesprocess.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieItemDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("genre_ids")
  private List<GenreDto> genre;

  @JsonProperty("original_language")
  private String originalLanguage;

  @JsonProperty("original_title")
  private String originalTitle;

  @JsonProperty("overview")
  private String overview;

  @JsonProperty("poster_path")
  private String posterPath;

  @JsonProperty("release_date")
  private LocalDate releaseDate;

  @JsonProperty("title")
  private String title;

  @JsonProperty("vote_average")
  private double voteAverage;

  @JsonProperty("vote_count")
  private BigDecimal voteCount;

  @JsonProperty("adult")
  private boolean adult;
}