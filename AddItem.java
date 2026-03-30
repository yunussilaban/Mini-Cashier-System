import java.util.ArrayList;

public class AddItem {
 public static void addItem(ArrayList<MenuItem> orderList, MenuItem item) {

    if (item == null) {
      System.out.println("Item not valid");
    } else {
      orderList.add(item);
      System.out.println(item.getName() + " added to order");
    }
  }
}
