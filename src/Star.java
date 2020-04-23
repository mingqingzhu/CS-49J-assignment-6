public class Star extends AstronomicalBody{
    public Star(double mass, String name) {
        super(mass, name);
    }

    @Override
    public void rotate() {
        System.out.println("Rotating around the center of a galaxy");
    }

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
