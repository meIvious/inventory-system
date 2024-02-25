package InventorySystem;

public class FoodDelivery implements Services{

	@Override
	public String getServiceType() {
		return null;
	}

	
	public Double calculateService(Double mealPrice,int quantity,Double fee) {
		
		return (mealPrice*quantity) + fee;
	}

	@Override
	public void displayServiceInfo() {
		
	}

	public Double calculateShippingFee(Double fixedValue) {
		fixedValue=5.0;
		return fixedValue;
	}

	@Override
	public Double calculateShippingFee() {
		return null;
	}


	@Override
	public Double calculateService() {
		return null;
	}

}
