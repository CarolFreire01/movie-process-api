package br.com.carol.mymoviesprocess.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GenreArray {
/** TODO ARRUMAR NOME DA CLASSE PARA UM NOME RECENTE **/
  @JsonProperty("genres")
  private List<GenreDto> genres;

}
