package com.ddd.training.dddcomponents.fanatic.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter(AccessLevel.PRIVATE)
@Embeddable
class OfficeAddress {
    private String city;
    private String street;
    private int house;

    public OfficeAddress withNewCity(String city) {
        OfficeAddress newOfficeAddress = new OfficeAddress();
        newOfficeAddress.city = city;
        newOfficeAddress.house = house;
        newOfficeAddress.street = street;
        return newOfficeAddress;
    }
}
