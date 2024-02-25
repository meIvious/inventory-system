package InventorySystem;

import java.util.ArrayList;
import java.util.List;

import InventorySystem.InventorySystem;
import InventorySystem.Provider;
import InventorySystem.Order;
import InventorySystem.Provider;


public abstract class Item implements Services {
	
	ArrayList<InventorySystem> myInventory = new ArrayList<>();

	private double width;
	private double length;
	private double heigth;
	private InventorySystem inventory;
	
	public static List<String> itemName = new ArrayList<>();
	public static List<Integer> itemPrice = new ArrayList<>();
	public static List<Integer> itemQuantity = new ArrayList<>();
	public static List<Provider> provider = new ArrayList<>();
	int count =1;
	private double fee;
	protected Provider provider1;
	/*protected String type;*/
	
	
	
	public double getFee() {
        return fee;

}
	
	public void setItemName(int itemQuantity,int num) {
		InventorySystem.quantity.get(num);	
}
	public int getItemName(int itemQuantity,int num) {
		return InventorySystem.quantity.get(num);	
}
	
	
	public abstract int updateQuantity(int purchasedQuantity,int num);
	
	public double calculateVolumetricWeight (String itemName,double width, double length, double height) {
		return 0;
	}
	
	public double calculateShippingFee(String itemName) {
			double fee = 0;
		if(itemName=="digital" || itemName=="Digital") {
			
			return 0;
		}
		
		if(calculateVolumetricWeight(itemName,width,length,heigth) > 1) {
			fee = calculateVolumetricWeight(itemName,width,length,heigth)*0.25*itemPrice.get(0);
			 this.fee = fee;
			/* return  itemPrice * volimetric / 0.25 */;  
		}
		if(calculateVolumetricWeight(itemName,width,length,heigth) > 2) {
			fee = calculateVolumetricWeight(itemName,width,length,heigth)*0.35*itemPrice.get(0);
			 this.fee = fee;
			/*  return itemPrice * volimetric / 0.35;  */
		}
		if(calculateVolumetricWeight(itemName,width,length,heigth) > 3) {
			fee = calculateVolumetricWeight(itemName,width,length,heigth)*0.50*itemPrice.get(0);
			 this.fee = fee;
			/*  return itemPrice * volimetric / 0.50;  */
		}
		else
		
		return fee;
		return fee;
			
	}


	public abstract double calculateTotalWorth();
	

	public void displayAllItems() {
		 for (int i = 0;itemName.size()>i; i++) {
			   System.out.println("Item: " + itemName.get(i));
	           System.out.println("Price: " + itemPrice.get(i));
	           System.out.println("Quantity: " + itemQuantity.get(i));
	       }
	}
}



