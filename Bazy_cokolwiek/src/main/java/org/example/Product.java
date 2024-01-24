package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private int productId;
    private int categoryId;
    private String description;
    private String nameOfItem;
    private int discountId;
    private int quantityAvailable;
    private double price;
}
