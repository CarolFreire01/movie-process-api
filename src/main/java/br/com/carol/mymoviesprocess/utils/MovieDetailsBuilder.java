package br.com.carol.mymoviesprocess.utils;

import br.com.carol.mymoviesprocess.client.dto.GenreDto;
import br.com.carol.mymoviesprocess.client.dto.ProductionCountries;
import br.com.carol.mymoviesprocess.client.dto.SpokenLanguage;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailsBuilder {

  private Long id;
  private List<GenreDto> genre;
  private String originalLanguage;
  private String originalTitle;
  private String overview;
  private String posterPath;
  private LocalDate releaseDate;
  private String title;
  private double voteAverage;
  private BigDecimal voteCount;
  private boolean adult;
  private String homepage;
  private String status;
  private BigDecimal bigDecimal;
  private Long imdbId;
  private List<ProductionCountries> productionCountries;
  private List<SpokenLanguage> spokenLanguage;

  public MovieDetailsBuilder id(Long id){
    this.id = id;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder genre(List<GenreDto> genre){
    this.genre = genre;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder addGenre(GenreDto genre){
    this.genre.add(genre);
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder originalLanguage(String originalLanguage){
    this.originalLanguage = originalLanguage;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder originalTitle(String originalTitle){
    this.originalTitle = originalTitle;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder overview(String overview){
    this.overview = overview;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder posterPath(String posterPath){
    this.posterPath = posterPath;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder releaseDate(LocalDate releaseDate){
    this.releaseDate = releaseDate;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder title(String title){
    this.title = title;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder voteAverage(double voteAverage){
    this.voteAverage = voteAverage;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder voteCount(BigDecimal voteCount){
    this.voteCount = voteCount;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder adult(boolean adult){
    this.adult = adult;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder homepage(String homepage){
    this.homepage = homepage;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder status(String status){
    this.status = status;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder bigDecimal(BigDecimal bigDecimal){
    this.bigDecimal = bigDecimal;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder imdbId(Long imdbId){
    this.imdbId = imdbId;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder productionCountries(List<ProductionCountries> productionCountries){
    this.productionCountries = productionCountries;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder addProductionCountries(ProductionCountries productionCountries){
    this.productionCountries.add(productionCountries);
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder spokenLanguage(List<SpokenLanguage> spokenLanguage){
    this.spokenLanguage = spokenLanguage;
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder addSpokenLanguage(SpokenLanguage spokenLanguage){
    this.spokenLanguage.add(spokenLanguage);
    return MovieDetailsBuilder.this;
  }

  public MovieDetailsBuilder build() {
    return new MovieDetailsBuilder(this);
  }

  private MovieDetailsBuilder(MovieDetailsBuilder builder) {
    this.id = builder.id;
    this.genre = builder.genre;
    this.originalLanguage = builder.originalLanguage;
    this.originalTitle = builder.originalTitle;
    this.overview = builder.overview;
    this.posterPath = builder.posterPath;
    this.releaseDate = builder.releaseDate;
    this.title = builder.title;
    this.voteAverage = builder.voteAverage;
    this.voteCount = builder.voteCount;
    this.adult = builder.adult;
    this.homepage = builder.homepage;
    this.status = builder.status;
    this.bigDecimal = builder.bigDecimal;
    this.imdbId = builder.imdbId;
    this.productionCountries = builder.productionCountries;
    this.spokenLanguage = builder.spokenLanguage;
  }
}
