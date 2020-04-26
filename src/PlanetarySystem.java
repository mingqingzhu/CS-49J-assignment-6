import java.util.ArrayList;

/**
 * a planetary system that holds many astronomical body
 */
public class PlanetarySystem extends ArrayList<AstronomicalBody> {
    private Star star;

    /**
     * add an astronomical body into this system
     * @param ab the astronomical body to be added into the system
     * @return true if ab is not a Star object, or ab is a Star object and instance variable Star star has not been set yet
     *         return false if ab is a Star object and instance variable Star star has already been set.
     */
    @Override
    public boolean add(AstronomicalBody ab) {
        if(!(ab instanceof Star)) {
            super.add(ab);
            return true;
        } else if ((ab instanceof Star) && (star == null)) {
            super.add(ab);
            this.star = (Star)ab;
            return true;
        } else {
            return false;
        }
    }

    /**
     * get the sum of the mass of every astronomical body in the systhem
     * @return sum of the total mass
     */
    public double getTotalMass() {
        double sum = 0;
        for (int i = 0; i < this.size(); i++) {
            sum += this.get(i).mass;
        }
        return sum;
    }

    /**
     * to check if two planetary system are equal
     * @param o the other planetary system to be compared
     * @return true if their stars are equal and total mass are equal and number of added astronomical body are equal
     *         false if one of these three condition is not met
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof PlanetarySystem) {
            PlanetarySystem other = (PlanetarySystem) o;
            if((this.star.equals(other.star)) && (this.getTotalMass() == other.getTotalMass()) && (this.size() == other.size())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * describe this planetary system
     * @return the information about this planetary system
     */
    @Override
    public String toString() {
        return "This planetary system has a star " + star.name + " of mass " + star.mass + ".\n" +
                "The total mass of this planetary system is: " + getTotalMass() + ".\n";
    }
}
