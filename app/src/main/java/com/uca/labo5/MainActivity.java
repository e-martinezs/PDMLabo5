package com.uca.labo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Planet> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv;
        PlanetAdapter adapter;
        LinearLayoutManager manager;

        fillList();
        adapter = new PlanetAdapter(this,list);
        manager = new LinearLayoutManager(this);

        rv = findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(manager);
        rv.setAdapter(adapter);
    }

    private void fillList(){
        list.add(new Planet(1,"Sun", "Sun"));
        list.add(new Planet(2,"Mercury", "Mercury"));
        list.add(new Planet(3,"Venus", "Venus"));
        list.add(new Planet(4,"Mars", "Mars"));
        list.add(new Planet(5,"Earth", "Earth"));
        list.add(new Planet(6,"Jupiter", "Jupiter"));
        list.add(new Planet(7,"Saturn", "Saturn"));
        list.add(new Planet(8,"Uranus", "Uranus"));
        list.add(new Planet(9,"Neptune", "Neptune"));
    }
}
