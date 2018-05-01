package com.ddd.training.dddcomponents.logical.control;

import com.ddd.training.dddcomponents.logical.entity.DriverAggregate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<DriverAggregate, Long> {
}
