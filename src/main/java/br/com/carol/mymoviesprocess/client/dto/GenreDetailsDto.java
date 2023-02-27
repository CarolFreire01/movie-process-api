package br.com.carol.mymoviesprocess.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GenreDetailsDto extends GenreDto{

  @JsonProperty("name")
  private String name;

  public static List<GenreDetailsDto> build(GenreItemsDto genre) {
    List<GenreDetailsDto> genres = new ArrayList<>();

    for (int x = 0; x < genre.getGenres().size(); x++) {
      GenreDetailsDto genreWithNameAndNumber = new GenreDetailsDto();
      genreWithNameAndNumber.setId(genre.getGenres().get(x).getId());
      genreWithNameAndNumber.setName(genre.getGenres().get(x).getName());
      genres.add(genreWithNameAndNumber);
    }

    return genres;
  }

  public static List<GenreDetailsDto> convertGenre(MovieItemsDto list, List<GenreDetailsDto> genre) {
    List<GenreDetailsDto> movieGenresWithName = new ArrayList<>();

    for (int x = 0; x < list.getGenre().size(); x++) {
      int genreId = genre.get(x).getId();
      String genreName = null;
      for (GenreDetailsDto allGenre : genre) {
        if (allGenre.getId() == genreId) {
          genreName = allGenre.getName();
          break;
        }
      }
      GenreDetailsDto genreWithName = new GenreDetailsDto();
      genreWithName.setId(genreId);
      genreWithName.setName(genreName);
      movieGenresWithName.add(genreWithName);
    }

    return movieGenresWithName;
  }
}