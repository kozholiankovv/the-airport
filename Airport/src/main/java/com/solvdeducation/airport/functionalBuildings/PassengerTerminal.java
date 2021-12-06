package com.solvdeducation.airport.functionalBuildings;

public class PassengerTerminal extends Terminals {
    private String checkinDesk;
    private String ticketBox;
    private String waitingHall;
    private String loungeZone;

    public PassengerTerminal(){

}


    public String getCheckinDesk() {
        return checkinDesk;
    }

    public void setCheckinDesk(String checkinDesk) {
        this.checkinDesk = checkinDesk;
    }

    public String getTicketBox() {
        return ticketBox;
    }

    public void setTicketBox(String ticketBox) {
        this.ticketBox = ticketBox;
    }

    public String getWaitingHall() {
        return waitingHall;
    }

    public void setWaitingHall(String waitingHall) {
        this.waitingHall = waitingHall;
    }

    public String getLoungeZone() {
        return loungeZone;
    }

    public void setLoungeZone(String loungeZone) {
        this.loungeZone = loungeZone;
    }
}
