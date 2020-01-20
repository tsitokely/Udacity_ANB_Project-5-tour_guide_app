package com.example.android.project5_tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        //get the viewpager and set it's pager adapter so that it can display items
        ViewPager vp = findViewById(R.id.viewpager);
        vp.setAdapter();
        //Give the tab layout the viewpager
        TabLayout tl = findViewById(R.id.sliding_tabs);
        tl.setupWithViewPager(vp);
    }
}
