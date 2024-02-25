package InventorySystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import InventorySystem.InventorySystem;

public class Order {
	
	public static int orderID = 0;
	private static List<String> itemName = new ArrayList<>();
	private static List<Integer> quantity2 = new ArrayList<>();
	private static List<String> itemType = new ArrayList<>();
	private static List<Double> priceRatio = new ArrayList<>();
	
	private static List<String> destinationRegion = new ArrayList<>();
	private static List<String> destinationCity = new ArrayList<>();
	private static List<String> destinationPostCode = new ArrayList<>();
	public InventorySystem inventory;
	
	private static List<String> foodname = new ArrayList<>();
	private static List<String> restaurantname = new ArrayList<>();
	private static List<Double> mealprice = new ArrayList<>();
	private static List<Integer> foodcount = new ArrayList<>();
	
	private static List<String> title = new ArrayList<>();
	private static List<String> category = new ArrayList<>();
	private static List<Integer> perday = new ArrayList<>();
	private static List<Integer> days = new ArrayList<>();
//////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
public void setdestinationRegion(List<String> newdestinationRegion) {
	    this.destinationRegion = newdestinationRegion;
  }
 
public static List<String> getFoodname() {
	return foodname;
}

public static void setFoodname(List<String> foodname) {
	Order.foodname = foodname;
}

public static List<String> getRestaurantname() {
	return restaurantname;
}

public static void setRestaurantname(List<String> restaurantname) {
	Order.restaurantname = restaurantname;
}

public static List<Double> getMealprice() {
	return mealprice;
}

public static void setMealprice(List<Double> mealprice) {
	Order.mealprice = mealprice;
}

public static List<Integer> getFoodcount() {
	return foodcount;
}

public static void setFoodcount(List<Integer> foodcount) {
	Order.foodcount = foodcount;
}

public static List<String> getTitle() {
	return title;
}

public static void setTitle(List<String> title) {
	Order.title = title;
}

public static List<String> getCategory() {
	return category;
}

public static void setCategory(List<String> category) {
	Order.category = category;
}

public static List<Integer> getPerday() {
	return perday;
}

public static void setPerday(List<Integer> perday) {
	Order.perday = perday;
}

public static List<Integer> getDays() {
	return days;
}

public static void setDays(List<Integer> days) {
	Order.days = days;
}

public void setdestinationRegion1(List<String> newdestinationRegion) {
    this.destinationRegion = newdestinationRegion;
}

public List<String> getdestinationRegion() {
return destinationRegion;
}



public void setdestinationCity(List<String> newdestinationCity) {
this.destinationCity = newdestinationCity;
}



public static List<String> getdestinationCity() {
return destinationCity;
}


public static String getdestinationCity2(int num) {
return destinationCity.get(num);
}

public void setdestinationPostCode(List<String> newdestinationPostCode) {
this.destinationPostCode = newdestinationPostCode;
}

public List<String> getdestinationPostCode() {
return destinationPostCode;
}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////
	/*InventorySystem[] myInventory = new InventorySystem[5];*/
	public void setRatio(List<Double> newratio) {
	    this.priceRatio = newratio;
	  }
 
public List<Double>  getRatio() {
    return priceRatio;
  }
	//////////////////////////////////////////////////////////////////////////
	 public void setItemType(List<String> newitemType) {
		    this.itemType = newitemType;
		  }
	 
	public List<String> getItemType() {
	    return itemType;
	  }
	/////////////////////////////////////////////////////////////////////////
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
	
public void addFood(String foodname1,String restaurantname1, Double mealprice1 , int foodcount1 ) {

if(orderID<5) {
foodname.add(foodname1);
restaurantname.add(restaurantname1);
mealprice.add(mealprice1);
foodcount.add(foodcount1);
System.out.println("Food Delivery added successfully.");
orderID++;
}
else {
System.out.println("Food Inventory is full.\n");
}
}



public void addStream(String title1,String category1, int perday1 , int days1 ) {

if(orderID<5) {
title.add(title1);
category.add(category1);
perday.add(perday1);
days.add(days1);
System.out.println("Stream added successfully.");
orderID++;
}
else {
System.out.println("Stream Inventory is full.\n");
}
}



public void addItem5(String itemName1 ,int quantity3 ,String destinationRegion1,String destinationCity1,String destinationPostCode1) {
		
	if(orderID<5) {
		itemName.add(itemName1);
		quantity2.add(quantity3);
		destinationRegion.add(destinationRegion1);
		destinationCity.add(destinationCity1);
		destinationPostCode.add(destinationPostCode1);
        orderID++;
}
}		


public void removeOrder(int removeItem) {
	itemName.remove(removeItem);
	quantity2.remove(removeItem);
	destinationRegion.remove(removeItem);
	destinationCity.remove(removeItem);
	
	orderID--;
			
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
	
	
	
	
	public void addRatio(String itemType1 ,Double ratio2 ) {
		
		if(orderID<5) {
			itemType.add(itemType1);
			priceRatio.add(ratio2);
	        orderID++;
	}
	}	

	
}
