package com.solvdeducation.airport.generics;

import com.solvdeducation.airport.persons.Person;
import org.apache.log4j.Logger;

public class Team <X extends Person, Y extends Person, Z extends Person>{
    private static final Logger log = Logger.getLogger(Team.class);
    private Y pilot1;
    private Z pilot2;
    private X flightAttedant;

    public Team(Y pilot1, Z pilot2, X flightAttedant) {
        this.pilot1 = pilot1;
        this.pilot2 = pilot2;
        this.flightAttedant = flightAttedant;
    }

    public Y getPilot1() {
        return pilot1;
    }

    public void setPilot1(Y pilot1) {
        this.pilot1 = pilot1;
    }

    public Z getPilot2() {
        return pilot2;
    }

    public void setPilot2(Z pilot2) {
        this.pilot2 = pilot2;
    }

    public X getFlightAttedant() {
        return flightAttedant;
    }

    public void setFlightAttedant(X flightAttedant) {
        this.flightAttedant = flightAttedant;
    }
}
