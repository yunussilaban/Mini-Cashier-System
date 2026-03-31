import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();
        ArrayList<MenuItem> orderList = new ArrayList<MenuItem>();

        // menu example
        menuList.add(new MenuItem("Fried Rice", "Food", 15000));
        menuList.add(new MenuItem("Mie Ayam", "Food", 12000));
        menuList.add(new MenuItem("Ice Tea", "Drink", 5000));
        menuList.add(new MenuItem("Coffee", "Drink", 8000));

        int choice = 0;

        while (choice != 5) {

            System.out.println("Mini Cashier");
            System.out.println("1. View Menu");
            System.out.println("2. Add Item");
            System.out.println("3. Calculate Total");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Choose: ");
            choice = input.nextInt();

            if (choice == 1) {

                ViewMenu.showMenu(menuList);

            }

            else if (choice == 2) {

                ViewMenu.showMenu(menuList);

                System.out.print("Choose item number: ");
                int num = input.nextInt();

                if (num > 0 && num <= menuList.size()) {

                    MenuItem selected = menuList.get(num - 1);
                    AddItem.addItem(orderList, selected);

                } else {

                    System.out.println("Invalid item");

                }

            }

            else if (choice == 3) {

                CalculateTotal.calculate(orderList);

            }

            else if (choice == 4) {

                Checkout.doCheckout(orderList);

            }

        }

        System.out.println("Program ended");

    }

}
