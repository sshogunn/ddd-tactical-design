package com.ddd.training.dddcomponents.logical.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;

@Entity
@Getter(value = AccessLevel.PRIVATE)
@Setter
class DriverTruckEntity {
    @Id
    private long id;
    @Valid
    private RegistrationCard registrationCard;
}
