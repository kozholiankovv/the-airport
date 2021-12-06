package com.solvdeducation.airport.cars;

import com.solvdeducation.airport.interfaces.IPassengerVehicle;

import java.util.List;

public class PassengerCar extends Car implements IPassengerVehicle {
    private List<Car> car;

    public PassengerCar(){

    }


    @Override
    public void boarding() {

    }

    @Override
    public void unBoarding() {

    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }
}

