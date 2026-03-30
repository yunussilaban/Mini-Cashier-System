import java.util.ArrayList;

public class ViewMenu {

    public static void showMenu(ArrayList<MenuItem> menuList) {

        System.out.println("=== MENU LIST ===");

        for (MenuItem item : menuList) {
            System.out.println(
                    item.getName() +
                            " | Category: " + item.getCategory() +
                            " | Price: " + item.getPrice()
            );
        }

        System.out.println("=================");
    }
}
