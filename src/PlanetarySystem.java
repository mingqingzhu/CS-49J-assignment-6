import java.util.ArrayList;

public class PlanetarySystem extends ArrayList<AstronomicalBody> {
    private Star star;

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

    public double getTotalMass() {
        double sum = 0;
        for (int i = 0; i < this.size(); i++) {
            sum += this.get(i).mass;
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        PlanetarySystem other = (PlanetarySystem) o;
        if((this.star.equals(other.star)) && (this.getTotalMass() == other.getTotalMass()) && (this.size() == other.size())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "This planetary system has a star " + star.name + " of mass " + star.mass + ".\n" +
                "The total mass of this planetary system is: " + getTotalMass() + ".\n";
    }
}
