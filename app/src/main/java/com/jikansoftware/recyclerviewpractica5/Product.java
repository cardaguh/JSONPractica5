package com.jikansoftware.recyclerviewpractica5;

public class Product {
    private int id;
    private String title;
    private String shordesc;
    private double rating;
    private double price;
    private int image;

    public Product(int id, String title, String shordesc, double rating, double price, int image) {
        this.id = id;
        this.title = title;
        this.shordesc = shordesc;
        this.rating = rating;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShordesc() {
        return shordesc;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
