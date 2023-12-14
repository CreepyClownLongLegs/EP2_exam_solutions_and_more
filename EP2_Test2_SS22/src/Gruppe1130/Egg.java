package Gruppe1130;

import java.util.Objects;

// An egg as an ingredient.
//
public class Egg implements Ingredient{

    String name;

    // Returns the name of the ingredient.
    public String toString() {
        return "Egg";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
