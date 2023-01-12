package br.com.carol.mymoviesprocess.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;
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

  @JsonProperty("id")
  private Long id;

  @JsonProperty("adult")
  private boolean adult;

  @JsonProperty("backdrop_path")
  private String backdropPath;

  @JsonProperty("budget")
  private BigDecimal budget;

  @JsonProperty("genres")
  private List<GenreDto> genres;

  @JsonProperty("imdb_id")
  private String imdbId;

  @JsonProperty("original_language")
  private String originalLanguage;

  @JsonProperty("original_title")
  private String originalTitle;

  @JsonProperty("overview")
  private String overview;

  @JsonProperty("production_companies")
  private List<ProductionCompanies> producers;

  @JsonProperty("production_countries")
  private List<ProductionCountries> countries;

  @JsonProperty("release_date")
  private Date releaseDate;

  @JsonProperty("status")
  private String status;

  @JsonProperty("tagline")
  private String tagline;

  @JsonProperty("title")
  private String title;

  @JsonProperty("vote_average")
  private BigDecimal voteAverage;

  @JsonProperty("vote_count")
  private Long voteCount;
}