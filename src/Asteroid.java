/**
 * an asteroid type of astronomical body
 */
public class Asteroid extends AstronomicalBody {
    /**
     * construct an asteroid with given name and mass
     * @param mass the given mass
     * @param name the given name
     */
    public Asteroid(double mass, String name) {
        super(mass, name);
    }

    /**
     * construct an asteroid with given mass
     * @param mass the given mass
     */
    public Asteroid(double mass) {
        super(mass, "");
    }
}
