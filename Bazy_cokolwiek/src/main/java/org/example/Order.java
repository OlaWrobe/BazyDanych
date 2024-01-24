package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Order {
    private int orderId;
    private int itemListId;
    private int clientId;
    private LocalDate dateOfOrder;
    private int shippingTypeId;
    private int paymentTypeId;
    private int discountId;
    private int addressId;
    private boolean isShipmentFree;
    private int itemQuantityAll;
    private double discountTotal;
    private double total;
}
