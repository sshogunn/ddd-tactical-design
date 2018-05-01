package com.ddd.training.dddcomponents.logical.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter(value = AccessLevel.PRIVATE)
@Entity
public class DriverAggregate {
    private OfficeAddress officeAddress;
    @OneToMany
    private Set<DriverTruckEntity> trucks = new HashSet<>();

    @Transient
    private DriverRelocatedEvent lastEvent;

    public void relocateToCity(String newCity) {
        this.officeAddress = officeAddress.withNewCity(newCity);
        this.lastEvent = new DriverRelocatedEvent(officeAddress);
    }
}
