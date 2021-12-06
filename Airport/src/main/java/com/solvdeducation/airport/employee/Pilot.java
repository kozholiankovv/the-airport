package com.solvdeducation.airport.employee;

import com.solvdeducation.airport.persons.Person;
import com.solvdeducation.airport.exceptions.ToLowFlightHours;
import org.apache.log4j.Logger;

public class Pilot extends Person {
    static final Logger log = Logger.getLogger(Pilot.class);
    private String rank;
    private int flightHours;

    public Pilot(){

    }

    public void flights(int flightHours) throws ToLowFlightHours {
        log.info("Person flight hours");
        if (flightHours < 3000)
            throw new ToLowFlightHours();

    }


    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(int flightHours) {
        this.flightHours = flightHours;
    }

}
