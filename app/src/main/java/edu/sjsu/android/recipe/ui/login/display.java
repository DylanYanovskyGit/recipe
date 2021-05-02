package edu.sjsu.android.recipe.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.sjsu.android.recipe.R;

public class display extends AppCompatActivity {
    recipeDesign rd = new recipeDesign();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
    }


}