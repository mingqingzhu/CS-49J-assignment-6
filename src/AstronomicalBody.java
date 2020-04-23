/**
 *
 */
public class AstronomicalBody {
    protected double mass;
    protected String name;

    public AstronomicalBody(double mass, String name) {
        this.mass = mass;
        this.name = name;
    }

    public void rotate() {
        System.out.println("Rotating around a star");
    }
}
