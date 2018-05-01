package com.ddd.training.dddcomponents.logical.control;

import com.ddd.training.dddcomponents.logical.entity.DriverRelocatedEvent;
import org.springframework.stereotype.Component;

@Component
public class RelocationEventPublisher {
    public void publish(DriverRelocatedEvent driverRelocatedEvent) {
        //send by calling REST, publish in Topic, or use CDI events
    }
}
