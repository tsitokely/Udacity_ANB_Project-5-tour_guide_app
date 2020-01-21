package com.example.android.project5_tourguideapp;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LocationTypeAdapter extends FragmentPagerAdapter {
    Context context;

    // Specify the number of pages
    final int PAGE_COUNT = 4;

    public LocationTypeAdapter(FragmentManager fm, Context nContext) {
        super(fm);
        context = nContext;
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

    // Generate title based on item position
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.bank);
            case 1:
                return context.getString(R.string.food);
            case 2:
                return context.getString(R.string.gym);
            case 3:
                return context.getString(R.string.gas);
        }
        return null;
    }


}
