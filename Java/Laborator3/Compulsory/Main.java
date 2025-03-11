interface PassengerCapable {
    void getPassengerCapacity();
}

interface CargoCapable {
    void getMaxPayload();
}



class Aircraft{
    protected String name;
    protected String model;
    protected int tailNR;

    public Aircraft(String name,String model,int tailNR) {
            this.name = name;
            this.model = model;
            this.tailNR = tailNR;
    }

    public int getTailNR() {
        return tailNR;
    }

    public void setTailNR(int tailNR) {
        this.tailNR = tailNR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

class Airliner extends Aircraft implements PassengerCapable {
    private int passengerCapacity;

    public Airliner(String name,String model,int tailNR,int passengerCapacity) {
        super(name,model,tailNR);
        this.passengerCapacity = passengerCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getPassengerCapacity() {
        System.out.println("Avionul "+ name + " poate cara " + passengerCapacity + " pasageri!");
    }

    @Override
    public String toString() {
        return "Airliner{" +
                "passengerCapacity=" + passengerCapacity +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", tailNR=" + tailNR +
                '}';
    }
}

class Drone extends Aircraft implements CargoCapable {
    private int maxPayload;

    public Drone(String name, String model, int tailNR, int maxPayload) {
        super(name, model, tailNR);
        this.maxPayload = maxPayload;
    }

    @Override
    public void getMaxPayload() {
            System.out.println("Avionul "+ name + " poate cara " + maxPayload + " incarcatura!");
    }

    @Override
    public String toString() {
        return "Drone{" +
                "maxPayload=" + maxPayload +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", tailNR=" + tailNR +
                '}';
    }
}

class Freighter extends Aircraft implements CargoCapable {
    private int maxPayload;
    private double batteryLife;

    public Freighter(String name, String model, int tailNR, int maxPayload, double batteryLife) {
        super(name, model, tailNR);
        this.maxPayload = maxPayload;
        this.batteryLife = batteryLife;
    }

    public Freighter(String name, String model, int tailNR, int maxPayload) {
        super(name,model,tailNR);
        this.maxPayload=maxPayload;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public void getMaxPayload() {
        System.out.println("Avionul "+ name + " poate cara " + maxPayload + " incarcatura!");
    }

    @Override
    public String toString() {
        return "Freighter{" +
                "maxPayload=" + maxPayload +
                ", batteryLife=" + batteryLife +
                ", tailNR=" + tailNR +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Aircraft[] listaAvioane = new Aircraft[4];
        Airliner airliner = new Airliner("Boeing", "7470", 660, 400);
        Freighter freighter = new Freighter("Boeing Freighter", "777", 102000, 400);
        Drone drone = new Drone("Phantom", "Phantom-4", 30, 50);


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
    }
}