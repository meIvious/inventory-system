package InventorySystem;
import InventorySystem.Order;
public class InventorySystem {
	public int id = 0;
	public String[] name= new String[5];
	public Double[] price = new Double[5] ;
	public int[] quantity= new int[5];
	
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	
public void addItem(String name1, Double price1 , int quantity1 ) {
		
		if(id<5) {
			this.name[id] = name1;
			this.price[id]= price1;
			this.quantity[id] = quantity1;
			System.out.println("Item added successfully.\n");
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
	         System.out.println("Name: " + name[i]);
	         System.out.println("Price: $" + price[i]);
	         System.out.println("Quantity: " + quantity[i] + "\n");
	     }
	}
	
	public int getTotalNumberOfItems() {
		return id ;
   }
	
	public double calculateTotalWorth(){
		int sum = 0;
		for(int i=0;i<id;i++) {
			sum += quantity[i]* price[i];
		}
		return sum;
}
	
	
	/*public String getItemName(int num) {
		return this.name[num];
	}
		
		public void setItemName(String itemName,int num) {
			this.name[num] = itemName;		
	}
		
		public void setItemPrice(String itemPrice,int num) {
			this.name[num] = itemPrice;		
	}
		
		public Double getItemPrice(int num) {
			return this.price[num];
		}*/
}



	