import java.util.*;

// The class implements 'Polynomial' and represents the form (a + x*p), where 'a' is an Integer
// and 'p' is another polynomial. 'p' must not be 'null' (objects of 'Constant' shall be used to represent constants).
// This class implements 'Polynomial' by using Horner's scheme.
// Example:
// a0 + a1*x + a2*x� + a3*x� + a4*x4
// The polynomial above is represented in Horner's scheme as:
// a0 + x*(a1 + x*(a2 + x*(a3 + x*a4)))
//
public class HornerScheme implements Polynomial {

    //TODO: define missing parts of this class.
    int multiplier;
    Polynomial p;

    // Initializes this object.
    // Precondition: 'p' must not be 'null'.
    public HornerScheme(int a, Polynomial p) {
        //TODO: implement this constructor.
        this.multiplier = a;
        this.p = p;
    }

    // Creates a polynomial from the coefficients specified by the array coeffs = {a0, a1, a2, ... a??}.
    // Precondition: coeffs != null and coeffs has at least one element.
    public static Polynomial create(int[] coeffs) {
        //TODO: implement this method.
        Polynomial poly = new Constant(coeffs[coeffs.length-1]);
        for (int i = coeffs.length-2; i >= 0; i--){
            poly = new HornerScheme(coeffs[i], poly);
        }
        return poly;
    }

    @Override
    public int degree() {
        return coefficients().size()-1;
    }

    @Override
    public List<Integer> coefficients() {
        List<Integer> list = new LinkedList<>();
        Iterator itr = this.iterator();
        while(itr.hasNext()){
            list.add((int)itr.next());
        }
        return list;
    }

    @Override
    public double eval(double x) {
        return multiplier + x * p.eval(x);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Iterator itr = p.iterator();
            int getthis = multiplier;
            boolean hasntbeen = true;

            @Override
            public boolean hasNext() {
                return hasntbeen || itr.hasNext();
            }

            @Override
            public Integer next() {
                if (!hasNext()){
                    throw new NoSuchElementException("no coefficient!");
                }
                if (hasntbeen){
                    hasntbeen = false;
                    return getthis;
                }
                return (int)itr.next();
            }
        };



    }

    @Override
    public String toString() {
        return  multiplier +
                "+x*("+ p.toString() +
                ')';
    }
}
