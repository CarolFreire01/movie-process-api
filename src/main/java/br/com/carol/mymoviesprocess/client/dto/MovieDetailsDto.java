package br.com.carol.mymoviesprocess.client.dto;

import br.com.carol.movie_process_api.api.models.MovieDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailsDto extends MovieItemsDto {

  @JsonProperty("homepage")
  private String homepage;

  @JsonProperty("status")
  private String status;

  @JsonProperty("budget")
  private BigDecimal budget;

  @JsonProperty("imdb_id")
  private String imdbId;

  @JsonProperty("genres")
  private List<GenreDetailsDto> genres;

  @JsonProperty("tagline")
  private String tagline;

  @JsonProperty("spoken_languages")
  private List<SpokenLanguage> spokenLanguage;

  @JsonProperty("production_companies")
  private List<ProductionCompanies> productionCompanies;

  public static MovieDetails buildMovieDetails(MovieDetailsDto movie) {
    MovieDetails details = new MovieDetails();

    details.setId(movie.getId());
    details.setIsAdult(movie.isAdult());
    details.setGenre(List.of(movie.getGenres()));
    details.setOriginalLanguage(movie.getOriginalLanguage());
    details.setTitle(movie.getTitle());
    details.setTagline(movie.getTagline());
    details.setOriginalTitle(movie.getOriginalTitle());
    details.setOverview(movie.getOverview());
    details.setPosterPath(movie.getPosterPath());
    details.setVoteCount(movie.getVoteCount());
    details.setVoteAverage(movie.getVoteAverage());
    details.setHomepage(movie.getHomepage());
    details.setStatus(movie.getStatus());
    details.setBudget(movie.getBudget());
    details.setImdbId(movie.getImdbId());
    details.setProductionCompanies(List.of(movie.getProductionCompanies()));
    details.setSpokenLanguage(List.of(movie.getSpokenLanguage()));

    return details;

  }
}