package com.example.abiral.xampp.data.model;

/**
 * Created by Abiral on 4/4/2019.
 */

public class Product {


    private int imageView;
    private String Title;

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Product(int imageView, String title) {

        this.imageView = imageView;
        Title = title;
    }
}
