package br.com.carol.mymoviesprocess.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class MovieDto {

  @JsonProperty("page")
  private int page;

  @JsonProperty("results")
  private List<MovieItems> movieItems;

}
