package org.aibles.orderservice.exception;

public class ShoppingCartIdAlreadyExistsException extends BaseException{

  public ShoppingCartIdAlreadyExistsException(String shoppingCartId) {
    setStatus(409);
    setCode("org.aibles.orderservice.exception.ShoppingCartIdAlreadyExistsException");
    addParams("shoppingCartId", shoppingCartId);
  }
}
