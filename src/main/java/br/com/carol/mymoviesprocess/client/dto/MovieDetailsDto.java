package br.com.carol.mymoviesprocess.client.dto;

import br.com.carol.mymoviesprocess.utils.builder.MovieDetailsBuilder;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
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


  public MovieDetailsDto(MovieDetailsBuilder builder) {
    this.homepage = builder.homepage;
    this.status = builder.status;
    this.bigDecimal = builder.bigDecimal;
    this.imdbId = builder.imdbId;
    this.productionCountries = builder.productionCountries;
    this.spokenLanguage = builder.spokenLanguage;
  }
}