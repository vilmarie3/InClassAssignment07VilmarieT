package com.example.android.inclassassignment07_vilmariet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

/**
 * Created by vilmarietaraza on 3/7/18.
 */


public class SecondActivity extends AppCompatActivity {

    public EditText drinkName;
    public EditText baseAlcohol;
    public CheckBox ice;
    public EditText ingredients;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        drinkName = findViewById(R.id.drink_name);
        baseAlcohol = findViewById(R.id.alcohol_choices);
        ice = findViewById(R.id.ice);
        ingredients = findViewById(R.id.number_ingredients);

        setTitle("Add Drink");
    }


    public void launchActivity(View view) {

        String drinkNameMessage = drinkName.getText().toString();
        String baseAlcoholMessage = baseAlcohol.getText().toString();
        int ingredientMessage = Integer.parseInt(ingredients.getText().toString());
        boolean hasIce = ice.isChecked();

        Drinks yummy = new Drinks(drinkNameMessage, baseAlcoholMessage, hasIce, ingredientMessage);

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(Keys.DRINKS, yummy);
        setResult(RESULT_OK, intent);
        finish();


    }
}

