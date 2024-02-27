
import java.util.ArrayList;


public class StoreApp {

	ArrayList<SmartPhoneInventoryModel> smartPhoneInventoryModel;
	
	static  StoreController storeController = new StoreController();
	
	public static void main(String[] args) {
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
	
	
