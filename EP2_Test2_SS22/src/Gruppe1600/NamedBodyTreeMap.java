package Gruppe1600;
// This class represents a mapping from a 'Vector2'-position in space to the 'NamedBody'-object
// at that position. 'NamedBodyTreeMap' uses a binary search tree to store its bodies. This class
// uses the 'compareTo' method of 'Vector2' to implement the sorting. ('Vector2'-objects are sorted
// primarily according to their x-coordinates. In case of equal x-coordinates 'Vector2'-objects are
// sorted according to their y-coordinates.)
//
// TODO: define further classes for the implementation of the binary search tree, if needed.
//
public class NamedBodyTreeMap {

    //TODO: Define variables and constructors, if needed.

    // Inserts the specified key-value pair to the binary search tree of bodies. If the tree
    // already contains a body at the specified position, the result of merging the existing body
    // with the specified body replaces the old value.
    // Precondition: position != null, b != null (needs not be checked).
    public void put(Vector2 position, NamedBody b) {
        //TODO: implement method.
    }

    // Returns a new object of 'NamedBodyTreeMap' with all bodies of this tree located at the
    // specified x-coordinate, i.e., all bodies with a position in the range from
    // (x, Integer.MIN_VALUE) to (x, Integer.MAX_VALUE).
    // If there are no such bodies in this tree, an empty tree is returned.
    // The method exploits the binary search tree structure, i.e., traverses only relevant parts
    // of the tree.
    public NamedBodyTreeMap getBodiesAtX(int x) {
        //TODO: implement method.
        return null;
    }

    // Returns the body with the specified position.
    // The method returns 'null' if no such body exits in the tree.
    // The method exploits the binary search tree structure, i.e., traverses only relevant parts
    // of the tree.
    // Precodition: position != null (needs not be checked).
    public NamedBody get(Vector2 position) {
        //TODO: implement method.
        return null;
    }

    // Returns a readable representation with each of the bodies of this tree
    // in a separate line ordered according to their position.
    // Returns "EMPTY" if the tree has no bodies.
    // See examples in 'PraxisTest1.java'.
    public String toString() {
        //TODO: implement method.
        return "";
    }
}

//TODO: Define additional class(es) implementing the binary search tree
// (either here or in a separate file).
