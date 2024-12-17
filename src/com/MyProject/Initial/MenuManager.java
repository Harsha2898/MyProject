package com.MyProject.Initial;

import java.util.ArrayList;
import java.util.List;

public class MenuManager {
    private List<FoodItem> menu;

    public MenuManager() {
        this.menu = new ArrayList<>();
    }

    // Add a food item to the menu
    public void addFoodItem(FoodItem item) {
        menu.add(item);
        System.out.println("Item added: " + item);
    }

    // Display the menu
    public void displayMenu() {
        System.out.println("----- Food Truck Menu -----");
        for (FoodItem item : menu) {
            System.out.println(item);
        }
    }

    // Find a food item by ID
    public FoodItem findFoodItem(int id) {
        for (FoodItem item : menu) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
