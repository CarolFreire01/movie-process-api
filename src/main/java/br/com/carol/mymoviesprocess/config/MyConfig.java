package br.com.carol.mymoviesprocess.config;

import java.util.UUID;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.yml")
public class MyConfig {

  @Value("${feign.tmdb-api.api-key}")
  private String apiKey;

  public String getApiKey() {
    return apiKey;
  }
}