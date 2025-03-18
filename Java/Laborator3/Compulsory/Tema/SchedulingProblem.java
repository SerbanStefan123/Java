import java.time.LocalTime;

class SchedulingProblem {
    public Airport airport;
    public Flight[] flights;

    public SchedulingProblem(Airport airport, Flight[] flights) {
        this.airport = airport;
        this.flights = flights;
    }

    public void scheduleFlights() {
        LocalTime[] runwayAvailability = new LocalTime[airport.getRunways().length];
        for (int i = 0; i < runwayAvailability.length; i++) {
            runwayAvailability[i] = LocalTime.MIN;
        }

        for (Flight flight : flights) {
            for (int i = 0; i < airport.getRunways().length; i++) {
                if (runwayAvailability[i].compareTo(flight.getLandingStart()) <= 0) {
                    System.out.println(flight + " -> " + airport.getRunways()[i]);
                    runwayAvailability[i] = flight.getLandingEnd();
                    break;
                }
            }
        }
    }
}
