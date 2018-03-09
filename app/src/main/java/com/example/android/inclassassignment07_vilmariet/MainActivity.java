package com.example.android.inclassassignment07_vilmariet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public boolean first = true;
    TextView textViewTwo;
    String menuItems = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent receiveIntent = getIntent();
        Drinks yummy = (Drinks) receiveIntent.getSerializableExtra(Keys.DRINKS);


    }

    public void addAnother(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, RequestCodes.ADD_DRINK);


    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        textViewTwo = findViewById(R.id.first_activity_window);
        if (requestCode == 93 && resultCode == RESULT_OK) {
            Drinks yummy = (Drinks) intent.getSerializableExtra(Keys.DRINKS);
            menuItems =  menuItems + yummy.toString() ;
            textViewTwo.setText(menuItems);


        }


    }
/*
   @Override
   protected void onSaveInstanceState (Bundle savedInstanceState) {

       super.onSaveInstanceState(savedInstanceState);

       Intent intent = new Intent(this, SecondActivity.class);
       startActivityForResult(intent, RequestCodes.ADD_DRINK);


   }*/

}
