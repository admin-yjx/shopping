package org.sang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Integer id;
    private Integer amount;
    private Date order_date;
    private Integer user_id;
    private String username;
}
