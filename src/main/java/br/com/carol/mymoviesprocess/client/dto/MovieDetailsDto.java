package br.com.carol.mymoviesprocess.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailsDto {

  @JsonProperty("homepage")
  private String homepage;

  @JsonProperty("status")
  private String status;

  @JsonProperty("budget")
  private BigDecimal bigDecimal;

  @JsonProperty("imdbId")
  private Long imdbId;

  @JsonProperty("productionCompanies")
  private List<ProductionCountries> productionCountries;

  @JsonProperty("spokenLanguage")
  private List<SpokenLanguage> spokenLanguage;

  /** TODO deixar aqui por enquanto
   * até decidir o que será feito.
   */

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