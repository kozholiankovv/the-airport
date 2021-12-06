package com.solvdeducation.airport.functionalBuildings;

import java.util.List;

abstract public class Terminals {
    private String type;
    private String name;
    private List<Gates> gates;



    public Terminals(){

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

    public List<Gates> getGates() {
        return gates;
    }

    public void setGates(List<Gates> gates) {
        this.gates = gates;
    }
}
