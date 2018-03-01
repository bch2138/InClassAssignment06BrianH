package com.example.uhylabr.inclassassignment06_brianh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

    Animal animalName = (Animal) intent.getSerializableExtra(Keys.name);
    Animal animalLegs = (Animal) intent.getSerializableExtra(Keys.legs);
    Animal animalInformation = (Animal) intent.getSerializableExtra(Keys.information);
    Animal furryCreature = (Animal) intent.getBooleanExtra(Keys.furryCreature, true);




    startActivity(intent);}}






