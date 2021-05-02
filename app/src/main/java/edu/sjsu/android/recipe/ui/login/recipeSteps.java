package edu.sjsu.android.recipe.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import edu.sjsu.android.recipe.R;


public class recipeSteps extends AppCompatActivity {
    ArrayList<String> steps = new ArrayList<String>(0);
    EditText textfield1;
    EditText textField2;
    EditText textField3;
    Button add;
    Button nextSteps;


    @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_steps);
        textfield1 = findViewById(R.id.textView5);
        textField2 = findViewById(R.id.textView6);
        textField3 = findViewById(R.id.textView7);
        add = findViewById(R.id.addSteps);
        nextSteps = findViewById(R.id.Display);

        steps.add(textfield1.getText().toString().trim());
        steps.add(textField2.getText().toString().trim());
        steps.add(textField3.getText().toString().trim());

        nextSteps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPage = new Intent(recipeSteps.this, Display.class);
                startActivity(nextPage);
            }
        });


    }
    //create  new view and direct to displ


}