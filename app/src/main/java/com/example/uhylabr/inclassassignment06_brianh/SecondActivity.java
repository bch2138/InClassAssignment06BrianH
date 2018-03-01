package com.example.uhylabr.inclassassignment06_brianh;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

    final Animal animalName = (Animal) intent.getSerializableExtra(Keys.name);
    final Animal animalLegs = (Animal) intent.getSerializableExtra(Keys.legs);
    final Animal animalInformation = (Animal) intent.getSerializableExtra(Keys.information);
    final Animal furryCreature = (Animal) intent.getSerializableExtra(Keys.furryCreature);

        TextView animal=(TextView)findViewById(R.id.animal);

System.out.println(animal);

    startActivity(intent);}}






