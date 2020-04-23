/**
 * to test the functionality of PlanetarySystem class
 * main included
 */
public class PlanetarySystemTester {
    public static void main(String[] args) {
        Star sun = new Star(2000000, "sun");
        Star aldebaran = new Star(3000000, "Aldebaran");
        Planet earth = new Planet(195, "Earth");
        Asteroid noName = new Asteroid(3, "No Name");

        PlanetarySystem solarSystem = new PlanetarySystem();
        PlanetarySystem equalSystem = new PlanetarySystem();
        PlanetarySystem unequalSystem = new PlanetarySystem();

        solarSystem.add(sun);
        solarSystem.add(aldebaran);
        solarSystem.add(earth);
        solarSystem.add(noName);

        System.out.println(solarSystem.toString());

        equalSystem.add(sun);
        equalSystem.add(aldebaran);
        equalSystem.add(earth);
        equalSystem.add(noName);
        System.out.println("Compare solarSystem with equalSystem: " + equalSystem.equals(solarSystem) + ".\n");

        unequalSystem.add(sun);
        System.out.println("Compare solarSystem with unequalSystem: " + unequalSystem.equals(solarSystem) + ".\n");

    }
}
