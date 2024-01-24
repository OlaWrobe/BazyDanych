package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Shipping {
    private int shippingId;
    private String type;
    private String transportCompany;
    private LocalDate estimatedArrival;
    private double price;
}
