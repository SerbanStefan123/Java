import java.time.LocalTime;

class Flight {
    public String flightNumber;
    public LocalTime landingStart;
    public LocalTime landingEnd;

    public Flight(String flightNumber, LocalTime landingStart, LocalTime landingEnd) {
        this.flightNumber = flightNumber;
        this.landingStart = landingStart;
        this.landingEnd = landingEnd;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public LocalTime getLandingStart() {
        return landingStart;
    }

    public LocalTime getLandingEnd() {
        return landingEnd;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setLandingEnd(LocalTime landingEnd) {
        this.landingEnd = landingEnd;
    }

    public void setLandingStart(LocalTime landingStart) {
        this.landingStart = landingStart;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", landingStart=" + landingStart +
                ", landingEnd=" + landingEnd +
                '}';
    }
}