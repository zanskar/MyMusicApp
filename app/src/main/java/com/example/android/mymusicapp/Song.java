package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * {@link Song} represents a song that the user wants to hear.
 * It contains a title, an artist and an placeholder image for that song.
 */
public class Song {

    /** Title of the song */
    private String mTitle;

    /** Artist who sings the song */
    private String mArtist;

    /** Image resource ID for the song*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Song object.
     *
     * @param title is the title of the song
     * @param artist is the artist who sings the song
     */
    public Song(String artist, String title) {
        mArtist = artist;
        mTitle = title;
    }

    /**
     * Create a new Song object.
     *
     * @param title is the title of the song
     * @param artist is the artists who songs the song
     * @param imageResourceId is the drawable resource ID for the image associated with the song
     *
     */
    public Song(String artist, String title, int imageResourceId) {
        mArtist = artist;
        mTitle = title;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the Artist who sings the song.
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get the Title of the song.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Return the image resource ID of the song.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}