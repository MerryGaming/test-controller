package org.aibles.orderservice.configuration;

import org.aibles.orderservice.facade.OrderFacadeService;
import org.aibles.orderservice.facade.OrderFacadeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"org.aibles.orderservice.repository"})
@ComponentScan(basePackages = {"org.aibles.orderservice.repository"})
public class OrderConfiguration {

  @Bean
  public OrderFacadeService orderFacadeService() {
    return new OrderFacadeServiceImpl();
  }
}
