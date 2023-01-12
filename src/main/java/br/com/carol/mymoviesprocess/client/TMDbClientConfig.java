package br.com.carol.mymoviesprocess.client;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

public class TMDbClientConfig {

  @Bean
  public RequestInterceptor requestInterceptor() {
    return requestTemplate -> {
      requestTemplate.header("Content-Type", "application/json");
      requestTemplate.header("Accept", "application/json");
    };
  }
}
