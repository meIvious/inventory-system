import java.util.Scanner;

import InventorySystem.InventorySystem;
import InventorySystem.Order;
import InventorySystem.Provider;
public class TestInventorySystem {


	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		Scanner myScanner2 = new Scanner(System.in);
		Scanner myScanner3 = new Scanner(System.in);
		Scanner myScanner4 = new Scanner(System.in);
		Scanner myScanner5 = new Scanner(System.in);
		Scanner myScanner6 = new Scanner(System.in);
		InventorySystem myInventory = new InventorySystem();
		Order myOrder = new Order();
		Provider myProvider = new Provider();
		//////////////////////////////
		while(true) {
			System.out.printf("INVENTORY MENU:\n"
					+ "[1].  Add a new item\n"+ "[2].  "
					+ "Display all items\n[3].  "
					+ "Display the total number of items\n[4].  "
					+ "Calculate the Total Worth of the Inventory\n"
					+ " CUSTOMER MENU:\n[5]."
					+ "  Add an order\n[6]."
					+ "  Calculate order cost\n[0]."
					+ "  Exit\n\nEnter your choice: ");
			switch(myScanner.nextInt()) {
			case 1:
				System.out.println("Item's Information: \n");
				System.out.println("Enter item name: ");
				String name1 = myScanner2.nextLine();
				
				System.out.println("Enter item price: $");
				double price1 = myScanner.nextDouble();
				
				System.out.println("Enter item quantity: ");
				int quantity1 = myScanner.nextInt();
				
				myInventory.addItem(name1, price1, quantity1);
				//////////////////////////////////////////////////////////////
				System.out.println("Provider's Information: \n");
				System.out.println("Enter provider name: ");
				String providerName = myScanner2.nextLine();
				
				System.out.println("Enter country code: ");
				int countryCode = myScanner.nextInt();
				
				System.out.println("Enter area code: ");
				int areaCode = myScanner.nextInt();

				System.out.println("Enter phone number: ");
				int phoneNumber = myScanner.nextInt();
				
				myProvider.addItemProvider(providerName, countryCode, areaCode,phoneNumber);
				
				System.out.println("Physical or Digital item? ");
				String question= myScanner2.nextLine();
				if(question.equalsIgnoreCase("Digital") || question.equalsIgnoreCase("digital")) {
				System.out.println("Enter disk space: ");
				Double diskSpace= myScanner.nextDouble();
				System.out.println("Digital item added successfully.");
				}
				if(question.equalsIgnoreCase("Physical") || question.equalsIgnoreCase("physical")) {
					System.out.println("Enter width: ");
					Double width= myScanner5.nextDouble();
					System.out.println("Enter length: ");
					Double length= myScanner6.nextDouble();
					System.out.println("Enter height: ");
					Double height= myScanner6.nextDouble();
					System.out.println("Physical item added successfully.");
					}
				break;
			
			case 2:
				myInventory.displayAllItems();
				myProvider.displayProvider();
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
				System.out.println("Order cost for " + myOrder.getItemQuantity2() + " " + myOrder.getItemName2() + " is : $ " + myOrder.calculateOrderCost(myInventory.getPrice(),myOrder.getItemQuantity2()) + "\n");
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
