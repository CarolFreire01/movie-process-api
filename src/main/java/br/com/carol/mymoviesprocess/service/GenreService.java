package br.com.carol.mymoviesprocess.service;

import br.com.carol.mymoviesprocess.client.TMDbClient;
import br.com.carol.mymoviesprocess.client.dto.GenreItemsDto;
import br.com.carol.mymoviesprocess.config.MyConfig;
import br.com.carol.mymoviesprocess.enums.Language;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenreService {

  private final MyConfig config;
  private final TMDbClient client;

  public GenreItemsDto getGenres(String language) {
    GenreItemsDto genres = client.getGenres(config.getApiKey(), Language.valueOf(language).toString());
    return genres;
  }

}
