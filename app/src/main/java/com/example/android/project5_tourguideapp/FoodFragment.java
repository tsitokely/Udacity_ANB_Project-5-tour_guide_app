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
        food.add(new LocationTour("La Braise",
                "Tahity Kely",
                R.drawable.la_braise));
        food.add(new LocationTour("Coté Cour",
                "Bd. Joffre",
                R.drawable.cote_cour));
        food.add(new LocationTour("Urban Grill",
                "Rue Bertho",
                R.drawable.urban_grill));
        food.add(new LocationTour("Soupe Chinoise Orchidée",
                "Rue Marechal De lattre de Tassigny",
                R.drawable.orchidee));
        food.add(new LocationTour("Fortuna Express",
                "Rue de la batterie",
                R.drawable.fortuna_express));
        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), food,
                R.color.Food_location);
        ListView listview = rootView.findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
        return rootView;
    }
}
