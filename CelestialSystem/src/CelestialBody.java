import java.util.Objects;

// A single celestial body (regarded as the the most simple celestial system).
// A celestial body has a name and a mass in kg.
// This class implements CelestialSystem.
//
public class CelestialBody implements CelestialSystem
{

    String name;
    double mass;

    public CelestialBody(String name, double mass){
        this.name = name;
        this.mass = mass;
    }

    // Returns 'true' if and only if 'this' and 'o' have the same name.
    public boolean equals(Object o) {
        // TODO: implement method.
        if (this == o) return true;
        if (o == null || !this.getClass().equals(o.getClass())) return false;
        return  this.name.equals(((CelestialBody) o).name) && this.mass == ((CelestialBody) o).mass;
    }

    @Override
    public CelestialSystem merge(CelestialSystem celestialSystem) {
        return new BinaryCelestialSystem(this,celestialSystem);
    }

    @Override
    public double getMass() {
        return this.mass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mass);
    }

    @Override
    public String toString() {
        return "{"  + name +", "+ mass +
                '}';
    }
}
