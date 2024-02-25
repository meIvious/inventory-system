package InventorySystem;

public class Streaming implements Services{

	@Override
	public String getServiceType() {
		
		return null;
	}

	
	public Double calculateService(Double costPerDay,int days,Double fee) {
		
		
		return (costPerDay*days) + fee;
	}

	@Override
	public void displayServiceInfo() {
		
		
	}


	public Double calculateShippingFee(Double fee) {
		
		
		return fee;
	}


	@Override
	public Double calculateService() {
		
		return null;
	}


	@Override
	public Double calculateShippingFee() {
		
		return null;
	}


	
}
