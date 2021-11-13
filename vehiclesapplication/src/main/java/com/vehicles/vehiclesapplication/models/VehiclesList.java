package com.vehicles.vehiclesapplication.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "vehicles_list")
public class VehiclesList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private Integer year;

    @Column(name = "country")
    private String country;

    @Column(name = "consumption")
    private double consumption;

    public VehiclesList() {
    }

    public VehiclesList(Integer id, String make, String model, Integer year, String country, double consumption) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.country = country;
        this.consumption = consumption;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getConsumption() {
        return this.consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "VehiclesList{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", consumption=" + consumption +
                '}';
    }
}
