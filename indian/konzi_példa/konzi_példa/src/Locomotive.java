// adattároló osztály
class Locomotive {
    private String identifier;
    private double speed;

    public Locomotive(String identifier, double speed) {
        this.identifier = identifier;
        this.speed = speed;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public double getSpeed() {
        return this.speed;
    }
}
