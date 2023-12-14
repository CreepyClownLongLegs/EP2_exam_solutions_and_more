import java.util.*;

// 'Constant' implements 'Polynomial' and represents a polynomial with degree 0 corresponding
// to a constant value (regardless of the 'x' used for evaluation).
// 'Constant' is used by class 'HornerScheme'.
// The iterator of this class iterates over only one value and therefore behaves as follows:
// The 'next' method returns the constant value, if it is called for the first time.
// 'hasNext' is 'true' only if 'next' has not been called.
//
public class Constant implements Polynomial{

    //TODO: define missing parts of this class.
    int constant;

    // Initializes this object.
    // Precondition: c != 0.
    public Constant(int c) {
        this.constant = c;
        //TODO: implement constructor.

    }

    @Override
    public int degree() {
        return 0;
    }

    @Override
    public List<Integer> coefficients() {
        List<Integer> list = new ArrayList<>() ;
        list.add(constant);
        return list;
    }

    @Override
    public double eval(double x) {
        return constant;
    }

    @Override
    public String toString() {
        return constant + "*x";
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            private boolean state = true;

            @Override
            public boolean hasNext() {
                return state;
            }

            @Override
            public Integer next() {
                if(!hasNext()){
                    throw new NoSuchElementException("no coefficient!");
                }
                state = false;
                return constant;
            }
        };
    }
}

