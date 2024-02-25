import java.util.Scanner;

import InventorySystem.InventorySystem;
import InventorySystem.Order;

public class TestInventorySystem {



	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		Scanner myScanner2 = new Scanner(System.in);
		Scanner myScanner3 = new Scanner(System.in);
		Scanner myScanner4 = new Scanner(System.in);
		InventorySystem myInventory = new InventorySystem();
		Order myOrder = new Order();
		//////////////////////////////
		while(true) {
			System.out.printf("INVENTORY MENU:\n"
					+ "[1].  Add a new item\n"+ "[2].  "
					+ "Display all items\n[3].  "
					+ "Display the total number of items\n[4].  "
					+ "Calculate the Total Worth of the Inventory\n"
					+ " CUSTOMER MENU:\n[5]."
					+ "Add an order\n[6]."
					+ "Calculate order cost\n[0]."
					+ "Exit\n\nEnter your choice: ");
			switch(myScanner.nextInt()) {
			case 1:
				System.out.println("Enter item name: ");
				String name1 = myScanner2.nextLine();
				
				System.out.println("Enter item price: $");
				double price1 = myScanner.nextDouble();
				
				System.out.println("Enter item quantity: ");
				int quantity1 = myScanner.nextInt();
				
				myInventory.addItem(name1, price1, quantity1);
				break;
			
			case 2:
				myInventory.displayAllItems();
				break;
			
			case 3:
				System.out.println("Total number of items: " + myInventory.getTotalNumberOfItems()+ "\n");
				break;
			case 4:
				System.out.println("Total Worth of Inventory: $" + myInventory.calculateTotalWorth()+ "\n");
				
				break;
			case 5:
				System.out.println("Enter the item name you want to order: ");
				String itemName=myScanner4.nextLine();
				System.out.println("Enter the quantity: ");
				int quantity2 = myScanner3.nextInt();
				myOrder.addItem5(itemName, quantity2);
				myOrder.checkStorage(myInventory.quantity);
				
				break;
			case 6:
				System.out.println("Order cost for " + myOrder.quantity2 + " " + myOrder.itemName + " is : $ " + myOrder.calculateOrderCost(myInventory.price)+ "\n");
				break;
			case 0:
				System.out.println("Exiting... Good Bye!");
				System.exit(0);
			
			default:
				System.out.println("Wrong input!");			
			}
		}
	}


}
