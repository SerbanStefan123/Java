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