package org.sang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    private Integer id;
    private Integer order_id;
    private Float price;
    private Integer product_id;
    private String product_name;
    private Integer quantity;
}
