package com.agrigenisis.agriGensis.repository;

import com.agrigenisis.agriGensis.model.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {
}
