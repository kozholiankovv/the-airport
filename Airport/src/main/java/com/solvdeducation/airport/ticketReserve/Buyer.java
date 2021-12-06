package com.solvdeducation.airport.ticketReserve;

import com.solvdeducation.airport.persons.Person;
import com.solvdeducation.airport.exceptions.LowAgeException;
import org.apache.log4j.Logger;

public class Buyer extends Person {
    private static final Logger log = Logger.getLogger(Buyer.class);
    public Buyer() {

    }
    public Buyer(int age){

    }
    public void testAge(int age) throws LowAgeException {
        log.info("Age input");
        if (age < 18)
        {
            throw new LowAgeException();
        }


    }
}