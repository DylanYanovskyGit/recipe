package edu.sjsu.android.recipe.ui.login;

import java.util.ArrayList;

import edu.sjsu.android.recipe.ui.login.ingredients;

public class recipeDesign {

    ArrayList<ingredients> ingredientList;
    int cookTime;


    public recipeDesign(ingredients ingredients)
    {

    }

    public void addIngrediant(ingredients ingredient)
    {
        ingredientList.add(ingredient);
    }

}
