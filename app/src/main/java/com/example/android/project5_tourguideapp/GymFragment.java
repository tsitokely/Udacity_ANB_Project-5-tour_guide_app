package com.example.android.project5_tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class GymFragment extends Fragment {

    public GymFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<LocationTour> gym = new ArrayList<>();
        gym.add(new LocationTour(getString(R.string.eccm), getString(R.string.bd_liberte),
                R.drawable.eccm));
        gym.add(new LocationTour(getString(R.string.east_academy), getString(R.string.bd_joffre),
                R.drawable.east_academy));
        gym.add(new LocationTour(getString(R.string.barbell_501), getString(R.string.bd_joffre),
                R.drawable.barbell501));
        gym.add(new LocationTour(getString(R.string.wellness_fit), getString(R.string.bd_joffre),
                R.drawable.wellnessfit));
        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), gym,
                R.color.Gym_location);
        ListView listview = rootView.findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
        return rootView;
    }
}
