package de.sgnosti.wallhack.app.handler;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class TweetHandler {
  public Mono<ServerResponse> get(ServerRequest request) {
    return ServerResponse.ok().body(BodyInserters.empty());
  }
}
