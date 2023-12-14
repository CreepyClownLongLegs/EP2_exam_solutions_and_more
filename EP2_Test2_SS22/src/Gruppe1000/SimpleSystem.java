package Gruppe1000;

import java.util.*;

// An unstructured, unordered system of cosmic bodies.
// 'SimpleSystem' is subtype of 'CosmicSystem'.
//
// TODO: Implementation of this class.
//  You can use the Java-Collection framework in your implementation.
//
public class SimpleSystem implements CosmicSystem{

    // TODO: Define missing parts of the class.
    //  Further methods can be added if necessary (but no setters or
    //  getters that return or set just the value of a variable).

    List<NamedBody> system = new LinkedList<>();

    // Initializes this system with its bodies.
    // Precondition: bodies != null && bodies.length > 0.
    public SimpleSystem(NamedBody... bodies) throws NoSuchElementException {
        if (bodies != null && bodies.length > 0) {
            system.addAll(List.of(bodies));
        }else throw new NoSuchElementException("Ya, compiler");
    }

    // Adds a body to 'this'.
    // Precondition: toAdd != null.
    public void add(NamedBody toAdd) {
        // TODO: implement method.
        system.add(toAdd);
    }

    @Override
    public String toString() {
        return system.toString();
    }

    @Override
    public BodyIterator iterator() {
        return new BodyIterator() {
            Iterator<NamedBody> itr = system.iterator();
            @Override
            public NamedBody next() {
                return itr.next();
            }

            @Override
            public boolean hasNext() {
                return itr.hasNext();
            }
        };
    }

    @Override
    public Massive asMassive() {
        return new MassiveBigHuge(this);
    }

    class MassiveBigHuge implements Massive{

        List<NamedBody> system = new LinkedList<>();

        public MassiveBigHuge(SimpleSystem system){
            this.system= system.system;
        }

        @Override
        public double getMass() {
            Iterator<NamedBody> itr = system.iterator();
            double allMass=0;
            while (itr.hasNext()){
                allMass = allMass + itr.next().getMass();
            }
            return allMass;
        }
    }

    @Override
    // Returns 'true' if 'this' and 'obj' are equal, i.e. if and only if 'this' and 'obj'
    // have the same set of bodies (regardless of the order specified in the constructor's
    // 'bodies' parameter).
    public boolean equals(Object obj) {
        // TODO: implement method.
        if (this == obj) return true;
        if (obj ==null || obj.getClass() != this.getClass()) return false;
        SimpleSystem obj1 = (SimpleSystem) obj;
        return obj1.compare(this) && this.compare(obj1);
    }

    public boolean compare(SimpleSystem system1){
        boolean thesame = true;
        int i=0;
        while (i< system1.system.size()){
            if (!this.find(system1.system.get(i))){
                return false;
            }
            i++;
        }
        return true;
    }

    public boolean find(NamedBody body){
        int i=0;
        while (i < system.size()){
            if (body.equals(system.get(i))){
                return true;
            }
            i++;
        }
        return false;
    }

    @Override
    // Returns the hash code of 'this'.
    public int hashCode() {
        // TODO: implement method.
        return Objects.hashCode(this.system.size());
    }
}

//TODO: Define additional class(es) if needed (either here or in a separate file).