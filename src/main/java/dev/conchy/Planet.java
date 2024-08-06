package dev.conchy;

public class Planet {

    private String name = null;
    private int satellites = 0;
    private double mass = 0;
    private double volume = 0;
    private int diameter = 0;
    private int averageDistanceToSun = 0;
    private PlanetType planetType;
    private boolean observable;
    private double orbitalPeriod;
    private double rotationPeriod;

    public Planet() {
    }

    public Planet(String name, int satellites, double mass, double volume, int diameter, int averageDistanceToSun,
            PlanetType planetType, boolean observable, double orbitalPeriod, double rotationPeriod) {
        this.name = name;
        this.satellites = satellites;
        this.mass = mass;
        this.volume = volume;
        this.diameter = diameter;
        this.averageDistanceToSun = averageDistanceToSun;
        this.planetType = planetType;
        this.observable = observable;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatellites() {
        return satellites;
    }

    public void setSatellites(int satellites) {
        this.satellites = satellites;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getAverageDistanceToSun() {
        return averageDistanceToSun;
    }

    public void setAverageDistanceToSun(int averageDistanceToSun) {
        this.averageDistanceToSun = averageDistanceToSun;
    }

    public PlanetType getPlanetType() {
        return planetType;
    }

    public void setPlanetType(PlanetType planetType) {
        this.planetType = planetType;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public double getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(double rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public double calculateDensity() {
        return mass / volume;
    }

    public boolean isExterior() {
        double distanceInKm = averageDistanceToSun * 149597870;
        return distanceInKm > 3.4 * 149597870;
    }

    @Override
    public String toString() {
        return "Planet [name: " + name + ", satellites: " + satellites + ", mass: " + mass + ", volume: " + volume
                + ", diameter: " + diameter + ", averageDistanceToSun: " + averageDistanceToSun + ", type: "
                + planetType + ", observable: " + observable + ", orbitalPeriod: " + orbitalPeriod + ", rotationPeriod: "
                + rotationPeriod + ", density: " + calculateDensity() + ", exterior: " + isExterior() + "]";
    }

}