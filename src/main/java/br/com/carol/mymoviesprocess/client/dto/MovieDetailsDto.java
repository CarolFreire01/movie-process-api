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
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailsDto extends MovieItemDto {

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

  @Builder
  public MovieDetailsDto(Long id, List<GenreDto> genre, String originalLanguage,
      String originalTitle,
      String overview, String posterPath, LocalDate releaseDate, String title,
      double voteAverage, BigDecimal voteCount, boolean adult, String homepage, String status,
      BigDecimal bigDecimal, Long imdbId, List<ProductionCountries> productionCountries,
      List<SpokenLanguage> spokenLanguage) {
    super(id, genre, originalLanguage, originalTitle, overview, posterPath, releaseDate, title,
        voteAverage, voteCount, adult);
    this.homepage = homepage;
    this.status = status;
    this.bigDecimal = bigDecimal;
    this.imdbId = imdbId;
    this.productionCountries = productionCountries;
    this.spokenLanguage = spokenLanguage;
  }
}