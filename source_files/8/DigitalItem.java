package InventorySystem;
import java.util.ArrayList;
import java.util.List;
public class DigitalItem extends Item {

	
	private Double diskSpace;
	

	private double width;
	private double length;
	private double heigth;
	/*private String type = "Digital" ;*/
	
	
	public DigitalItem(String itemName, double itemPrice, int itemQuantity, double diskSpace2) {
		super();
	    this.diskSpace = diskSpace;
	}

	
	public Double getdiskSpace() {
	    return diskSpace;
	  }

 public void setdiskSpace(Double newdiskSpace) {
	    this.diskSpace = newdiskSpace;
	  }
 public Double getWidth() {
	    return width;
	  }

public void setWidth(Double newWidth) {
	    this.width = newWidth;
	  }

	public Double getLength() {
	    return length;
	  }

public void setLength(Double newLength) {
	    this.length = newLength;
	  }


	public Double getHeigth() {
	    return heigth;
	  }

public void setHeight(Double newHeight) {
	    this.heigth = newHeight;
	  }

@Override
public String getServiceType() {
	return null;
}


@Override
public Double calculateService() {
	return null;
}


@Override
public void displayServiceInfo() {

}


@Override
public Double calculateShippingFee() {

	return null;
}


@Override
public int updateQuantity(int purchasedQuantity, int num) {
	if(InventorySystem.quantity.get(num) - purchasedQuantity >= 0) {
		return InventorySystem.quantity.get(num) - purchasedQuantity;
		}
		else
			 System.out.println("Invalid quantity.");
		return num;
}


@Override
public double calculateVolumetricWeight(String itemName, double width, double length, double height) {
	/* double length = 0,height = 0,weight = 0;
	 double volimetric=(length*height*weight)/5000; */
	double weight = 0;
	this.width = width;
	this.length = length;
	this.heigth = height;
	if(itemName=="digital" || itemName=="Digital") {
	return weight;
	}
	else if(itemName == "Physical" || itemName=="physical") {
		weight =(width * length * height)/5000;
		
		
		return weight;
	}
	return weight;
}


@Override
public double calculateTotalWorth() {
	 double sum = 0.0;

	    for (int i = 0; i < itemName.size(); i++) {
	        double totalWorth = itemPrice.get(i) * itemQuantity.get(i);
	        sum += totalWorth;
	    }
		System.out.println("Total Worth of Inventory: " + sum);
		return sum;
	
}
	
}
