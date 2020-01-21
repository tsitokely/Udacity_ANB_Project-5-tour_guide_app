package com.example.android.project5_tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<LocationTour> food = new ArrayList<>();
        food.add(new LocationTour(getString(R.string.la_braise),
                getString(R.string.bd_ratsimilaho),
                R.drawable.la_braise));
        food.add(new LocationTour(getString(R.string.la_braise_cote_cour),
                getString(R.string.bd_joffre),
                R.drawable.cote_cour));
        food.add(new LocationTour(getString(R.string.urban_grill),
                getString(R.string.rue_bertho),
                R.drawable.urban_grill));
        food.add(new LocationTour(getString(R.string.orchidee),
                getString(R.string.rue_tassigny),
                R.drawable.orchidee));
        food.add(new LocationTour(getString(R.string.fortuna_ex),
                getString(R.string.rue_batterie),
                R.drawable.fortuna_express));
        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), food,
                R.color.Food_location);
        ListView listview = rootView.findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
        return rootView;
    }
}
