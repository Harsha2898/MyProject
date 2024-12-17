package com.MyProject.Initial;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orders;
    private int currentOrderId = 1;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    // Place an order
    public void placeOrder(List<FoodItem> items) {
        Order newOrder = new Order(currentOrderId++, items);
        orders.add(newOrder);
        System.out.println("Order placed: " + newOrder);
    }

    // Display all orders
    public void displayOrders() {
        System.out.println("----- Active Orders -----");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
