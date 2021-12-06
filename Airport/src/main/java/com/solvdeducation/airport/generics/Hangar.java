package com.solvdeducation.airport.generics;

import com.solvdeducation.airport.functionalBuildings.Terminals;
import com.solvdeducation.airport.planes.Plane;
import org.apache.log4j.Logger;

public class Hangar <T extends Plane, Y extends Terminals> {
    private static final Logger log = Logger.getLogger(Cars.class);
    private T planes;
    private Y terminal;

    public Hangar() {

    }

    public void parking(){

    }


    public Hangar(T planes, Y terminal) {
        this.planes = planes;
        this.terminal = terminal;


    }

    public T getPlanes() {
        return planes;
    }

    public void setPlanes(T planes) {
        this.planes = planes;
    }

    public Y getTerminal() {
        return terminal;
    }

    public void setTerminal(Y terminal) {
        this.terminal = terminal;
    }
}


