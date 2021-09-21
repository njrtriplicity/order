package com.cb.viooh.order.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Item {
    Integer itemId;
    String itemCode;
    String itemName;
    Double price;
    String itemType;
}
