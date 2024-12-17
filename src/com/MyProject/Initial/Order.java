package com.MyProject.Initial;

import java.util.List;

public class Order {
    private int orderId;
    private List<FoodItem> items;
    private String status; // "Pending" or "Completed"

    public Order(int orderId, List<FoodItem> items) {
        this.orderId = orderId;
        this.items = items;
        this.status = "Pending";
    }

    public int getOrderId() { return orderId; }
    public List<FoodItem> getItems() { return items; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Order [OrderID=" + orderId + ", Items=" + items + ", Status=" + status + "]";
    }
}
