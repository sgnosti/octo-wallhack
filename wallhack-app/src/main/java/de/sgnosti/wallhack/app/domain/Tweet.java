package de.sgnosti.wallhack.app.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Tweet {
  private String id;
  private String userId;
}
