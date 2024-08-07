package dev.conchy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlanetTest {

    private Planet planet;

    @BeforeEach
    void setup(){
        planet = new Planet("Earth", 1, 5.972E24, 1.08321E12, 12742, 149597870, PlanetType.TERRESTRE, true, 365.25, 1);
    }


    @Test
    void testCalculateDensity() {
        double expectedDensity = planet.getMass() / planet.getVolume();
        assertEquals(expectedDensity, planet.calculateDensity());
    }

    @Test
    void testGetAverageDistanceToSun() {
        assertEquals(149597870, planet.getAverageDistanceToSun());
    }

    @Test
    void testGetDiameter() {
        assertEquals(12742, planet.getDiameter());
    }

    @Test
    void testGetMass() {
        assertEquals(5.972E24, planet.getMass());
    }

    @Test
    void testGetName() {
        assertEquals("Earth", planet.getName());
    }

    @Test
    void testGetOrbitalPeriod() {
        assertEquals(365.25, planet.getOrbitalPeriod());
    }

    @Test
    void testGetPlanetType() {
        assertEquals(PlanetType.TERRESTRE, planet.getPlanetType());
    }

    @Test
    void testGetRotationPeriod() {
        assertEquals(1, planet.getRotationPeriod());
    }

    @Test
    void testGetSatellites() {
        assertEquals(1, planet.getSatellites());
    }

    @Test
    void testGetVolume() {
        assertEquals(1.08321E12, planet.getVolume());
    }

    @Test
    void testIsExterior() {
     assertFalse(planet.isExterior());
    }

    @Test
    void testIsObservable() {
        assertTrue(planet.isObservable());
    }

    @Test
    void testSetAverageDistanceToSun() {
        planet.setAverageDistanceToSun(778547200);
        assertEquals(778547200, planet.getAverageDistanceToSun());
    }

    @Test
    void testSetDiameter() {
        planet.setDiameter(142984);
        assertEquals(142984, planet.getDiameter());
    }

    @Test
    void testSetMass() {
        planet.setMass(1.898E27);
        assertEquals(1.898E27, planet.getMass());
    }

    @Test
    void testSetName() {
        planet.setName("Jupiter");
        assertEquals("Jupiter", planet.getName());
    }

    @Test
    void testSetObservable() {
        planet.setObservable(false);
        assertFalse(planet.isObservable());
    }

    @Test
    void testSetOrbitalPeriod() {
        planet.setOrbitalPeriod(4332.59);
        assertEquals(4332.59, planet.getOrbitalPeriod());
    }

    @Test
    void testSetPlanetType() {
        planet.setPlanetType(PlanetType.GASEOSO);
        assertEquals(PlanetType.GASEOSO, planet.getPlanetType());
    }

    @Test
    void testSetRotationPeriod() {
        planet.setRotationPeriod(0.41);
        assertEquals(0.41, planet.getRotationPeriod());
    }

    @Test
    void testSetSatellites() {
        planet.setSatellites(79);
        assertEquals(79, planet.getSatellites());
    }

    @Test
    void testSetVolume() {
        planet.setVolume(1.43128E15);
        assertEquals(1.43128E15, planet.getVolume());
    }

   @Test
   public void testToString() {
    Planet planet = new Planet("Earth", 1, 5.972e24, 1.08321e12, 12742, 149600000, 
                               PlanetType.TERRESTRE, true, 365.25, 1.0);
    
    String expected = "Planet [name: Earth, satellites: 1, mass: 5.972E24, volume: 1.08321E12, diameter: 12742, averageDistanceToSun: 149600000, type: TERRESTRE, observable: true, orbitalPeriod: 365.25, rotationPeriod: 1.0, density: 5.513243046131406E12, exterior: false]";
    
    assertEquals(expected, planet.toString());
}
}
