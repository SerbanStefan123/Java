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