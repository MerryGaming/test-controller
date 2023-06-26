package org.aibles.orderservice.dto.request;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderCreateRequest {

  @NotNull
  @Size(min = 1)
  private List<String> shoppingCartId;

}
