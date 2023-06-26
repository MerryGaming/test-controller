package org.aibles.orderservice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(OrderRepository.class)
public class OrderRepositoryTest {

  @Autowired
  private MockMvc mockMvc;
}
