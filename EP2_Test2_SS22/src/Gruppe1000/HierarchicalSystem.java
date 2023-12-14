package Gruppe1000;

import javax.lang.model.util.SimpleElementVisitor6;
import java.util.*;

// A hierarchical system of named bodies consisting of cosmic systems.
// 'HierarchicalSystem' is subtype of CosmicSystem.
//
// TODO: Implementation of this class.
//  You can use the Java-Collection framework in your implementation.
//
public class HierarchicalSystem implements CosmicSystem{

    // TODO: Define missing parts of the class.
    //  Further methods can be added if necessary (but no setters or
    //  getters that return or set just the value of a variable).

    CosmicSystem[] systems;
    // Initializes 'this' with subsystems.
    // Precondition: systems != null && systems.length > 1.
    public HierarchicalSystem(CosmicSystem... systems) {
        this.systems= systems;
    }

    @Override
    public BodyIterator iterator() {
        return new BodyIterator() {
            int i = 0;
            BodyIterator itr = systems[i].iterator();
            @Override
            public NamedBody next() throws NoSuchElementException {
                if (!hasNext()) throw new NoSuchElementException("no more");
                if (itr.hasNext()) return itr.next();
                else {
                    itr = systems[++i].iterator();
                    return itr.next();
                }
            }

            @Override
            public boolean hasNext() {
                return itr.hasNext() || (i+1) < systems.length;
            }
        };
    }

    @Override
    public Massive asMassive() {
        return new OtherMassiveHugeBig(this);
    }

    class OtherMassiveHugeBig implements Massive{

        CosmicSystem[] systems;

        public OtherMassiveHugeBig(HierarchicalSystem system){
            this.systems = system.systems;
        }

        @Override
        public double getMass() {
            double mass = 0;
            for (int i=0; i<systems.length; i++){
                Massive massive = systems[i].asMassive();
                mass = mass + massive.getMass();
            }
            return mass;
        }
    }

    @Override
    // Returns 'true' if 'this' and 'obj' are equal, i.e., if 'this' and 'obj' have equal
    // subsystems with equal hierarchical structure, however regardless of the order
    // in which subsystems appear at each level of the system.
    // This means the method returns 'true' if the number of subsystems is
    // the same in 'this' and 'obj' and every subsystem of the specified system is equal to one
    // in 'this' (or equivalently, every subsystem of 'this' is equal to one in the specified
    // system). Otherwise 'false' is returned.
    public boolean equals(Object obj) {
        // TODO: implement method.
        if (this == obj) return true;
        if (this.getClass() != obj.getClass() || obj == null) return false;
        HierarchicalSystem system1 = (HierarchicalSystem) obj;
        return system1.compare(this) && this.compare(system1);
    }

    public boolean compare(HierarchicalSystem system1){
        for (int i=0; i < this.systems.length; i++){
            if (!system1.find(this.systems[i])){
                return false;
            }
        }
        return true;
    }

    public boolean find(CosmicSystem system){
        for (int i=0; i< this.systems.length; i++){
            if (system.equals(this.systems[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    // Returns the hash code of 'this'.
    public int hashCode() {
        // TODO: implement method.
        return Objects.hashCode(systems.length);
    }

    @Override
    public String toString() {
        return "HierarchicalSystem{" +
                "systems=" + Arrays.toString(systems) +
                '}';
    }
}

//TODO: Define additional class(es) if needed (either here or in a separate file).
