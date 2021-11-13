package com.vehicles.vehiclesapplication.repository;

import com.vehicles.vehiclesapplication.models.VehiclesList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiclesRepository extends JpaRepository<VehiclesList,Integer> {
}
