package Gruppe1600;

import java.util.*;

// This class represents a set that is composed of multiple disjoint intervals.
// (This means these subsets have no intersection.)
// 'NonContinuousSet' is subtype of 'NumberSet' and 'DoubleIterable'.
//
// TODO: Implementation of this class.
//  You can use the Java-Collection framework in your implementation.
//
public class NonContinuousSet implements NumberSet{

    // TODO: Define missing parts of the class.
    //  Further methods can be added if necessary (but no setters or
    //  getters that return or set just the value of a variable).
    HashSet<Interval> set;
    public static double min;
    public static double max;
    // Initializes 'this' with its continuous subsets (intervals).
    // Precondition: the intervals specified by 'sets' do not intersect,
    // sets != null && sets.length > 1
    public NonContinuousSet(Interval... sets) {
        // TODO: implement constructor.
        set = new HashSet<Interval>();
        set.addAll(Arrays.asList(sets));
        this.min = min();
        this.max = max();
    }

    // Returns the hull of this set as an 'Gruppe1600.ContinuousSet' view. The hull is the enclosing
    // continuous set with 'this.min()' as lower bound and 'this.max()' as upper bound.
    // Later changes in 'this' will be reflected in the returned view.
    public ContinuousSet getHull() {
        // TODO: implement method.
        return new Interval(min(),max());
    }

    // Adds 'interval' to this set.
    // Precondition: interval != null and 'interval' has no intersection with 'this'.
    public void add(Interval interval) {
        // TODO: implement method.
        this.set.add(interval);
        this.min = min();
        this.max = max();
    }


    // Returns an iterator over all lower and upper bounds of the subsets of 'this' an ascending
    // order. For example if the set has three subsets as in [[-1.2, 5.0], [7.33, 12.5], [21.1,
    // 28.7]] then the iteration is over the elements -1.2, 5.0, 7.33, 12.5, 21.1, 28.7.
    public DoubleIterator iterator() throws NoSuchElementException {
        // TODO: implement method.
        Iterator<Interval> itr = set.iterator();
        return new DoubleIterator() {
            Interval curr = itr.next();
            boolean maxhasntbeen=true;
            boolean minhasntbeen=true;
            @Override
            public boolean hasNext() {
                return maxhasntbeen || itr.hasNext();
            }

            @Override
            public Double next() {
                if (!hasNext()) throw new NoSuchElementException("No Elements");
                if (minhasntbeen){
                    minhasntbeen = false;
                    return curr.min();
                }
                if (maxhasntbeen){
                    maxhasntbeen = false;
                    return curr.max;
                }
                curr = itr.next();
                maxhasntbeen = true;
                minhasntbeen = true;
                return this.next();
            }
        };
    }

    @Override
    public double max() {
        double max=Double.MIN_VALUE;
        double number;
        Iterator<Interval> itr = set.iterator();
        while (itr.hasNext()){
            number =itr.next().max();
            if (number>max){
                max = number;
            }
        }
        return max;
    }

    @Override
    public double min() {
        double min=Double.MAX_VALUE;
        double number;
        Iterator<Interval> itr = set.iterator();
        while (itr.hasNext()){
            number =itr.next().min();
            if (number<min){
                min = number;
            }
        }
        return min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonContinuousSet that = (NonContinuousSet) o;
        return this.compare((NonContinuousSet) o) && ((NonContinuousSet) o).compare(this);
    }

    public boolean compare(NonContinuousSet set2){
        boolean thesame = true;
        Iterator<Interval> itr = set.iterator();
        while(itr.hasNext()){
            if (!set2.find(itr.next())){
                thesame = false;
            }
        }
        return thesame;
    }

    public boolean find(Interval interval){
        boolean here = false;
        Iterator<Interval> itr = set.iterator();
        while (itr.hasNext()){
            if (itr.next().equals(interval)){
                here = true;
            }
        }
        return here;
    }

    @Override
    public int hashCode() {
        return Objects.hash(set);
    }

    @Override
    // Returns a representation of 'this' with all the bounds of the interval(s) of 'this'
    // sorted ascending. The exact format is shown on the following example representing a set
    // with three intervals:
    // [[-1.2, 5.0], [7.33, 12.5], [21.1, 28.7]]
    public String toString() {
        // TODO: implement method.
        String result="";
        Iterator<Interval> itr = set.iterator();
        while (itr.hasNext()){
            result = result + itr.next();
        }
        return result;
    }

}

//TODO: Define additional class(es) if needed (either here or in a separate file).