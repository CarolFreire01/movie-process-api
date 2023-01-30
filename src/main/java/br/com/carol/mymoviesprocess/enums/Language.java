package br.com.carol.mymoviesprocess.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Language {

  PORTUGUES("pt-BR"), INGLES("en-US");

  private final String value;
}
