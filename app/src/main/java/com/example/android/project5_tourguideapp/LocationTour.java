package com.example.android.project5_tourguideapp;

import androidx.annotation.NonNull;

/**
 * {@link LocationTour} represents a location in the app
 * It contains the name and the address of the location,
 * for some location, images are also displayed
 */
public class LocationTour {
/** Variables declaration*/
    /**
     * Name of the location
     */
    private String mLocationName;

    /**
     * Address of the location
     */
    private String mLocationAddress;

    /**
     * Image of the location
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this location
     */
    private static final int NO_IMAGE_PROVIDED = -1;
/** Class declaration */
    /**
     * Location object definition for a location with an image provided.
     *
     * @param LocationName    is the name of the location
     * @param LocationAddress is the address in the town where you can find the location
     * @param imageResourceId is the raw resource ID for the image associated with the word
     */
    LocationTour(String LocationName, String LocationAddress, int imageResourceId) {
        mLocationName = LocationName;
        mLocationAddress = LocationAddress;
        mImageResourceId = imageResourceId;
    }

    /**
     * Location object definition for a location with no image provided.
     *
     * @param LocationName    is the name of the location
     * @param LocationAddress is the address in the town where you can find the location
     */
    LocationTour(String LocationName, String LocationAddress) {
        mLocationName = LocationName;
        mLocationAddress = LocationAddress;
    }
/**Method declaration */
    /**
     * Get the name of the location.
     */
    String getLocationName() {
        return mLocationName;
    }

    /**
     * Get the address in town of the location
     */
    String getLocationAddress() {
        return mLocationAddress;
    }

    /**
     * Return the image resource ID of the location.
     */
    int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns the string representation of the {@link LocationTour} object.
     */
    @Override
    @NonNull
    public String toString() {
        return "Word{" +
                "mLocationName ='" + mLocationName + '\'' +
                ", mLocationAddress='" + mLocationAddress + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
