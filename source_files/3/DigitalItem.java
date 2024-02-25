package InventorySystem;
import java.util.ArrayList;
import java.util.List;
public class DigitalItem extends Item {

	
	private Double diskSpace;
	
	public DigitalItem(String[] itemName, Double[] itemPrice, int[] itemQuantity, int phoneNumber) {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Double getdiskSpace() {
	    return diskSpace;
	  }

 public void setdiskSpace(Double newdiskSpace) {
	    this.diskSpace = newdiskSpace;
	  }
	
}
