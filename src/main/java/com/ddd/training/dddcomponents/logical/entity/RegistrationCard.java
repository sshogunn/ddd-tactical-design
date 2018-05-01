package com.ddd.training.dddcomponents.logical.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.time.LocalDate;

@Getter
@Setter(value = AccessLevel.PRIVATE)
@Embeddable
class RegistrationCard {
    private String number;
    private LocalDate expirationDate;
}
