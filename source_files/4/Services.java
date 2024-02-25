package InventorySystem;

public interface Services {
	  abstract String getServiceType();
	  abstract Double calculateService();
	  abstract void displayServiceInfo();
	  abstract Double calculateShippingFee();
}
