import java.util.ArrayList;

public class Checkout {

    public static void doCheckout(ArrayList<MenuItem> orderList) {

        if (orderList.size() == 0) {
            System.out.println("Cannot checkout if order is empty");
            return;
        }

        double total = 0;

        System.out.println("Your Order:");

        for (MenuItem item : orderList) {
            System.out.println(item.getName() + " - " + item.getPrice());
            total = total + item.getPrice();
        }

        System.out.println("Total: " + total);
        System.out.println("Checkout success");
    }

}