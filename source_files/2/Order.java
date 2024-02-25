package InventorySystem;
import InventorySystem.InventorySystem;

public class Order {
	int orderID = 0;
	InventorySystem[] myInventory = new InventorySystem[5];
	public String itemName;
	public int quantity2;
	
	
	public Order(int id, String itemName, int quantity2) {
		this.orderID = id;
		this.itemName = itemName;
		this.quantity2 = quantity2;
	}
	

public void addItem5(String itemName ,int quantity2 ) {
		
		if(orderID<5) {
			this.itemName = itemName;
			this.quantity2 = quantity2;
			orderID++;
	}

}		

public void checkStorage(int[] quantity) {
	for(int i=0;i<orderID;i++) {
	if(quantity[i] - quantity2>= 0) 
		displayOrderInfo();
	
	else
		System.out.println("Item not found in inventory. Order cannot be placed.");
	}
	
}




public double calculateOrderCost(Double[] price,String[]name) {
	int sum=0;
	for(int i=0;i<orderID;i++) {
		sum += price[i]* quantity2;
	}
	return sum;
}


	public void displayOrderInfo() {
		
			 System.out.println("Order ID: " + (orderID + 1));
	         System.out.println("Name: " + itemName);
	         System.out.println("Quantity: " + quantity2 + "\n");
	     
	}
	
	
	
}
