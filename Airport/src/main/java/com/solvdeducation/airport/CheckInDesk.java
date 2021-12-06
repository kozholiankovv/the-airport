package com.solvdeducation.airport;

import com.solvdeducation.airport.interfaces.ICheckin;
import com.solvdeducation.airport.exceptions.ToHighBaggageWeight;
import com.solvdeducation.airport.persons.Person;
import org.apache.log4j.Logger;

public class CheckInDesk implements ICheckin {
    private static final Logger log = Logger.getLogger(CheckInDesk.class);
    private String company;
    private String type;
    private Person employee;
    private int value;
    private int scales;

    public void baggage(int weight) throws ToHighBaggageWeight {
        log.info("Weight input");
        if (weight > 24) {
            throw new ToHighBaggageWeight("Your baggage is overweight");
        }

    }

    public int getScales() {
        return scales;
    }

    public void setScales(int scales) {
        this.scales = scales;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Person getEmployee() {
        return employee;
    }

    public void setEmployee(Person employee) {
        this.employee = employee;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void baggagecheckin() {

    }

    @Override
    public void baggageweighing() {

    }

    @Override
    public void CheckInPassenger() {

    }
}