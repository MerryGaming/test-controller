package org.aibles.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(OrderService.class)
public class OrderServiceTest {

  @Autowired
  private MockMvc mockMvc;
}
