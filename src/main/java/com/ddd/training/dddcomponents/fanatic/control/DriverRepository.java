package com.ddd.training.dddcomponents.fanatic.control;

import com.ddd.training.dddcomponents.fanatic.entity.DriverAggregate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<DriverAggregate, Long> {
}
