package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Address {
    private int addressId;
    private String street;
    private int streetNumber;
    private String apartmentNumber;
    private String city;
    private String state;
    private String postalCode;
    private String country;
}
