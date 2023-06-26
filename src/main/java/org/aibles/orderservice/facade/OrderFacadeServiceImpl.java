package org.aibles.orderservice.facade;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.transaction.Transactional;

import org.aibles.orderservice.dto.response.OrderDetailResponse;
import org.aibles.orderservice.exception.ShoppingCartIdAlreadyExistsException;


public class OrderFacadeServiceImpl implements OrderFacadeService{

  @Override
  @Transactional
  public OrderDetailResponse create(List<String> shoppingCartId) {
//    Set<String> set = new HashSet<>(shoppingCartId);
//    boolean hasDuplicates = false;
//    for (int i = 0; i < shoppingCartId.size() - 1; i++) {
//      for (int j = i + 1; j < shoppingCartId.size(); j++) {
//        if (shoppingCartId.get(i).equals(shoppingCartId.get(j))) {
//          hasDuplicates = true;
//          break;
//        }
//      }
//    }
//    if(hasDuplicates) {
//      throw new ShoppingCartIdAlreadyExistsException(shoppingCartId.toString());
//    }
    OrderDetailResponse response = new OrderDetailResponse();
    return response;
  }
}
