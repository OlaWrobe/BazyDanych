package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.spi.LocaleServiceProvider;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Discount {
    private int discountId;
    private String occasion;
    private String type;
    private double amount;
    private LocalDate dateFrom;
    private LocalDate dateTo;
    private boolean canStack;
}
