package org.aibles.orderservice.dto.response;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aibles.orderservice.constant.OrderStatus;
import org.aibles.orderservice.entity.Order;

@AllArgsConstructor(staticName = "of")
@Data
@NoArgsConstructor
public class OrderResponse {

  private String id;
  private OrderStatus orderStatus;
  private String userId;

  public static OrderResponse from(Order order) {
    OrderResponse response = new OrderResponse();
    response.setId(order.getId());
    response.setOrderStatus(order.getOrderStatus());
    response.setUserId(order.getUserId());
    return response;
  }
}
