package com.solvdeducation.airport.ticketReserve;

import com.solvdeducation.airport.exceptions.FlightNonFound;
import org.apache.log4j.Logger;

import java.util.Date;

public class Flights {
    private static final Logger log = Logger.getLogger(Flights.class);
    private int id;
    private int price;
    private String depparture;
    private String arrivals;
    private Date date;
    private String aviaCompany;


    public Flights(){

    }
    public void flight(String arrivals) throws FlightNonFound {
        log.info("Arrival city");
        if ("Budapest".equalsIgnoreCase(arrivals)) {

        } else {
            throw new FlightNonFound();
        }



        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepparture() {
        return depparture;
    }

    public void setDepparture(String depparture) {
        this.depparture = depparture;
    }

    public String getArrivals() {
        return arrivals;
    }

    public void setArrivals(String arrivals) {
        this.arrivals = arrivals;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAviaCompany() {
        return aviaCompany;
    }

    public void setAviaCompany(String aviaCompany) {
        this.aviaCompany = aviaCompany;
    }
}
