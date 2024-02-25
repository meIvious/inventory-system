package InventorySystem;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import InventorySystem.Order;
import InventorySystem.Provider;
import InventorySystem.Item;


public class InventorySystem {

	
	public static final String itemName = null;
	public static int id = 0;
	private static List<String> name = new ArrayList<>();
	private List<Double> price = new ArrayList<>();
	public static List<Integer> quantity = new ArrayList<>();
	private Double priceGUI;
	Provider myProvider = new Provider();
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	enum InventoryMenu {
	    ADD_NEW_ITEM,	
	    DISPLAY_ALL_ITEMS,
	    DISPLAY_TOTAL_NUMBER_OF_ITEMS,
	    CALCULATE_TOTAL_WORTH,
	}
	
	enum CustomerMenu {
	    ADD_AN_ORDER,
	    CALCULATE_ORDER_COST,
	    EXIT,
	}
	
	
	public void addNewService() {
	    String itemName = JOptionPane.showInputDialog("Enter the name of the item:");
	    double itemPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the item:"));
	    int itemQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity of the item:"));

	    addItem(itemName, itemPrice, itemQuantity);
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void addItem(String name1, Double price1 , int quantity1 ) {
		
		if(id<8) {
			name.add(name1);
            price.add(price1);
            quantity.add(quantity1);
            System.out.println("Item added successfully.");
            JOptionPane.showMessageDialog(null, "Item added successfully."); 
            id++;
	}
			else {
				System.out.println("Inventory is full.\n");
	}
		if (!name.contains(name1)) {
            try {
                throw new NoSuchItemException("The item you are trying to order is not in inventory. Please select another item.");
            } catch (NoSuchItemException e) {
                System.err.println(e.getMessage());
            }
        }
}



public Double getPriceGUI(String itemName) {
    int index = name.indexOf(itemName);
    if (index >= 0 && index < price.size()) {
        return price.get(index);
    } else {
        // Handle the case when itemName is not found or index is out of bounds
        JOptionPane.showMessageDialog(null, "Item not found or invalid index.", "Error", JOptionPane.ERROR_MESSAGE);
        return 0.0; // or another appropriate value
    }
}


	public void displayAllItems() {
		for (int i = 0;id >i; i++) {
			 System.out.println("Item: " + (i+1));
	         System.out.println("Name: " + name.get(i));
	         System.out.println("Price: $" + price.get(i));
	         System.out.println("Quantity: " + quantity.get(i) + "\n");
	     }
	}
	public String displayAllItemsGUI() {
	    StringBuilder itemsInformation = new StringBuilder();

	    for (int i = 0; id > i; i++) {
	        itemsInformation.append("Item: ").append(i + 1).append("\n");
	        itemsInformation.append("Name: ").append(name.get(i)).append("\n");
	        itemsInformation.append("Price: $").append(price.get(i)).append("\n");
	        itemsInformation.append("Quantity: ").append(quantity.get(i)).append("\n\n");
	    }
	    System.out.println(itemsInformation.toString());
	    return itemsInformation.toString();
	}
	
	public boolean serviceExists(String serviceName) {
        for (int i = 0; i < id; i++) {
            if (name.get(i).equalsIgnoreCase(serviceName)) {
                return true;
            }
        }
        return false;
    }
	
	
	public int getQuantity(String serviceName) {
        for (int i = 0; i < id; i++) {
            if (name.get(i).equalsIgnoreCase(serviceName)) {
                return quantity.get(i);
            }
        }
        return -1; // Return -1 or another appropriate value if service is not found
    }
	
	
	
	public int getTotalNumberOfItems() {
		return id ;
   }
	
	public void calculateTotalWorth(){
		/*double sum = 0.0;*/
		for(int i=0;i<id;i++) {
            System.out.println("Total Worth of Item " + name.get(i) + ": $" + quantity.get(i)*price.get(i));
			/*sum += quantity.get(i)* price.get(i);*/
		}
		/*return sum;*/
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
	public void addItemDigital(DigitalItem digItem) {
		
		
	}
	public void addItemPhysical(PhysicalItem phyItem) {
		
		
	}
	 
	 
	
		
		/*public void setItemPrice(String itemPrice,int num) {
			this.name[num] = itemPrice;		
	}
		
		public Double getItemPrice(int num) {
			return this.price[num];
		}*/
	 
	
}



	