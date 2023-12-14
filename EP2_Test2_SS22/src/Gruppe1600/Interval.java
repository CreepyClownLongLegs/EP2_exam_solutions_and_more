package Gruppe1600;

import java.util.Objects;

// A single continuous closed interval of double values.
// 'Interval' is subtype of 'ContinuousSet'.
//
// TODO: Implementation of this class.
//
public class Interval implements ContinuousSet{

    // TODO: Define missing parts of the class.
    //  Further methods can be added if necessary (but no setters or
    //  getters that return or set just the value of a variable).
    double min;
    double max;

    // Initializes 'this' with the lower and upper bound of the
    // closed interval ('lower' and 'upper' and all values in
    // between are elements of the interval).
    // Precondition: lower <= upper.
    public Interval(double lower, double upper) {
        // TODO: implement constructor.
        this.min=lower;
        this.max=upper;
    }


    @Override
    public double max() {
        return max;
    }

    @Override
    public double min() {
        return min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return Double.compare(interval.min, min) == 0 && Double.compare(interval.max, max) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max);
    }

    // Returns a readable representation of 'this' including the lower and upper
    // bound of this interval. The format is shown by the following example:
    // [0.9, 4.0]
    // (See further examples in 'PraxisTest2.java'.)
    @Override
    public String toString() {
        // TODO: implement method.
        return "["+min+","+max+"]";
    }

}
