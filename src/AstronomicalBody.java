/**
 *class for an astronomical body
 */
public class AstronomicalBody {
    /**
     * mass of the astronomical body
     */
    protected double mass;
    /**
     * name of the astronomical body
     */
    protected String name;

    /**
     * constructs an astronomical body with given name and mass
     * @param mass the given mass for this astronomical body
     * @param name the given name for this astronomical body
     */
    public AstronomicalBody(double mass, String name) {
        this.mass = mass;
        this.name = name;
    }

    /**
     * print the rotating information
     */
    public void rotate() {
        System.out.println("Rotating around a star");
    }
}
