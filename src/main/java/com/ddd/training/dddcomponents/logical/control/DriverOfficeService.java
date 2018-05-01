package com.ddd.training.dddcomponents.logical.control;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverOfficeService {
    private final DriverRepository driverRepository;
    private final RelocationEventPublisher relocationEventPublisher;

    public void relocateToAnotherCity(long driverId, String newCity) {
        val driver = driverRepository.findById(driverId);
        driver.ifPresent(
                d -> {
                    d.relocateToCity(newCity);
                    driverRepository.save(d);
                    relocationEventPublisher.publish(d.getLastEvent());
                }
        );
    }
}
