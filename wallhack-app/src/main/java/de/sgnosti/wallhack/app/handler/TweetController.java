package de.sgnosti.wallhack.app.handler;

import de.sgnosti.wallhack.app.domain.Tweet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TweetController {

  @GetMapping("/api/tweet")
  public Tweet tweet() {
    return new Tweet();
  }
}
