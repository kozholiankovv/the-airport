package com.solvdeducation.airport.generics;

import com.solvdeducation.airport.cars.Car;
import org.apache.log4j.Logger;

public class Cars <Z extends Car, X extends Car>{
    private static final Logger log = Logger.getLogger(Cars.class);
    private Z passenger;
    private X technical;

    public Z getPassenger() {
        return passenger;
    }

    public void setPassenger(Z passenger) {
        this.passenger = passenger;
    }

    public X getTechnical() {
        return technical;
    }

    public void setTechnical(X technical) {
        this.technical = technical;
    }

    public Cars(Z passenger, X technical) {
        this.passenger = passenger;
        this.technical = technical;


    }
}
