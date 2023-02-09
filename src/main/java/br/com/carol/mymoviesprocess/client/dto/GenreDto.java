package br.com.carol.mymoviesprocess.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GenreDto {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  public static List<GenreDto> convertGenre(MovieItemDto list, List<GenreArray> genres) {

    List<GenreDto> movieGenresWithName = new ArrayList<>();


    for (int x = 0; x < list.getGenre().size(); x++) {
      Long genreId = genres.get(x).getGenres().get(x).getId();
      String genreName = null;
      for (GenreArray allGenre : genres) {
        if (allGenre.getGenres().get(x).getId().equals(genreId)) {
          genreName = allGenre.getGenres().get(x).getName();
          break;
        }
      }

      movieGenresWithName.add(new GenreDto(genreId, genreName));
    }

    return movieGenresWithName;

  }
}
