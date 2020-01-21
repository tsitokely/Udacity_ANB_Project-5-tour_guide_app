package com.example.android.project5_tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class BankFragment extends Fragment {

    public BankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);
        final ArrayList<LocationTour> bank = new ArrayList<>();
        bank.add(new LocationTour(getString(R.string.bfv), getString(R.string.av_indep),
                R.drawable.bfv_av_indep));
        bank.add(new LocationTour(getString(R.string.bfv), getString(R.string.tanambao_v),
                R.drawable.bfv_tanambao_5));
        bank.add(new LocationTour(getString(R.string.boa), getString(R.string.bd_augagneur),
                R.drawable.boa_bd_augagneur));
        bank.add(new LocationTour(getString(R.string.boa), getString(R.string.rue_commerce),
                R.drawable.boa_rue_commerce));
        bank.add(new LocationTour(getString(R.string.bmoi), getString(R.string.bd_joffre),
                R.drawable.bmoi_bd_joffre));
        bank.add(new LocationTour(getString(R.string.bmoi), getString(R.string.bd_augagneur),
                R.drawable.bmoi_bd_augagneur));
        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), bank,
                R.color.bank_location);
        ListView listview = rootView.findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
        return rootView;
    }
}
