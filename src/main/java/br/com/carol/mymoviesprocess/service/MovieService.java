package br.com.carol.mymoviesprocess.service;

import br.com.carol.mymoviesprocess.client.TMDbClient;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

  @Value("feign.tmdb-api.param.api_key")
  private UUID apiKey;

  private final TMDbClient client;
}