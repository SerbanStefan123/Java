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