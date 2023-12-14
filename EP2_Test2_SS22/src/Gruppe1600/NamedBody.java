package Gruppe1600;
// This class represents a single body with no other objects in orbit.
// A named body has a name and a mass in kilograms.
//
public class NamedBody {

    //TODO: declare variables.

    // Initialises this body with name, mass and position.
    // Preconditions (need not be checked):
    // name != null, mass > 0
    public NamedBody(String name, double mass) {
        // TODO: implement constructor.
    }

    // Returns the name of 'this'.
    public String getName() {
        // TODO: implement method.
        return "";
    }

    // Returns the mass of 'this'.
    public double getMass() {
        // TODO: implement method.
        return 0;
    }

    // Returns a readable representation of 'this' with the name of the body and its mass.
    public String toString() {
        // TODO: implement method.
        return "";
    }

    // Returns a new body which represents the result of merging 'b' and 'this'.
    // The result has the name of 'this' if 'this' has more mass than 'b', otherwise
    // it has the name of 'b'. The mass of the result corresponds to the sum of the
    // masses of 'b' and 'this'. Bodies 'this' and 'b' must not be modified.
    public NamedBody merge(NamedBody b) {
        // TODO: implement method.
        return null;
    }
}





