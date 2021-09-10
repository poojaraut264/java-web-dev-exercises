package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
   // menuItems.add("Chicken Burger",5.6,"menu course");

    public void addItem(MenuItem newItem) {
      menuItems.add(newItem);
      if (lastUpdated.before(newItem.getDateAdded())){
            lastUpdated = newItem.getDateAdded();
      }
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }
}

