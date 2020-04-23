/**
 * a star type of astronomical body
 */
public class Star extends AstronomicalBody{
    /**
     * construct a star with given mass and name
     * @param mass the given mass
     * @param name the given name
     */
    public Star(double mass, String name) {
        super(mass, name);
    }

    /**
     * print the rotating information
     */
    @Override
    public void rotate() {
        System.out.println("Rotating around the center of a galaxy");
    }

    /**
     * to check if two stars are equal
     * @param obj the other star to be compared
     * @return true if two stars have same mass and name
     *         false if either of the condition is not met
     */
    @Override
    public boolean equals(Object obj) {
        Star other = (Star) obj;
        if(this.mass == other.mass && this.name.equals(other.name)) {
            return true;
        } else {
            return false;
        }
    }
}
