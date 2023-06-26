package org.aibles.orderservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.aibles.orderservice.dto.request.OrderCreateRequest;
import org.aibles.orderservice.dto.response.Response;
import org.aibles.orderservice.facade.OrderFacadeService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1/orders")
public class OrderController {

  private final OrderFacadeService service;

  public OrderController(OrderFacadeService service) {
    this.service = service;
  }

  @PostMapping()
  @ResponseStatus(HttpStatus.CREATED)
  public Response create(@Validated @RequestBody OrderCreateRequest request) {
    return Response.of(HttpStatus.CREATED.value(), service.create(request.getShoppingCartId()));
  }
}
