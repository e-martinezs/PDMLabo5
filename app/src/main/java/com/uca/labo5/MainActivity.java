package com.uca.labo5;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<Planet> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillList();

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(viewPagerAdapter);

        viewPagerAdapter.addFragment(PlanetsFragment.newInstance(viewPagerAdapter, false));
        viewPagerAdapter.addFragment(PlanetsFragment.newInstance(viewPagerAdapter, true));

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
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
