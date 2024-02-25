package InventorySystem;
import java.util.List;
import java.util.ArrayList;

public class Provider {
	int providerid=0;
	private List <String> providerName=new ArrayList<>();
	private List<Integer> countryCode=new ArrayList<>();
	private List <Integer> areaCode=new ArrayList<>();
	private List <Integer> phoneNumber=new ArrayList<>();
	//////////////////////////////////////////////////////////////////////////////////////////////
	
	public List<String> getproviderName() {
	    return getProviderName();
	  }

 public void setproviderName(List<String> newproviderName) {
	    this.setProviderName(newproviderName);
	  }
 ///////////////////////////////////////////////////////
	public List<Integer> getcountryCode() {
	    return getCountryCode();
	  }

 public void setcountryCode(List<Integer> newcountryCode) {
	    this.setCountryCode(newcountryCode);
	  }
 
 ///////////////////////////////////////////////////////////////////
 public List<Integer> getphoneNumber() {
	    return phoneNumber;
	  }

public void setphoneNumber(List<Integer> newphoneNumber) {
	    this.phoneNumber = newphoneNumber;
	  }
/////////////////////////////////////////////////////////////////////
public List<Integer> getareaCode() {
    return areaCode;
  }

public void setareaCode(List<Integer> newareaCode) {
    this.areaCode = newareaCode;
  }
	
public void addItemProvider(String providerName1, int countryCode1 , int areaCode1,int phoneNumber1 ) {
		
		if(providerid<5) {
			getProviderName().add(providerName1);
			getCountryCode().add(countryCode1);
			areaCode.add(areaCode1);
			phoneNumber.add(phoneNumber1);
            System.out.println("Item added successfully.");
            providerid++;
	}
			else {
				System.out.println("Inventory is full.\n");
	}
}


public void displayProvider() {
	for (int i = 0;providerid>i; i++) {
		 System.out.println("Item: " + (i+1));
         System.out.println("Provider: " + getProviderName().get(i));
         /*System.out.println("Country Code: " + countryCode.get(i));
         System.out.println("Area Code: " + areaCode.get(i));*/
         System.out.println("Provider Contact: "+ "+" + getCountryCode().get(i)+ "(" + areaCode.get(i)+ ") " + phoneNumber.get(i) + "\n");
        
     }
}

public List <String> getProviderName() {
	return providerName;
}

public void setProviderName(List <String> providerName) {
	this.providerName = providerName;
}

public List<Integer> getCountryCode() {
	return countryCode;
}

public void setCountryCode(List<Integer> countryCode) {
	this.countryCode = countryCode;
}

}

