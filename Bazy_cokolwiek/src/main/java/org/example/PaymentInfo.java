package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PaymentInfo {
    private int paymentInfoId;
    private String creditCardNumber;
    private String nameOnCard;
    private String dateOfExpiration;
    private String cvcNumber;
}