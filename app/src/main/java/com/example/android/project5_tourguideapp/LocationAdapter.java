package com.example.android.project5_tourguideapp;

import android.app.Activity;
import android.location.Location;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<LocationTour> {
    private int mColorResourceId;

    /**
     * This is our own custom constructor.
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context      The current context. Used to inflate the layout file.
     * @param LocationTour A List of Location objects to display in a list
     * @param color        the color of the location
     */
    public LocationAdapter(Activity context, ArrayList<LocationTour> LocationTour, int color) {
        super(context, 0, LocationTour);
        mColorResourceId = color;
    }

    @Override
    @NonNull
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_list_item, parent, false);
        }
        // Get the {@link LocationTour} object located at this position in the list
        LocationTour currentLocation = getItem(position);
        /** Data part **/
        // Find the TextView in the location_list_item.xml layout with the ID location_name
        TextView locationName = listItemView.findViewById(R.id.location_name);
        // Set this text on the TextView
        locationName.setText(currentLocation.getLocationName());
        // Find the TextView in the location_list_item.xml layout with the ID location_address
        TextView locationAddr = listItemView.findViewById(R.id.location_address);
        // Set this text on the TextView
        locationAddr.setText(currentLocation.getLocationAddress());
        // Find the ImageView in the location_list_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentLocation.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentLocation.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        /** Theme part **/
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }


}
