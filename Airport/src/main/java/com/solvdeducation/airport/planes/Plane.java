package com.solvdeducation.airport.planes;

import com.solvdeducation.airport.employee.Pilot;
import com.solvdeducation.airport.interfaces.IDrive;
import com.solvdeducation.airport.interfaces.IFly;
import com.solvdeducation.airport.interfaces.Refueling;

import java.util.List;


abstract public class Plane implements IDrive, IFly, Refueling {
    private String model;
    private String type;
    private List<Pilot> pilot;
    private String aviaCompany;
    private int teamValue;
    private int seats;


    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", pilot=" + pilot +
                ", AviaCompany='" + aviaCompany + '\'' +
                ", teamValue=" + teamValue +
                ", seats=" + seats +
                '}';
    }

    @Override
    public abstract void touchdown();

    @Override
    public abstract void refuel();

    @Override
    public abstract void takeoff();

    @Override
    public abstract void fly();

    @Override
    public abstract void drive();


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Pilot> getPilot() {
        return pilot;
    }

    public void setPilot(List<Pilot> pilot) {
        this.pilot = pilot;
    }

    public String getAviaCompany() {
        return aviaCompany;
    }

    public void setAviaCompany(String aviaCompany) {
        this.aviaCompany = aviaCompany;
    }

    public int getTeamValue() {
        return teamValue;
    }

    public void setTeamValue(int teamValue) {
        this.teamValue = teamValue;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
