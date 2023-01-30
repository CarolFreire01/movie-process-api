package br.com.carol.mymoviesprocess.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
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
}