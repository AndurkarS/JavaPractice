
public class Car extends Vehicle {
	private String brand;
	private String yearOfManufacturing;
	
	public Car(String vehicleType, int noOfGears, int speed, String color,
			String brand, String yearOfManufacturing) {
		super(vehicleType, noOfGears, speed, color);
		this.brand = brand;
		this.yearOfManufacturing = yearOfManufacturing;
	}
	
	public void handleSteering(){
		System.out.println("Handling steering");
	}
	

}
