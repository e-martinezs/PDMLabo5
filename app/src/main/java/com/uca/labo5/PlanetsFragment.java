package com.uca.labo5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlanetsFragment extends Fragment {

    private boolean favorite = false;
    private ViewPagerAdapter vpa;

    public static PlanetsFragment newInstance(ViewPagerAdapter vpa, boolean favorite){
        PlanetsFragment fragment = new PlanetsFragment();
        fragment.favorite = favorite;
        fragment.vpa = vpa;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_planets, container, false);

        RecyclerView rv;
        PlanetAdapter adapter;
        LinearLayoutManager manager;

        adapter = new PlanetAdapter(container.getContext(), vpa, favorite);
        manager = new LinearLayoutManager(container.getContext());

        rv = v.findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(manager);
        rv.setAdapter(adapter);

        return v;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            getFragmentManager().beginTransaction().detach(this).attach(this).commit();
        }
    }
}
