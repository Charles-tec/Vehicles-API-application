package com.vehicles.vehiclesapplication.controllers;

import com.vehicles.vehiclesapplication.models.VehiclesList;
import com.vehicles.vehiclesapplication.repository.VehiclesRepository;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.BasicAuthDefinition;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@SecurityRequirement(name="user")
@RequestMapping("/api")
public class VehiclesController {
    @Autowired
    VehiclesRepository Vrep;

    @GetMapping("/vehicles")
    public ResponseEntity<List<VehiclesList>>getAllVehicles(){
        List<VehiclesList> lst=Vrep.findAll();
        return ResponseEntity.ok().body(lst);
    }
    @GetMapping("/vehicles/{id}")
    public ResponseEntity<VehiclesList>getOneVehicle(@PathVariable Integer id){
        Optional<VehiclesList> o=Vrep.findById(id);
        VehiclesList vl=o.get();
        return ResponseEntity.ok().body(vl);
    }

    @PostMapping("/save")
    public ResponseEntity<VehiclesList> createVehicle(@RequestBody VehiclesList vl){
        VehiclesList v=Vrep.save(vl);
        return ResponseEntity.ok(v);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<VehiclesList>updateVehicle(@PathVariable("id")Integer id,@RequestBody VehiclesList vl){
      Vrep.save(vl);
      return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<VehiclesList> deleteVehicle(@PathVariable ("id")Integer id){
        Vrep.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
