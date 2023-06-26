package org.aibles.orderservice.dto.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "of")
@Data
@NoArgsConstructor
public class OrderDetailResponse {

  private List<String> shoppingCartId;
}
