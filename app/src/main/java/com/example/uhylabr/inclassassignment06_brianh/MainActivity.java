package com.example.uhylabr.inclassassignment06_brianh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    // First you'll need 4 variables for inputs (3 EditText and 1 CheckBox)
    public EditText name;
    public EditText legs;
    public EditText information;
    public CheckBox checkBox;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name=(EditText)findViewById(R.id.name);
        EditText legs=(EditText)findViewById(R.id.legs);
        EditText information=(EditText)findViewById(R.id.information);
        CheckBox checkBox=(CheckBox)findViewById(R.id.checkBox);

        // Then you'll need to connect those to the XML (findViewById)
    }

    public void launchActivity(View view) {
        // then a Method to .getText() and convert .toString() for each EditText
        // and a boolean for the CheckBox
        // then create an Object with constructor that accepts everything
        // and pass that to the SecondActivity
            submitButton=(Button)findViewById(R.id.submitButton);
            submitButton.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v){
                    String animalName=name.getText().toString();
                    String animalLegs=legs.getText().toString();
                    String animalInformation=information.getText().toString();
                    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
                    boolean hasFur= checkBox.isChecked();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            final String name = intent.putExtra(Keys.name);
            final String legs = intent.putExtra(Keys.legs);
            final String information = intent.putExtra(Keys.information);
            final String furryCreature = intent.putExtra(Keys.hasFur);
                    }});}}