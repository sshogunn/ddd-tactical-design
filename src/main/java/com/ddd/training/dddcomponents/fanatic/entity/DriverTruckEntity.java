package com.ddd.training.dddcomponents.fanatic.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;

@Entity
@Getter
@Setter
class DriverTruckEntity {
    @Id
    private long id;
    @Valid
    private RegistrationCard registrationCard;
}
