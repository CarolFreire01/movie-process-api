package br.com.carol.mymoviesprocess.utils.builder;

import br.com.carol.mymoviesprocess.client.dto.MovieDetailsDto;
import br.com.carol.mymoviesprocess.client.dto.ProductionCountries;
import br.com.carol.mymoviesprocess.client.dto.SpokenLanguage;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailsBuilder {

  public String homepage;
  public String status;
  public BigDecimal bigDecimal;
  public Long imdbId;
  public List<ProductionCountries> productionCountries = new ArrayList<ProductionCountries>();
  public List<SpokenLanguage> spokenLanguage = new ArrayList<SpokenLanguage>();

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

  public MovieDetailsDto build() {
    return new MovieDetailsDto(this);
  }
}
