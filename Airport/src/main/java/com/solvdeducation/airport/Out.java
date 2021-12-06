package com.solvdeducation.airport;


import com.solvdeducation.airport.cars.PassengerCar;
import com.solvdeducation.airport.cars.TechnicalCar;
import com.solvdeducation.airport.employee.FlightAttendant;
import com.solvdeducation.airport.employee.Pilot;
import com.solvdeducation.airport.functionalBuildings.CargoTerminal;
import com.solvdeducation.airport.functionalBuildings.PassengerTerminal;
import com.solvdeducation.airport.planes.CargoPlane;
import com.solvdeducation.airport.planes.PassengerPlane;
import com.solvdeducation.airport.ticketReserve.Buyer;
import com.solvdeducation.airport.ticketReserve.Flights;
import com.solvdeducation.airport.ticketReserve.Tickets;
import com.solvdeducation.airport.exceptions.*;
import com.solvdeducation.airport.generics.Cars;
import com.solvdeducation.airport.generics.Hangar;
import com.solvdeducation.airport.generics.Team;
import org.apache.log4j.Logger;


public class Out {
   private static final Logger log = Logger.getLogger(Out.class);

    public static void main(String[] args) {

        Buyer b = new Buyer();
        Flights f = new Flights();
        Tickets q = new Tickets();
        CheckInDesk cb = new CheckInDesk();
        Pilot fh = new Pilot();
        try {
            b.testAge(17);
            cb.baggage(21);
            f.flight("Budapest");
            q.tickets("Economy");
            fh.flights(5000);
        } catch (LowAgeException ex) {
            log.error("Buyer age to low");


        } catch (ToHighBaggageWeight toHighBaggageWeight) {
            log.error("High baggage weight");


        } catch (FlightNonFound flightNonFound) {
            log.error("Flight non found");


        } catch (WrongTicketClass wrongTicketClass) {
            log.error("Wrong ticket class");


        } catch (ToLowFlightHours toLowFlightHours) {
            log.error("Low flight hours");

        }
        CargoTerminal cargoTerminal = new CargoTerminal();
        PassengerTerminal passengerTerminal = new PassengerTerminal();

        CargoPlane cargoPlane = new CargoPlane();
        PassengerPlane passengerPlane = new PassengerPlane();

        //Hangar test1 = new Hangar(cargoPlane,cargoTerminal);

        Hangar<CargoPlane, CargoTerminal> test = new Hangar<CargoPlane, CargoTerminal>(cargoPlane, cargoTerminal);
        Hangar<PassengerPlane, PassengerTerminal> test1 = new Hangar<PassengerPlane, PassengerTerminal>(passengerPlane, passengerTerminal);
        test.getPlanes().baggageloading();
        test1.getPlanes().boarding();

        Pilot pilot1 = new Pilot();
        Pilot pilot2 = new Pilot();
        FlightAttendant flightAttendant = new FlightAttendant();

        Team<FlightAttendant, Pilot, Pilot> team = new Team<FlightAttendant, Pilot, Pilot>(pilot2, pilot1, flightAttendant);
        team.getFlightAttedant().talking();
        team.getPilot1().talking();
        team.getPilot2().talking();

        PassengerCar passengerCar = new PassengerCar();
        TechnicalCar technicalCar = new TechnicalCar();
        Cars<PassengerCar, TechnicalCar> cars = new Cars<PassengerCar, TechnicalCar>(passengerCar, technicalCar);
        cars.getPassenger().boarding();
        cars.getTechnical().drive();


    }
}