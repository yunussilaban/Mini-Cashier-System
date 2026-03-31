import java.util.ArrayList;

public class CalculateTotal {

    public static void calculate(ArrayList<MenuItem> orderList) {

        double total = 0;

        for (MenuItem item : orderList) {
            total = total + item.getPrice();
        }

        System.out.println("Total price: " + total);
    }

}