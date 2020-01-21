package com.example.android.project5_tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class GasolineFragment extends Fragment {


    public GasolineFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<LocationTour> gasoline = new ArrayList<>();
        gasoline.add(new LocationTour("Total Villa Plessis",
                "Bd. Augagneur"));
        gasoline.add(new LocationTour("Total Vatsy",
                "RN2 Bis"));
        gasoline.add(new LocationTour("Jovenna Jacaranda",
                "Bd. Augagneur"));
        gasoline.add(new LocationTour("Shell Pangalana",
                "RN5"));
        gasoline.add(new LocationTour("Shell Gare Routière",
                "Bd. D’andovoranto"));
        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), gasoline,
                R.color.Gasoline_location);
        ListView listview = rootView.findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
        return rootView;
    }
}
