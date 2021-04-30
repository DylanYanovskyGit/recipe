package edu.sjsu.android.recipe.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

import edu.sjsu.android.recipe.R;

public class EditRecipe extends AppCompatActivity {

    ArrayList<ingredients> ingrediantsList = new ArrayList<>();
    EditText ingrediants1;
    EditText ingrediants2;
    EditText ingrediants3;
    Button add;
    Button delete;
    Button nextSteps;
    recipeDesign data;
    ingredients ingredient;
    EditText cookTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ingrediants1 = findViewById(R.id.textView);
        ingrediants2 = findViewById(R.id.textView2);
        ingrediants3 = findViewById(R.id.textView3);
        cookTime = findViewById(R.id.textView4);
        nextSteps = findViewById(R.id.addSteps);




        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ingrediant1 = ingrediants1.getText().toString();
                String ingrediant2 = ingrediants2.getText().toString();
                String ingrediant3 = ingrediants3.getText().toString();
                int cookTimer = Integer.parseInt(cookTime.getText().toString().trim());
                ingredient.add(ingrediant1);
                ingredient.add(ingrediant2);
                ingredient.add(ingrediant3);
                data.addIngrediant(ingredient);
                data.cookTime = cookTimer;

            }
        });

        nextSteps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextPage = new Intent(EditRecipe.this, recipeSteps.class);
               startActivity(nextPage);
            }
        });
    }
}