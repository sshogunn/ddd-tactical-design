package com.ddd.training.dddcomponents.fanatic.entity;

import lombok.Data;

@Data
public class DriverRelocatedEvent {
    private String driverId;
    private final OfficeAddress officeAddress;
}
