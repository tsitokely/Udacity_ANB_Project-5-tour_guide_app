package com.example.android.project5_tourguideapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LocationTypeAdapter extends FragmentPagerAdapter {
    // Specify the number of pages
    final int PAGE_COUNT = 4;
    // Declare the name of each location type
    private String titles[] = new String[]{"Bank", "Food", "Gym", "Gasoline"};

    public LocationTypeAdapter(FragmentManager fm, MainActivity mainActivity) {
        super(fm);
    }

    // Our implementation of getItem
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BankFragment();
        } else if (position == 1) {
            return new FoodFragment();
        } else if (position == 2) {
            return new GymFragment();
        } else {
            return new GasolineFragment();
        }
    }

    // Our implementation of getCount
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return titles[position];
    }


}
