package de.sgnosti.wallhack.app.handler;

import de.sgnosti.wallhack.app.health.HealthHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class TweetRouter {

  @Bean
  public RouterFunction<ServerResponse> tweetRoutes(TweetHandler tweetHandler) {

    return RouterFunctions.route(RequestPredicates.GET("/tweet"), tweetHandler::get);
  }
}
