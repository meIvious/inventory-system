package InventorySystem;
import java.util.ArrayList;
import java.util.List;

import InventorySystem.Order;
import InventorySystem.Provider;


public class InventorySystem {

	
	public static int id = 0;
	private static List<String> name = new ArrayList<>();
	private static List<Double> price = new ArrayList<>();
	public static List<Integer> quantity = new ArrayList<>();
	
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	
public void addItem(String name1, Double price1 , int quantity1 ) {
		
		if(id<5) {
			name.add(name1);
            price.add(price1);
            quantity.add(quantity1);
            System.out.println("Item added successfully.");
            id++;
	}
			else {
				System.out.println("Inventory is full.\n");
	}
}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void displayAllItems() {
		for (int i = 0;id>i; i++) {
			 System.out.println("Item: " + (i+1));
	         System.out.println("Name: " + name.get(i));
	         System.out.println("Price: $" + price.get(i));
	         System.out.println("Quantity: " + quantity.get(i) + "\n");
	     }
	}
	
	public int getTotalNumberOfItems() {
		return id ;
   }
	
	public double calculateTotalWorth(){
		double sum = 0.0;
		for(int i=0;i<id;i++) {
			sum += quantity.get(i)* price.get(i);
		}
		return sum;
}
	
	
	public void setItemName(String itemName,int num) {
		name.set(num, itemName);	
}
	
	public String getItemName(int num) {
		return name.get(num);
	}
	
	
	  public List<Double> getPrice() {
		    return price;
		  }
	
	 public void setPrice(List<Double> newPrice) {
		    this.price = newPrice;
		  }
	 
	 
	 public List<Integer> getQuantity() {
		    return quantity;
		  }
	
	 public void setQuantity(List<Integer> newQuantity) {
		    this.quantity = newQuantity;
		  }
	 
	 
	
		
		/*public void setItemPrice(String itemPrice,int num) {
			this.name[num] = itemPrice;		
	}
		
		public Double getItemPrice(int num) {
			return this.price[num];
		}*/
}



	