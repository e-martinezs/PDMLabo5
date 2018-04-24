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

        viewPagerAdapter.addFragment(PlanetsFragment.newInstance(viewPagerAdapter, false), getString(R.string.tab_planets));
        viewPagerAdapter.addFragment(PlanetsFragment.newInstance(viewPagerAdapter, true), getString(R.string.tab_favorites));

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void fillList(){
        list.add(new Planet(1,getString(R.string.text_sun), getString(R.string.desc_sun), R.drawable.sun));
        list.add(new Planet(2,getString(R.string.text_mercury), getString(R.string.desc_mercury), R.drawable.mercury));
        list.add(new Planet(3,getString(R.string.text_venus), getString(R.string.desc_venus), R.drawable.venus));
        list.add(new Planet(4,getString(R.string.text_mars), getString(R.string.desc_mars), R.drawable.mars));
        list.add(new Planet(5,getString(R.string.text_earth), getString(R.string.desc_earth), R.drawable.earth));
        list.add(new Planet(6,getString(R.string.text_jupiter), getString(R.string.desc_jupiter), R.drawable.jupiter));
        list.add(new Planet(7,getString(R.string.text_saturn), getString(R.string.desc_saturn), R.drawable.saturn));
        list.add(new Planet(8,getString(R.string.text_uranus), getString(R.string.desc_uranus), R.drawable.uranus));
        list.add(new Planet(9,getString(R.string.text_neptune), getString(R.string.desc_neptune), R.drawable.neptune));
    }
}
