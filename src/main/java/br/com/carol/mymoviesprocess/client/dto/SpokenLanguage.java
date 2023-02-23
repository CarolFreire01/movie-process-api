package br.com.carol.mymoviesprocess.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SpokenLanguage {

  @JsonProperty("english_name")
  private String englishName;

  @JsonProperty("iso_639_1")
  private String iso;

  @JsonProperty("name")
  private String name;
}