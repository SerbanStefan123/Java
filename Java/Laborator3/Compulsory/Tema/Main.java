import java.time.LocalTime;

interface PassengerCapable {
    void getPassengerCapacity();
}

interface CargoCapable {
    void getMaxPayload();
}

public class Main {
    public static void main(String[] args) {
        Aircraft[] listaAvioane = new Aircraft[4];
        Airliner airliner = new Airliner("Airliner", "444", 660, 400);
        Freighter freighter = new Freighter("Freighter", "777", 102000, 400);
        Drone drone = new Drone("Drona", "20", 30, 50);


        listaAvioane[0]=airliner;
        listaAvioane[1]=freighter;
        listaAvioane[2]=drone;

        for(Aircraft aircraft : listaAvioane){
            if(aircraft instanceof PassengerCapable){
                ((PassengerCapable) aircraft).getPassengerCapacity();
            }
            if(aircraft instanceof CargoCapable){
                ((CargoCapable) aircraft).getMaxPayload();
            }
        }

        System.out.println(airliner);
        System.out.println(freighter);
        System.out.println(drone);
        System.out.println("");

        Runway[] runways = {new Runway("Pista1"), new Runway("Pista2")};
        Airport airport = new Airport("Aeroport Iasi", runways);

        Flight[] flights = {
                new Flight("Zbor1", LocalTime.of(10, 0), LocalTime.of(10, 30)),
                new Flight("Zbor2", LocalTime.of(10, 15), LocalTime.of(10, 45)),
                new Flight("Zbor3", LocalTime.of(10, 30), LocalTime.of(11, 0)),
                new Flight("Zbor4", LocalTime.of(10, 45), LocalTime.of(11, 15))
        };

        SchedulingProblem schedulingProblem = new SchedulingProblem(airport, flights);
        schedulingProblem.scheduleFlights();
    }
}