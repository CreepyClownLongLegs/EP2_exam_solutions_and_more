

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// A system consisting of two subsystems.
// This class implements CelestialSystem and BodyIterable.
//
public class BinaryCelestialSystem implements CelestialSystem, BodyIterable
{

    // TODO: define missing parts of this class.
    CelestialSystem p1;
    CelestialSystem p2;

    // Initializes this object, with two components. 'this' is a pair consisting of 'p1' and 'p2';
    // it contains all bodies of 'p1' and 'p2'.
    public BinaryCelestialSystem(CelestialSystem p1, CelestialSystem p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @java.lang.Override
    public BodyIterator iterator() {

        boolean p1isBody = true;
        boolean p2isBody = true;
        Iterator<CelestialBody> itr1 = null;
        Iterator<CelestialBody> itr2 = null;

        if (p1 instanceof BinaryCelestialSystem ){
            itr1 = ((BinaryCelestialSystem)p1).iterator();
        }

        if (p2 instanceof BinaryCelestialSystem){
            itr2 = ((BinaryCelestialSystem)p2).iterator();
        }

        BinaryCelestialSystem system = this;

        Iterator<CelestialBody> finalItr1 = itr1;
        Iterator<CelestialBody> finalItr2 = itr2;
        return new BodyIterator() {

            BinaryCelestialSystem system1 = system;

            boolean p1hasntbeen = true;
            boolean p2hasntbeen = true;
            @Override
            public boolean hasNext() {
                if (system1.p1 instanceof CelestialBody ){
                    if (p1hasntbeen) {
                        return p1hasntbeen;
                    }
                }
                if (system1.p1 instanceof BinaryCelestialSystem) {
                    if (finalItr1.hasNext()) {
                        return finalItr1.hasNext();
                    }
                }
                if (system1.p2 instanceof CelestialBody ){
                    if (p2hasntbeen) {
                        return p2hasntbeen;
                    }
                }
                if (system1.p2 instanceof BinaryCelestialSystem) {
                    if (finalItr2.hasNext()) {
                        return finalItr2.hasNext();
                    }
                }
                return false;
            }

                @Override
            public CelestialBody next() throws NoSuchElementException{
                if (!this.hasNext()) throw new NoSuchElementException("No more");
                    if (system1.p1 instanceof CelestialBody ){
                        if (p1hasntbeen) {
                            p1hasntbeen = false;
                            return (CelestialBody) p1;
                        }
                    }
                    if (system1.p1 instanceof BinaryCelestialSystem){
                        if (finalItr1.hasNext()){
                            return finalItr1.next();
                        }
                    }
                    if (system1.p2 instanceof CelestialBody ){
                        if (p2hasntbeen) {
                            p2hasntbeen=false;
                            return (CelestialBody) p2;
                        }
                    }
                    if (system1.p2 instanceof  BinaryCelestialSystem){
                        if (finalItr2.hasNext()){
                            return finalItr2.next();
                        }
                    }
                    return null;
            }
        };
    }

    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null  || !this.getClass().equals(o.getClass())) return false;
        return this.toList().equals(((BinaryCelestialSystem) o).toList());
    }

    public ArrayList<CelestialBody> toList (){
        ArrayList<CelestialBody> list = new ArrayList<>();
        Iterator<CelestialBody> itr = this.iterator();
        while (itr.hasNext()){
            list.add(itr.next());
        }
        return list;
    }

    @java.lang.Override
    public CelestialSystem merge(CelestialSystem celestialSystem) {
        return new BinaryCelestialSystem(this,celestialSystem);
    }

    @java.lang.Override
    public int hashCode() {
        return p1.hashCode() + p2.hashCode();
    }

    @java.lang.Override
    public double getMass() {
        return p1.getMass() +p2.getMass();
    }

    @java.lang.Override
    public String toString() {
        Iterator<CelestialBody> itr = this.iterator();
        String result  = "";
        while (itr.hasNext()){
            result = result + itr.next();
        }
        return result;
    }
}
