
public class SmartPhoneInventoryModel {
	private int modelCode;
	private int quantity;
	private int price;
	private String manufacturer;
	private String name;
	private String releaseDate;
	


	public SmartPhoneInventoryModel(int modelCode, int quantity, int price, String manufacturer, String name,
			String releaseDate) {
		
		this.modelCode = modelCode;
		this.quantity = quantity;
		this.price = price;
		this.manufacturer = manufacturer;
		this.name = name;
		this.releaseDate = releaseDate;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getModelCode() {
		return modelCode;
	}

	public void setModelCode(int modelCode) {
		this.modelCode = modelCode;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
