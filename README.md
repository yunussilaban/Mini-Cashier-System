# Mini Cashier System
This project is a simple mini cashier system made using Java. The goal of this program is to simulate a basic cashier process where a user can view a menu, add items to an order, calculate the total price, and checkout. The program is separated into several classes so that each part of the system has its own responsibility. This also helps make the code easier to read and organize.
System Description
The menu items are stored using an ArrayList. Each item in the menu has three main properties which are the name, the category, and the price. When the user selects an item from the menu, that item will be added to another list called the order list. This list represents what the customer wants to buy.
The system also follows a rule from the assignment which is that the user cannot checkout if there are no items in the order list. This is checked inside the checkout process.
Class Explanation
MenuItem
This class represents one menu item. It stores the name of the item, its category, and its price. It also has simple getter methods that allow other classes to access the data.
ViewMenu
This class is responsible for displaying the list of menu items to the user. It loops through the menu list and prints the name, category, and price of each item.
AddItem
This class is used when the user chooses an item from the menu. The selected item will be added into the order list so it can later be calculated and checked out.
CalculateTotal
This class calculates the total price of the items that are currently inside the order list. It loops through each item and adds the price to a total variable.
Checkout
This class handles the checkout process. It first checks if the order list is empty. If it is empty, the system will show a message that checkout cannot be done. If there are items, it will print the ordered items and display the final total price.
Main
This class is the main part of the program that runs the system. It shows the menu options to the user and calls the other classes depending on the user’s choice.
Program Features
- View menu
- Add item to order
- Calculate total price
- Checkout order
