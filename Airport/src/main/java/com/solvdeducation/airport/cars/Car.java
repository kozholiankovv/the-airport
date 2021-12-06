package com.solvdeducation.airport.cars;

import com.solvdeducation.airport.interfaces.IDrive;
import com.solvdeducation.airport.interfaces.Refueling;
import com.solvdeducation.airport.persons.Person;

abstract public class Car implements IDrive, Refueling {
    private String color;
    private Person driver;
    private int engine;
    private String type;
    private String model;
    private Integer productionYear;
    private int volume;
    private int seats;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", volume=" + volume +
                ", seats=" + seats +
                '}';
    }

    public Car(){

    }

    public Car(String color, Person driver, int engine, String type, String model, Integer productionYear, int volume, int seats) {
        this.color = color;
        this.driver = driver;
        this.engine = engine;
        this.type = type;
        this.model = model;
        this.productionYear = productionYear;
        this.volume = volume;
        this.seats = seats;
    }

    @Override
        public void refuel() {

        }

        @Override
    public void drive() {


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
