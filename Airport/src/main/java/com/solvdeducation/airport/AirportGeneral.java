package com.solvdeducation.airport;

public class AirportGeneral {
    private String type;
    private String name;
    private String location;
    private int airportClass;
    private int constructionYear;



    public AirportGeneral() {

    }


    public String getType() {
        return type;

    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAirportClass() {
        return airportClass;
    }

    public void setAirportClass(int airportClass) {
        this.airportClass = airportClass;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

}
