package org.aibles.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ShoppingCartController.class)
public class ShoppingCartControllerTest {

  @Autowired
  private MockMvc mockMvc;
}
