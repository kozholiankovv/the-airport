package com.solvdeducation.airport.ticketReserve;

import com.solvdeducation.airport.exceptions.WrongTicketClass;
import com.solvdeducation.airport.functionalBuildings.Gates;
import com.solvdeducation.airport.functionalBuildings.Terminals;
import com.solvdeducation.airport.persons.Passenger;
import com.solvdeducation.airport.planes.Plane;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.Objects;

public class Tickets {
    private static final Logger log = Logger.getLogger(Tickets.class);
    private int id;
    private int seat;
    private Date date;
    private Passenger passenger;
    private Plane plane;
    private Terminals terminal;
    private Gates gate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tickets tickets = (Tickets) o;
        return id == tickets.id && seat == tickets.seat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seat);
    }

    public Tickets() {

    }

    public void tickets(String ticketClass) throws WrongTicketClass {
        log.info("Choose Class");
        if ("Economy".equalsIgnoreCase(ticketClass)) {

        } else {
            throw new WrongTicketClass("Ticket for economy class not found");

        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Terminals getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminals terminal) {
        this.terminal = terminal;
    }

    public Gates getGate() {
        return gate;
    }

    public void setGate(Gates gate) {
        this.gate = gate;
    }



}

