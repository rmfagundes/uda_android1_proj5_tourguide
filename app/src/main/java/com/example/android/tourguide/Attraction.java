package com.example.android.tourguide;

/**
 * Created by rodrigo.mfagundes on 02/10/2017.
 */

public class Attraction {
    private String name;
    private String detail;
    private int imageResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(String name, String detail) {
        this.name = name;
        this.detail = detail;
        this.imageResourceId = NO_IMAGE_PROVIDED;
    }

    public Attraction(String name, String detail, int imageResourceId) {
        this(name, detail);
        this.imageResourceId = imageResourceId;
    }

    public String getName() { return name; }

    public String getDetail() { return detail; }

    public int getImageResourceId() { return imageResourceId; }

    public boolean hasImage() { return imageResourceId != NO_IMAGE_PROVIDED; }
}
