package Gruppe1000;

import java.util.Objects;

// This class represents a single body with no other objects in orbit.
// A named body has a name and a mass in kilograms.
// Please, do not change this class definition!
//
public class NamedBody implements Massive {

    private String name;
    private double mass;

    // Initializes this body with name, mass and position.
    // Preconditions (need not be checked):
    // name != null, mass > 0, position != null
    public NamedBody(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    // Returns the name of 'this'.
    public String getName() {

        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NamedBody namedBody = (NamedBody) o;
        return Double.compare(namedBody.mass, mass) == 0 && Objects.equals(name, namedBody.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mass);
    }

    // Returns a readable representation of 'this' with the name of the body and its mass.
    public String toString() {
        return name + ": " + mass + " kg.";
    }

    @Override
    public double getMass() {
        return mass;
    }
}

