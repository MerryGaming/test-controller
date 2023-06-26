package org.aibles.orderservice.entity;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor(staticName = "of")
@Data
@Entity
@NoArgsConstructor
@Table(name = "shopping_cart")
public class ShoppingCart {

  @Id
  private String id;
  @Column(name = "item_id")
  private String itemId;
  private Integer quantity;
  private Float price;
  @Column(name = "user_id")
  private String userId;
  @PrePersist
  private void prePersistId() {
    this.id = this.id == null ? UUID.randomUUID().toString() : this.id;
  }
}
