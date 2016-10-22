package com.swiperefreshlayout;

import android.graphics.Bitmap;

/**
 * Created by Samir on 20.9.2016.
 */
public class User {

    private String phone;
    private String name;
    private Bitmap image;


    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String phone, String name, Bitmap image) {
        this.phone = phone;
        this.name = name;
        this.image = image;

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
