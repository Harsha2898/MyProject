// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
import com.MyProject.Initial.FoodItem;
import com.MyProject.Initial.MenuManager;
import com.MyProject.Initial.OrderManager;


public class FoodTruckApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuManager menuManager = new MenuManager();
        OrderManager orderManager = new OrderManager();

        // Sample menu items
        menuManager.addFoodItem(new FoodItem(1, "Burger", 5.99));
        menuManager.addFoodItem(new FoodItem(2, "Taco", 3.99));
        menuManager.addFoodItem(new FoodItem(3, "Fries", 2.49));

        while (true) {
            System.out.println("\n--- Food Truck Management ---");
            System.out.println("1. Display Menu");
            System.out.println("2. Place an Order");
            System.out.println("3. View All Orders");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    menuManager.displayMenu();
                    break;
                case 2:
                    menuManager.displayMenu();
                    List<FoodItem> orderItems = new ArrayList<>();
                    System.out.print("Enter the number of items in your order: ");
                    int itemCount = scanner.nextInt();
                    for (int i = 0; i < itemCount; i++) {
                        System.out.print("Enter Food ID: ");
                        int foodId = scanner.nextInt();
                        FoodItem item = menuManager.findFoodItem(foodId);
                        if (item != null) {
                            orderItems.add(item);
                        } else {
                            System.out.println("Invalid Food ID!");
                        }
                    }
                    if (!orderItems.isEmpty()) {
                        orderManager.placeOrder(orderItems);
                    } else {
                        System.out.println("Order is empty!");
                    }
                    break;
                case 3:
                    orderManager.displayOrders();
                    break;
                case 4:
                    System.out.println("Exiting Food Truck Management System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}