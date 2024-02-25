package InventorySystem;

public class InventorySystem {
	int id = 0;
	String[] name= new String[5];
	Double[] price = new Double[5];
	int[] quantity = new int[5];
	
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public void addItem(String name1, Double price1 , int quantity1 ) {
		
		if(id<5) {
			this.name[id] = name1;
			this.price[id]= price1;
			this.quantity[id] = quantity1;
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
	         System.out.println("Name: " + name[i]);
	         System.out.println("Price: " + price[i]);
	         System.out.println("Quantity: " + quantity[i]);
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
}



	