import java.util.Scanner;

import InventorySystem.InventorySystem;

public class TestInventorySystem {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		Scanner myScanner2 = new Scanner(System.in);
		InventorySystem myInventory = new InventorySystem();
		//////////////////////////////
		while(true) {
			System.out.printf("[1].  Add a new item\n[2].  "
					+ "Display all items\n[3].  "
					+ "Display the total number of items\n[4].  "
					+ "Calculate the Total Worth of the Inventory\n[0].  "
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
				System.out.println("Total number of items: " + myInventory.getTotalNumberOfItems());
				break;
			case 4:
				System.out.println("Total Worth of Inventory: $" + myInventory.calculateTotalWorth());
				
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
