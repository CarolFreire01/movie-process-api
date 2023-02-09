package br.com.carol.mymoviesprocess.service;

import br.com.carol.mymoviesprocess.client.TMDbClient;
import br.com.carol.mymoviesprocess.client.dto.GenreArray;
import br.com.carol.mymoviesprocess.client.dto.GenreDto;
import br.com.carol.mymoviesprocess.config.MyConfig;
import br.com.carol.mymoviesprocess.enums.Language;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenreService {

  private final MyConfig config;
  private final TMDbClient client;

  public List<GenreArray> getGenres(String language) {
    List<GenreArray> genres = client.getGenres(config.getApiKey(), Language.valueOf(language).toString());

    return genres;
  }

}
