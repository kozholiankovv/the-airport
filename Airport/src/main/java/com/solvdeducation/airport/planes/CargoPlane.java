package com.solvdeducation.airport.planes;

import com.solvdeducation.airport.interfaces.ICargo;

import java.util.List;

public class CargoPlane extends Plane implements ICargo {
    private int capacity;
    private List<Plane> plane;


    @Override
    public void baggageloading() {


    }

    @Override
    public void baggageuploading() {

    }

    @Override
    public void takeoff() {

    }

    @Override
    public void touchdown() {

    }

    @Override
    public void refuel() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void drive() {

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Plane> getPlane() {
        return plane;
    }

    public void setPlane(List<Plane> plane) {
        this.plane = plane;
    }
}
