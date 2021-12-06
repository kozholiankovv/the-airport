package com.solvdeducation.airport.exceptions;

public class ToLowFlightHours extends Exception{
    public ToLowFlightHours() {
        super("Flight hours to low for Pilot");

    }
}
