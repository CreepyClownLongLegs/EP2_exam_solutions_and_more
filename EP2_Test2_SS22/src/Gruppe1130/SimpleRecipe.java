package Gruppe1130;

import java.util.Map;
import java.util.NoSuchElementException;

// A simple recipe is an unordered mixture of ingredients;
// 'Gruppe1130.SimpleRecipe' is subtype of 'Gruppe1130.Recipe'.
//
// TODO: Implementation of this class.
//  You can use the Java-Collection framework in your implementation.
//
public class SimpleRecipe implements Recipe{


    Ingredient[] ingredients = new Ingredient[40];
    int[] grams = new int[40];
    static int COUNT = 0;

    // TODO: Define missing parts of the class.
    //  Further methods can be added if necessary (but no setters or
    //  getters that return or set just the value of a variable).

    // Initializes 'this' as an empty recipe.
    public SimpleRecipe() {

    }

    // Adds an ingredient with its quantity in grams to this recipe. If
    // the ingredient is already contained in 'this' with a certain quantity,
    // the specified quantity 'grams' is added to the quantity of the ingredient.
    // Precondition: ingredient != null.
    public void put(Ingredient ingredient, int grams) {
        if (this.find(ingredient)!=-1){
         this.grams[this.find(ingredient)]= this.grams[this.find(ingredient)]+grams;
        }
        this.ingredients[COUNT] = ingredient;
        this.grams[COUNT]=grams;
        COUNT++;
    }

    public int size(){
        int count = 0;
        while()

    }

    public int find(Ingredient ingredient){
        if (COUNT == 0){
            return -1;
        }
        for (int i=1;i<COUNT;i++){
            if (this.ingredients[i].equals(ingredient)){
                return i;
            }
        }
        return -1;
    }

    // Returns a 'Gruppe1130.Scale' view of 'this'. Later changes to 'this' will be reflected in the
    // returned view.
    public Scale getScale() {
        // TODO: implement method.
        return new ScaleMap(this);
    }

    //@Override
    // Returns an iterator over all ingredients contained in 'this'.
    // The iterator's 'next()' method throws a 'java.util.NoSuchElementException'
    // with the message "no next ingredient!" if the iteration has no more elements.
    // (See examples in 'Gruppe1130.Gruppe1300.Gruppe1600.PraxisTest2.java'.)
    public IngredientIterator iterator() throws NoSuchElementException {
        // TODO: implement method.
        return new IngredientIterator() {
            int i=0;
            @Override
            public Ingredient next() {
                if (hasNext()){
                return ingredients[i++];
            } else throw new NoSuchElementException("no");
            }

            @Override
            public boolean hasNext() {
                return (i+1)<COUNT;
            }
        };
    }

    @Override
    // Returns a readable representation of 'this', with all distinct ingredients
    // and their quantity. There is no specific order. The format is shown in the
    // following example:
    // {Gruppe1130.Gruppe1300.Egg=2, Gruppe1130.Gruppe1300.Milk=1, Gruppe1130.Gruppe1300.Flour=1}
    // (See examples in 'Gruppe1130.Gruppe1300.Gruppe1600.PraxisTest2.java'.)
    public String toString() {
        // TODO: implement method.
        String result="";
        for (int i=0;i<COUNT;i++){
            result = result + ingredients[i] + " = " + grams[i] + "g, ";
        }
        return "{" + result + "}";
    }

    @Override
    public int getQuantityOf(Ingredient ingredient) {
        int i = this.find(ingredient);
        return grams[i];
    }

    public int getgrams(){
        int sum=0;
        for (int i=0; i < COUNT ; i++){
            sum = sum + grams[i];
        }
        return sum;
    }

}

class ScaleMap implements Scale{

    SimpleRecipe recipe;

    public ScaleMap(SimpleRecipe recipe){
        this.recipe = recipe;
    }

    @Override
    public int getGrams() {
        return recipe.getgrams();
    }
}

