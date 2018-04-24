package com.uca.labo5;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edward on 2018-04-21.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter{
    private int COUNT = 2;
    private List<String> tabTitles = new ArrayList<>();
    private List<Fragment> fragments = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles.get(position);
    }

    public void addFragment(Fragment fragment, String title) {
        fragments.add(fragment);
        tabTitles.add(title);
    }
}
