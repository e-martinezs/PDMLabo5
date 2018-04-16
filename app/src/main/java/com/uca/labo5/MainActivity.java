package com.uca.labo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv;
        PlanetAdapter adapter;
        LinearLayoutManager manager;
        List<Planet> list = new ArrayList<>();

        list.add(new Planet(1,"Earth", ":v"));
        list.add(new Planet(2,"Mars", ">:v"));
        list.add(new Planet(3,"Jupiter", ":'v"));
        adapter = new PlanetAdapter(this,list);
        manager = new LinearLayoutManager(this);

        rv = findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(manager);
        rv.setAdapter(adapter);
    }
}
