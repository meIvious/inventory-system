package InventorySystem;

public class PhysicalItem extends Item{

	
	private double width;
	private double length;
	private double height;
	public PhysicalItem(String[] itemName, Double[] itemPrice, int[] itemQuantity, int phoneNumber) {
		super();
		// TODO Auto-generated constructor stub
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
 
 
	public Double getHeight() {
	    return height;
	  }

 public void setHeight(Double newHeight) {
	    this.height = newHeight;
	  }

}
