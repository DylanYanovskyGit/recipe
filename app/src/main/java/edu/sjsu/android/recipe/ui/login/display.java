package edu.sjsu.android.recipe.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;

import edu.sjsu.android.recipe.R;

public class display extends AppCompatActivity {

    EditText step1;
    EditText step2;
    EditText step3;

    public display(ArrayList<String> steps) {

        step1.setText(steps.get(0));
        step2.setText(steps.get(1));
        step3.setText(steps.get(2));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        step1= findViewById(R.id.step1);
        step2= findViewById(R.id.step2);
        step3= findViewById(R.id.step3);

    }
}