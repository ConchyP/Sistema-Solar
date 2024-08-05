package dev.conchy;

import dev.conchy.enums.*;

public final class AppPlanet {
    private AppPlanet() {
    }


    public static void main(String[] args) {

         Planet earth = new Planet(
            "Earth",  1,  5.97e24, 1.08e12, 12742, 149600000, PlanetType.TERRESTRE, true, 365.25, 1.0);
            System.out.println(earth);

        Planet venus = new Planet(
            "Venus", 0, 4.8675e24, 9.2843e11, 12104, 108200000, PlanetType.TERRESTRE, true, 224.7, 243.0);
            System.out.println(venus);

        Planet saturn = new Planet("Saturn", 82, 5.6834e26, 8.2713e14, 116460, 1433000000, PlanetType.GASEOSO, true, 10759.22, 0.444);
        System.out.println(saturn);

    }
}
