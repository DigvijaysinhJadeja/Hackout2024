package com.agrigenisis.agriGensis.repository;

import com.agrigenisis.agriGensis.model.Crop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CropRepository extends JpaRepository<Crop, Long> {
}