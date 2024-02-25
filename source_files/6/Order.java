package InventorySystem;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import InventorySystem.InventorySystem;
import InventorySystem.Item;
import InventorySystem.Order;
import InventorySystem.Provider;

public class Order implements Comparable<Double>{
	
	public static int orderID = 0;
	private static List<String> itemName = new ArrayList<>();
	private static List<Integer> quantity2 = new ArrayList<>();
	private static List<String> itemType = new ArrayList<>();
	private static List<Double> priceRatio = new ArrayList<>();
	
	private static List<String> destinationRegion = new ArrayList<>();
	private static List<String> destinationCity = new ArrayList<>();
	private static List<Integer> destinationPostCode = new ArrayList<>();
	public InventorySystem inventory;
	
	private static List<String> foodname = new ArrayList<>();
	private static List<String> restaurantname = new ArrayList<>();
	private static List<Double> mealprice = new ArrayList<>();
	private static List<Integer> foodcount = new ArrayList<>();
	
	private static List<String> title = new ArrayList<>();
	private static List<String> category = new ArrayList<>();
	private static List<Double> perday = new ArrayList<>();
	private static List<Integer> days = new ArrayList<>();
	
	InventorySystem myInventory = new InventorySystem();
//////////////////////////////////////////////////////////////////////////////////////////

	public void displayAllFoods() {
		for (int i = 0;orderID>i; i++) {
			 System.out.println("Item: " + (i+1));
	         System.out.println("Food Name: " + foodname.get(i));
	         System.out.println("Restaurant Name: " + restaurantname.get(i));
	         System.out.println("Price: $" + mealprice.get(i)*foodcount.get(i));
	     }
	}
	
	public void displayAllStreams() {
		for (int i = 0;orderID>i; i++) {
			 System.out.println("Item: " + (i+1));
	         System.out.println("Title: " + title.get(i));
	         System.out.println("Category: " + category.get(i));
	         System.out.println("Price: $" + perday.get(i)*days.get(i));
	     }
	}

	
	public int getTotalNumberOfServices() {
		return orderID ;
   }
	
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

public static List<Double> getPerday() {
	return perday;
}

public static void setPerday(List<Double> perday) {
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

public void setdestinationPostCode(List<Integer> newdestinationPostCode) {
this.destinationPostCode = newdestinationPostCode;
}

public List<Integer> getdestinationPostCode() {
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
getFoodname().add(foodname1);
getRestaurantname().add(restaurantname1);
getMealprice().add(mealprice1);
getFoodcount().add(foodcount1);
System.out.println("Food Delivery added successfully.");
orderID++;
}
else {
System.out.println("Food Inventory is full.\n");
}
}



public void addStream(String title1,String category1, double perday1 , int days1 ) {

if(orderID<5) {
getTitle().add(title1);
getCategory().add(category1);
getPerday().add(perday1);
getDays().add(days1);
System.out.println("Stream added successfully.");
orderID++;
}
else {
System.out.println("Stream Inventory is full.\n");
}
}



public void addItem5(String itemName1 ,int quantity3 ,String destinationRegion1,String destinationCity1,int destinationPostCode1) {
		
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
	
	if (i < quantity.size() && quantity.get(i) - quantity2.get(i) >= 0) {
        displayOrderInfo();
        System.out.println("Order has been placed successfully.");
    } }
    
	
}




public double calculateOrderCost(List <Double> price,List<Integer> quantity3) {
	
	double sum=0.0;
	for(int i=0;i<orderID;i++) {
		sum += price.get(i) * quantity3.get(i);
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

	public String toString(){
		   return myInventory.getPrice() + "/" + getItemQuantity2();
		}

	@Override
    public int compareTo(Order other) {
        double totalOrderCost = calculateOrderCost(myInventory.getPrice(),getItemQuantity2());

        if (totalOrderCost != other.calculateOrderCost(other.myInventory.getPrice(),other.getItemQuantity2())) {
            return Double.compare(other.calculateOrderCost(other.myInventory.getPrice(),other.getItemQuantity2()),totalOrderCost);
        } else {
            return 0;
        }
    }

	
}
