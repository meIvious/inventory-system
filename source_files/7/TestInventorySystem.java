package InventorySystem;
import java.util.List;
import java.util.Scanner;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;

import InventorySystem.InventorySystem;
import InventorySystem.Item;
import InventorySystem.Order;
import InventorySystem.Provider;
public class TestInventorySystem {


	public static void main(String[] args) {
		 SwingUtilities.invokeLater(() -> {
	            try {
	                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	            } catch (Exception e) {
	                e.printStackTrace();
	            }

	            // Instantiate and display the GUI
	            InventoryManagementGUI gui = new InventoryManagementGUI();
	            gui.setVisible(true);
	        });
		Scanner myScanner = new Scanner(System.in);
		Scanner myScanner2 = new Scanner(System.in);
		Scanner myScanner3 = new Scanner(System.in);
		Scanner myScanner4 = new Scanner(System.in);
		Scanner myScanner5 = new Scanner(System.in);
		Scanner myScanner6 = new Scanner(System.in);
		Scanner myScanner7 = new Scanner(System.in);
		Scanner myScanner8 = new Scanner(System.in);
		Scanner myScanner9 = new Scanner(System.in);
		Scanner myScanner10 = new Scanner(System.in);
		Scanner myScanner11 = new Scanner(System.in);
		Scanner myScanner12 = new Scanner(System.in);
		Scanner myScanner13 = new Scanner(System.in);
		Scanner myScanner14 = new Scanner(System.in);
		Scanner myScanner15 = new Scanner(System.in);
		Scanner myScanner16 = new Scanner(System.in);
		Scanner myScanner17 = new Scanner(System.in);
		Scanner myScanner18 = new Scanner(System.in);
		Scanner myScanner19 = new Scanner(System.in);
		Scanner myScanner20 = new Scanner(System.in);
		Scanner myScanner21 = new Scanner(System.in);
		Scanner myScanner22 = new Scanner(System.in);
		Scanner myScanner23 = new Scanner(System.in);
		Scanner myScanner24 = new Scanner(System.in);
		InventorySystem myInventory = new InventorySystem();
		Order myOrder = new Order();
		Provider myProvider = new Provider();
		
		//////////////////////////////
		while(true) {
			System.out.printf("INVENTORY MENU:\n"
					+ "[1].  Add a new Service\n"+ "[2].  "
					+ "Display all services\n[3].  "
					+ "Display the total number of services\n[4].  "
					+ "Calculate the Total Worth of the Inventory\n"
					+ "[5].  Increase Price of Specific Type\n"
					+ "[6].  List Services with Shipping Fee Above a Limit\n"
					+ "[7].  Remove Order For a Specific City\n"
					+ "\n"
					+ " CUSTOMER MENU:\n[8]."
					+ "  Add an order\n[9]."
					+ "  Calculate Order Costs in a Descending Manner\n[0]."
					+ "  Exit\n\nEnter your choice: ");
			 try {
	                int menuChoice = myScanner.nextInt();
	                
			switch(menuChoice) {
			case 1:
				System.out.println("[1]. Item (Physical/Digital)\n" + "[2]. Streaming\n" + "[3]. Food Delivery\n");
				int servicechoice = myScanner11.nextInt();
				if(servicechoice==1){
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
					}
				
				
				else if(servicechoice==2){
					System.out.println("Streaming Information: \n");
					
					System.out.println("Enter title: ");
					String title = myScanner16.nextLine();
					
					System.out.println("Enter category: ");
					String category = myScanner17.nextLine();
					

					System.out.println("Enter cost per day: ");
					double perday = myScanner18.nextDouble();
					
					System.out.println("Enter days: ");
					int days = myScanner19.nextInt();
					
					myOrder.addStream(title, category, perday,days);
				}
				
				if(servicechoice==3){
					System.out.println("Food Delivery Information: \n");
					
					System.out.println("Enter food name: ");
					String foodname = myScanner12.nextLine();
					
					System.out.println("Enter restaurant name: ");
					String restaurantname = myScanner13.nextLine();
					
					System.out.println("Enter meal price: $");
					double mealprice = myScanner14.nextDouble();
					
					System.out.println("Enter food count: ");
					int foodcount = myScanner15.nextInt();
					
					myOrder.addFood(foodname, restaurantname, mealprice,foodcount);
				}
				break;
			
			case 2:
				System.out.println("Enter Display Type: \n");
				System.out.println("[1].Item \n" + "[2].Stream Service: \n" + "[3].Food Service: \n");
				int myChoice=myScanner24.nextInt();
				if(myChoice==1) {
					myInventory.displayAllItems();
					myProvider.displayProvider();
				}
				if(myChoice==2) {
					myOrder.displayAllStreams();
				}
				if(myChoice==3) {
					myOrder.displayAllFoods();
				}
				break;
			
			case 3:
				System.out.println("Total number of items: " + (myInventory.getTotalNumberOfItems() + myOrder.getTotalNumberOfServices()) + "\n");
				break;
			case 4:
				 myInventory.calculateTotalWorth();
				
				break;
			case 5:
				System.out.println("Which type of items will be raised in price?: ");
				String question2= myScanner8.nextLine();
				if(question2.equalsIgnoreCase("Physical") || question2.equalsIgnoreCase("physical")) {
					System.out.println("How much will the raise ratio(%) be?: ");
					double ratio=myScanner7.nextDouble()/100;
					System.out.println("The raise ratio was applied to Physical items.\n");
					myOrder.addRatio(question2, ratio);
					myInventory.displayAllItems();
					myProvider.displayProvider();
					}
				break;
			case 6:
				System.out.println("Enter a limit: ");
				double limit=myScanner9.nextDouble();
				Item item = null;
				 if(limit>item.getFee()) {
				    	System.out.println("There is no item with a shipping fee over this limit.");}
				    else
				    	System.out.println("Items with shipping fees over"+limit+"");
				break;
			case 7:
				System.out.println("Type a city name to remove orders in a specific city: ");
				String cityName=myScanner10.nextLine();
				List<Services> remove = new ArrayList<>();
				List<String> temp = new ArrayList<>(Order.getdestinationCity());
				
				for (int i = 0; i < myOrder.orderID; i++) {
				    if (myOrder.getdestinationCity2(i).equals(cityName)) {
				        myOrder.removeOrder(i);
				        System.out.println("The order for " + cityName + " was deleted successfully.");
				    }
				}
				break;
			case 8:
				/*try {*/
				System.out.println("Enter the item name you want to order: ");
				String itemName=myScanner4.nextLine();
				System.out.println("Enter the quantity: ");
				int quantity2 = myScanner3.nextInt();
				 System.out.println("Enter destination region: ");
				   String region=myScanner20.nextLine();
				   
				   System.out.println("Enter destination city: ");
				   String city=myScanner21.nextLine();
				   
				   System.out.println("Enter destination post code: ");
				   int postcode=myScanner22.nextInt();
				
				myOrder.addItem5(itemName, quantity2,region,city,postcode);
				myOrder.checkStorage(myInventory.getQuantity());
				/*}*/	/*catch(Exception e) {
					int quantity2 = myScanner3.nextInt();
					 quantity2 = myScanner3.nextInt();
	                	int quantity1 = myScanner.nextInt();
						if(quantity1 - quantity2 < 0 ) {
							System.out.println("The item you are trying to order is not in inventory. Please select another item." + e );
							myScanner.nextLine();
						}
					}*/
				break;
			case 9:
			    double orderCost = myOrder.calculateOrderCost(myInventory.getPrice(),myOrder.getItemQuantity2());

			    if (orderCost > 0) {
			    	
			        System.out.println("Calculate Order Costs in a Descending Manner: ");

			        List<String> itemName1 = myOrder.getItemName2();
			        List<Integer> quantity = myOrder.getItemQuantity2();
			        List<Double> prices = myInventory.getPrice();

			        List<Integer> sortedIndices = new ArrayList<>();
			        for (int i = 0; i < myOrder.getTotalNumberOfServices(); i++) {
			            sortedIndices.add(i);
			        }

			        Collections.sort(sortedIndices,Comparator.comparingDouble(prices::get));

			        for (int index : sortedIndices) {
			            System.out.println("Total price: $" + prices.get(index) * quantity.get(index));
			            System.out.println();
			        }

			        System.out.println("Total Order Cost: $" + orderCost + "\n");
			    } else {
			        System.out.println("No items in the order. Order cost is $0.0\n");
			    }
				break;
			case 0:
				System.out.println("Exiting... Good Bye!");
				System.exit(0);
			
			default:
				System.out.println("Wrong input!");			
			}
		}
            catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a valid menu option.");
                myScanner.nextLine();
            }
			 catch (Exception e) {
				 int menuChoice = myScanner.nextInt();
				 if(menuChoice > 9 || menuChoice < 0) {
	                System.err.println("You entered an invalid menu option. Enter again.");
	                myScanner.nextLine();
				 }
	            }
	}

	}
}
