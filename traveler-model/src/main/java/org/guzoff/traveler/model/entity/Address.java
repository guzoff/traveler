package org.guzoff.traveler.model.entity;

import lombok.Value;

@Value
public class Address {
    
    String zipCode;
    String street;
    String houseNo;
    String apartNo;
}
