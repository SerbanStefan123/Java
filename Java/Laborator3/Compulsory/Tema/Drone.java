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