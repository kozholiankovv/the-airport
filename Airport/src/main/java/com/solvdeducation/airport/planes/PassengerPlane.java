package com.solvdeducation.airport.planes;

import com.solvdeducation.airport.employee.FlightAttendant;
import com.solvdeducation.airport.interfaces.IPassengerVehicle;

import java.util.List;

public class PassengerPlane extends Plane implements IPassengerVehicle {
    private FlightAttendant flightAttendant;
    private List<Plane> plane;

    public PassengerPlane(){

    }

    public FlightAttendant getFlightAttendant() {
        return flightAttendant;
    }

    public void setFlightAttendant(FlightAttendant flightAttendant) {
        this.flightAttendant = flightAttendant;
    }

    public List<Plane> getPlane() {
        return plane;
    }

    public void setPlane(List<Plane> plane) {
        this.plane = plane;
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

    @Override
    public void boarding() {


    }

    @Override
    public void unBoarding() {

    }
}
