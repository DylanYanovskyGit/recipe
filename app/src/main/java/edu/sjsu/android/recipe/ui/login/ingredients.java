package edu.sjsu.android.recipe.ui.login;

import java.util.ArrayList;

public class ingredients {

    String ingredientsName;
    int ingredientsCount;
    ArrayList<String> ingredients;

    public ingredients(String ingrediant)
    {
        this.ingredientsName = ingrediant;
        ingredientsCount++;

    }

    public void add(String name)
    {
        ingredients.add(name);
    }



}
