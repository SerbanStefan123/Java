class Runway {
    public String id;

    public Runway(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Runway{" + "id='" + id + '\'' + '}';
    }
}
