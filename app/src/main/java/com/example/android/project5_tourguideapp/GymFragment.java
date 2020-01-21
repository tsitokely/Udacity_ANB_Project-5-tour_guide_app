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
        gym.add(new LocationTour("ECCM", "Bd. De la liberte",
                R.drawable.eccm));
        gym.add(new LocationTour("East Academy", "Bd. Joffre",
                R.drawable.east_academy));
        gym.add(new LocationTour("Barbell 501", "Bd. Joffre",
                R.drawable.barbell501));
        gym.add(new LocationTour("Wellness Fit", "Bd. Joffre",
                R.drawable.wellnessfit));
        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), gym,
                R.color.Gym_location);
        ListView listview = rootView.findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
        return rootView;
    }
}
