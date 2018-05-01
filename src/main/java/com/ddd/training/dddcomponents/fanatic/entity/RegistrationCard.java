package com.ddd.training.dddcomponents.fanatic.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.time.LocalDate;

@Getter
@Setter
@Embeddable
class RegistrationCard {
    private String number;
    private LocalDate expirationDate;
}
