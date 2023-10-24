// adattároló osztály
class Station {
    private String name;
    private double latitude;
    private double longitude;

    public Station(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
