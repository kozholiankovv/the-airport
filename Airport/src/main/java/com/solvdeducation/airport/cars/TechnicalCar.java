package com.solvdeducation.airport.cars;

import com.solvdeducation.airport.interfaces.IDrive;
import com.solvdeducation.airport.interfaces.Refueling;

import java.util.List;

public class TechnicalCar extends Car implements IDrive, Refueling {
    private int capacity;
    private List<Car> car;

    public TechnicalCar(){

    }



    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }
}
