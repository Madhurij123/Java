
public class Vehicle {
	private int vechicleId;
	private String model;
	private String type;
	private double price;

	
	public Vehicle() {
		
	}
	

	public Vehicle(int vechicleId, String model, String type, double price) {
		super();
		this.vechicleId = vechicleId;
		this.model = model;
		this.type = type;
		this.price = price;
	}



	public int getVechicleId() {
		return vechicleId;
	}

	public void setVechicleId(int vechicleId) {
		this.vechicleId = vechicleId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [vechicleId=" + vechicleId + ", model=" + model + ", type=" + type + ", price=" + price + "]";
	}

}
