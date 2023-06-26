package org.aibles.orderservice.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;
import org.aibles.orderservice.dto.request.OrderCreateRequest;
import org.aibles.orderservice.dto.response.OrderDetailResponse;
import org.aibles.orderservice.facade.OrderFacadeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(OrderController.class)
@AutoConfigureMockMvc(addFilters = false)
public class OrderControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private OrderFacadeService orderFacadeService;

  @Autowired
  private OrderController orderController;

  private static String asJsonString(final Object obj) {
    try {
      return new ObjectMapper().writeValueAsString(obj);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Test
  public void testCreateOrder_SameShoppingCartId_Exception400() throws Exception {
    List<String> shoppingCartIds = Arrays.asList();
    OrderCreateRequest request = new OrderCreateRequest();
    request.setShoppingCartId(shoppingCartIds);

    mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/orders")
            .contentType(MediaType.APPLICATION_JSON)
            .content(asJsonString(request)))
        .andExpect(status().isBadRequest());
  }

  @Test
  public void testCreateOrder_SameShoppingCartId_Exception201() throws Exception {
    List<String> shoppingCartIds = Arrays.asList("cart1", "cart2", "cart1");
    OrderCreateRequest request = new OrderCreateRequest();
    request.setShoppingCartId(shoppingCartIds);

    Mockito.when(orderFacadeService.create(request.getShoppingCartId())).thenReturn(new OrderDetailResponse());

    mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/orders")
            .contentType(MediaType.APPLICATION_JSON)
            .content(asJsonString(request)))
        .andExpect(status().isCreated());
  }
}
