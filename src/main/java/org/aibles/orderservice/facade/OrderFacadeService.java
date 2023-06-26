package org.aibles.orderservice.facade;

import java.util.List;
import org.aibles.orderservice.dto.response.OrderDetailResponse;

public interface OrderFacadeService {

  OrderDetailResponse create(List<String> shoppingCartId);
}
