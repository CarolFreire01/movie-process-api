package br.com.carol.mymoviesprocess.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductionCompanies {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("logo_path")
  private String logoPath;

  @JsonProperty("name")
  private String name;

  @JsonProperty("origin_country")
  private String originCountry;
}