package de.sgnosti.wallhack.app.health;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HealthHandler {

  public Mono<ServerResponse> get(ServerRequest request) {
    return ServerResponse.ok().body(BodyInserters.empty());
  }
}
