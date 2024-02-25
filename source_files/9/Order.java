package InventorySystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import InventorySystem.InventorySystem;

public class Order {
	
	public static int orderID = 0;
	private static List<String> itemName = new ArrayList<>();
	private static List<Integer> quantity2 = new ArrayList<>();
	
	public InventorySystem inventory;
	
	/*InventorySystem[] myInventory = new InventorySystem[5];*/
	
	public List<String> getItemName2() {
	    return itemName;
	  }

 public void setName(List<String> newitemName) {
	    this.itemName = newitemName;
	  }
 /////////////////////////////////////////////////////
 public List<Integer> getItemQuantity2() {
	    return quantity2;
	  }

public void setQuantity2(List<Integer> newQuantity2) {
	    this.quantity2 = newQuantity2;
	  }
	
	/////////////////////////////////////////////////////////////////////////////
	

public void addItem5(String itemName1 ,int quantity3 ) {
		
	if(orderID<5) {
		itemName.add(itemName1);
		quantity2.add(quantity3);
        orderID++;
}
		

}		

public void checkStorage(List <Integer>quantity) {
	for(int i=0;i<orderID;i++) {
	if(quantity.get(i) - quantity2.get(i)>= 0) {
		displayOrderInfo();
		System.out.println("Order has been placed successfully.");
	}
	else
		System.out.println("Item not found in inventory. Order cannot be placed.");
	}
	
}




public double calculateOrderCost(List <Double> price,List<Integer> quantity22) {
	double sum=0.0;
	for(int i=0;i<orderID;i++) {
		sum += price.get(i) * quantity22.get(i);
	}
	return sum;
}


	public void displayOrderInfo() {
		
			 System.out.println("Order ID: " + (orderID + 1));
	         System.out.println("Name: " + itemName);
	         System.out.println("Quantity: " + quantity2 + "\n");
	     
	}
	
	
	
}
