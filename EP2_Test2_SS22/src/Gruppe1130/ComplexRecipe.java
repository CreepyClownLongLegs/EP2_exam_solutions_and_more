package Gruppe1130;

import java.util.NoSuchElementException;

// A more complex recipe consisting of multiple objects of type 'recipe'. The order is relevant.
// 'Gruppe1130.ComplexRecipe' is subtype of 'Gruppe1130.Recipe'.
//
// TODO: Implementation of this class.
//  You can use the Java-Collection framework in your implementation.
//
public class ComplexRecipe implements Recipe{

    // TODO: Define missing parts of the class.
    //  Further methods can be added if necessary (but no setters or
    //  getters that set or return just the value of a variable).
Recipe[] recipes = new Recipe[40];
static int COUNT = 0;

    // Initializes 'this' with recipes in the specified order.
    // Precondition: recipes != null, recipes.length > 1
    public ComplexRecipe(Recipe... recipes) {
        this.recipes = recipes;
        COUNT = recipes.length;
    }

    //@Override
    // Returns an iterator over elements of 'Gruppe1130.Gruppe1300.Ingredient', where the
    // iterations are in the order of the recipes specified at initialization
    // of 'this'.
    // The iterator's 'next()' method throws a 'java.util.NoSuchElementException'
    // with the message "no next recipe!" of the iteration has no more elements.
    public IngredientIterator iterator() {
        // TODO: implement method.
        Recipe[] recipes = this.recipes;
        return new IngredientIterator() {
            int i = 0;
            IngredientIterator itr = recipes[i].iterator();

            @Override
            public Ingredient next() throws NoSuchElementException {
                if (!hasNext()){
                   throw new NoSuchElementException("no elem");
                }
                if (itr.hasNext()){
                    return itr.next();
                }
                if ((i+1)<COUNT){
                    itr = recipes[++i].iterator();
                    return itr.next();
                }
                else throw new NoSuchElementException("haha");
            }

            @Override
            public boolean hasNext() {
                return itr.hasNext() || (i+1)<COUNT;
            }
        };
    }

    @Override
    // Returns a readable representation with all the recipe components of 'this' in the
    // order specified at initialization of 'this'.
    // The format is reflecting the structure of the recipe and is shown in the following
    // example:
    // [{Gruppe1130.Gruppe1300.Egg=50, Gruppe1130.Gruppe1300.Flour=300, Gruppe1130.Gruppe1300.Milk=250}, {Gruppe1130.Gruppe1300.Egg=100}]
    // (See also examples in 'Gruppe1130.Gruppe1300.Gruppe1600.PraxisTest2.java'.)
    //
    public String toString() {
        String result="";
        for (int i=0;i<COUNT;i++){
            result =  result + recipes[i] + ", ";
        }
        return "{" + result + "}";
    }

    @Override
    public int getQuantityOf(Ingredient ingredient) {
        int quantity=0;
        for (int i=0;i<COUNT;i++){
            quantity = quantity + recipes[i].getQuantityOf(ingredient);
        }
        return quantity;
    }
}

//TODO: Define additional class(es) if needed (either here or in a separate file).