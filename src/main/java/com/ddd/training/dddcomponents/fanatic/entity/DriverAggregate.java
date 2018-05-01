package com.ddd.training.dddcomponents.fanatic.entity;

import com.ddd.training.dddcomponents.fanatic.control.DriverRepository;
import com.ddd.training.dddcomponents.fanatic.control.RelocationEventPublisher;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class DriverAggregate {
    private OfficeAddress officeAddress;
    @OneToMany
    private Set<DriverTruckEntity> trucks = new HashSet<>();

    public void relocateToCity(
            String newCity,
            DriverRepository repository,
            RelocationEventPublisher eventPublisher) {
        this.officeAddress = officeAddress.withNewCity(newCity);
        repository.save(this);
        eventPublisher.publish(new DriverRelocatedEvent(officeAddress));
    }
}
