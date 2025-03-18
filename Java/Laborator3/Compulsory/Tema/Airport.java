import java.util.Arrays;

class Airport {
    public String name;
    public Runway[] runways;

    public Airport(String name, Runway[] runways) {
        this.name = name;
        this.runways = runways;
    }

    public Runway[] getRunways() {
        return runways;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunways(Runway[] runways) {
        this.runways = runways;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", runways=" + Arrays.toString(runways) +
                '}';
    }
}