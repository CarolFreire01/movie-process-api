package br.com.carol.mymoviesprocess.utils.builder;

import br.com.carol.mymoviesprocess.client.dto.GenreDto;
import br.com.carol.mymoviesprocess.client.dto.MovieItemDto;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MovieItemBuilder {

  public Long id;
  public List<GenreDto> genre = new ArrayList<GenreDto>();
  public String originalLanguage;
  public String originalTitle;
  public String overview;
  public String posterPath;
  public LocalDate releaseDate;
  public String title;
  public double voteAverage;
  public BigDecimal voteCount;
  public boolean adult;

  public MovieItemBuilder id(Long id){
    this.id = id;
    return MovieItemBuilder.this;
  }

  public MovieItemBuilder genre(List<GenreDto> genre){
    this.genre = genre;
    return MovieItemBuilder.this;
  }

  public MovieItemBuilder addGenre(GenreDto genre){
    this.genre.add(genre);
    return MovieItemBuilder.this;
  }

  public MovieItemBuilder originalLanguage(String originalLanguage){
    this.originalLanguage = originalLanguage;
    return MovieItemBuilder.this;
  }

  public MovieItemBuilder originalTitle(String originalTitle){
    this.originalTitle = originalTitle;
    return MovieItemBuilder.this;
  }

  public MovieItemBuilder overview(String overview){
    this.overview = overview;
    return MovieItemBuilder.this;
  }

  public MovieItemBuilder posterPath(String posterPath){
    this.posterPath = posterPath;
    return MovieItemBuilder.this;
  }

  public MovieItemBuilder releaseDate(LocalDate releaseDate){
    this.releaseDate = releaseDate;
    return MovieItemBuilder.this;
  }

  public MovieItemBuilder title(String title){
    this.title = title;
    return MovieItemBuilder.this;
  }

  public MovieItemBuilder voteAverage(double voteAverage){
    this.voteAverage = voteAverage;
    return MovieItemBuilder.this;
  }

  public MovieItemBuilder voteCount(BigDecimal voteCount){
    this.voteCount = voteCount;
    return MovieItemBuilder.this;
  }

  public MovieItemBuilder adult(boolean adult){
    this.adult = adult;
    return MovieItemBuilder.this;
  }

  public MovieItemDto build() {
    return new MovieItemDto(this);
  }
}
