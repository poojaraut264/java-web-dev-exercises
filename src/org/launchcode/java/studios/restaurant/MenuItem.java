package org.launchcode.java.studios.restaurant;

import java.util.Date;

public class MenuItem {
    private String description;
    private double price;
    private String category;
    private Date dateAdded;

    public MenuItem(String description,
                    double price,
                    String category,
                    Date dateAdded) {
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = dateAdded;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public String getCategory() {
        return this.category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public boolean isNew() {
        Date cutOffDate = new Date();
        if (dateAdded.before(cutOffDate)) {
            return false;
        } else {
            return true;
        }
    }
}
