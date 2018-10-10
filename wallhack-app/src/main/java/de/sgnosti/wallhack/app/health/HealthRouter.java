package de.sgnosti.wallhack.app.health;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class HealthRouter {

  @Bean
  public RouterFunction<ServerResponse> healthRoutes(HealthHandler healthHandler) {

    return RouterFunctions.route(RequestPredicates.GET("/health"), healthHandler::get);
  }
}
