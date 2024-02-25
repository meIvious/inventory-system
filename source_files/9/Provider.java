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
	    return providerName;
	  }

 public void setproviderName(List<String> newproviderName) {
	    this.providerName = newproviderName;
	  }
 ///////////////////////////////////////////////////////
	public List<Integer> getcountryCode() {
	    return countryCode;
	  }

 public void setcountryCode(List<Integer> newcountryCode) {
	    this.countryCode = newcountryCode;
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
			providerName.add(providerName1);
			countryCode.add(countryCode1);
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
         System.out.println("Provider: " + providerName.get(i));
         /*System.out.println("Country Code: " + countryCode.get(i));
         System.out.println("Area Code: " + areaCode.get(i));*/
         System.out.println("Provider Contact: "+ "+" + countryCode.get(i)+ "(" + areaCode.get(i)+ ") " + phoneNumber.get(i) + "\n");
        
     }
}

}

