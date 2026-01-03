package com.microservices;

public class M25_Implementing_Custom_Routing {
    public static void main(String[] args) {

        String stepsToFollow = """
                Add below code snippet to the main class of GatewayServer
                @Bean
                	public RouteLocator microservicesRouteConfig(RouteLocatorBuilder routeLocatorBuilder){
                
                		return routeLocatorBuilder.routes()
                				.route(p -> p
                						.path("/microservice/accounts/**")
                						.filters( f -> f.rewritePath("/microservice/accounts/(?<segment>.*)","/${segment}")
                						)
                						.uri("lb://ACCOUNTS"))
                				.route(p -> p
                						.path("/microservice/loans/**")
                						.filters( f -> f.rewritePath("/microservice/cards/(?<segment>.*)","/${segment}")
                						)
                						.uri("lb://CARDS"))
                				.route(p -> p
                						.path("/microservice/cards/**")
                						.filters( f -> f.rewritePath("/microservice/loans/(?<segment>.*)","/${segment}")
                						)
                						.uri("lb://LOANS")).build();
                	}
                """;
    }
}
