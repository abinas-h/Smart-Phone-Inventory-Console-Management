import java.util.*;
import java.util.ArrayList;
public class StoreController {
	
	Scanner sc = new Scanner(System.in);
	
	
	//creating array list of SmartPhoneInventoryModel reference data type.
	ArrayList<SmartPhoneInventoryModel> smartPhoneInventory = new ArrayList<SmartPhoneInventoryModel>();


	private int phonePosition;



	
	public void addNewProduct(){
		
		System.out.println("-----------------------------------------***********---------------------------------------------------");
		
		System.out.println("Please enter the Module Code");
		int modelCode = Integer.parseInt(sc.nextLine());
		
		System.out.println("Please enter the Quantity ");
		int quantity=sc.nextInt();
		
		System.out.println("Please enter the Price");
		int price=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please enter the Manufacturer Name");
		String manufacturer=sc.nextLine();
		
		System.out.println("Please enter the Module Name");
		String name=sc.nextLine();
		
		System.out.println("Please enter the Release Date Of the Module");
		String releaseDate=sc.nextLine();
		
		
//		creating the instance of SmartPhoneInventoryModel class
		SmartPhoneInventoryModel sPI = new SmartPhoneInventoryModel(modelCode, quantity,price,
																	manufacturer,name, releaseDate);
		
		
		
//		initializing the array list with sPI variable everytime this method is called. the name of the instance is same 
//		but the location of them are different every time they are called.
		this.smartPhoneInventory.add(sPI);
		
		System.out.println(sPI.getManufacturer()+" "+sPI.getModelCode()+" "+sPI.getName()+" "+sPI.getPrice());
		
		System.out.println("Model Number: "+modelCode+" added to the inventory");

		System.out.println("-----------------------------------------***********---------------------------------------------------");
	
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
	
	/*
	 * this method delete product by asking the model code as argument and 
	 * by using for each loop it checks the mode code of each instance added in smartPhoneInventory array list
	 * it removes if it finds the model code matching by using instance.getModelCode method
	 * and removes it if its present.
	 * */
	public void deleteProduct(int modelCode ) {
		System.out.println("-----------------------------------------***********---------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();

		for (SmartPhoneInventoryModel i :smartPhoneInventory ) {
			
			if(i.getModelCode()== modelCode) {
				
				smartPhoneInventory.remove(i);
				
				System.out.println("Model number: " +modelCode+ " removed from the inventory.");
				
			}else {
				System.out.println("Model Number: "+modelCode+" Smart Phone not Found.");
			}
		}
		System.out.println("-----------------------------------------***********---------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	
	/*
	 * this method update the details of instance present in 
	 * smartPhoneInventory array list and call for 
	 * setter method to update the values since the instance variable in SmartPhoneInventoryModel
	 * are private it needs to use setter method to do so.
	 * */
	public void updateProduct() {
		System.out.println("-----------------------------------------***********---------------------------------------------------");
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("Please enter the Module Code");
		int modelCode = Integer.parseInt(sc.nextLine());
		
		for (SmartPhoneInventoryModel i :smartPhoneInventory ) {
			
			if(i.getModelCode()== modelCode) {
				
				System.out.println("Please enter the Quantity ");
				i.setQuantity(Integer.parseInt(sc.nextLine()));
				
				
				System.out.println("Please enter the Price");
				i.setPrice(Integer.parseInt(sc.nextLine()));
				
				
				System.out.println("Please enter the Manufacturer Name");
				i.setManufacturer(sc.nextLine());
				
				
				System.out.println("Please enter the Module Name");
				i.setName(sc.nextLine());
				
				
				System.out.println("Please enter the Release Date Of the Module");
				i.setReleaseDate(sc.nextLine());
				
				System.out.println("Model Number "+modelCode+" Smart Phone inventory updated.");
				
			}else {
				System.out.println("Model Number "+modelCode+" Smart Phone not Found.");
			}
			
		}
		
		
		System.out.println("-----------------------------------------***********---------------------------------------------------");
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public SmartPhoneInventoryModel getSmartPhoneInfo() {
		
		System.out.println("-----------------------------------------***********---------------------------------------------------");
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int modelCode;
		
		for (SmartPhoneInventoryModel i :smartPhoneInventory ) {
			System.out.println("Please enter the Model Code of the Phone.");
			modelCode = Integer.parseInt(sc.nextLine());
			
			if(i.getModelCode()== modelCode) {
				
				this.phonePosition = smartPhoneInventory.indexOf(i);
				
				System.out.println("Model code  	   : "+i.getModelCode());
				System.out.println("Model Name		   : "+i.getName());
				System.out.println("Manufacturer	   : "+i.getManufacturer());
				System.out.println("Price		: "+i.getPrice());
				System.out.println("Quantity Abialable : "+i.getQuantity());
				System.out.println("Release Date	   : "+i.getReleaseDate());
				
				
			}else
				
				System.out.println("Model Number: "+modelCode+" Smart Phone not Found.");
			
		}
		
		System.out.println("-----------------------------------------***********---------------------------------------------------");
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		return smartPhoneInventory.get(phonePosition);
		
			
	}
	
	public static void main(String [] Args) {
		StoreController storeController = new StoreController();
		storeController.addNewProduct();
		storeController.addNewProduct();
		
		for(SmartPhoneInventoryModel i :storeController.smartPhoneInventory) {
			System.out.println(i);
		}
		
		storeController.deleteProduct(1);
		
		for(SmartPhoneInventoryModel i :storeController.smartPhoneInventory) {
			System.out.println(i);
		}
		
		storeController.updateProduct();
		
		storeController.getSmartPhoneInfo();
		
		
		
	}
	
}
	
	
	
	
	
	

