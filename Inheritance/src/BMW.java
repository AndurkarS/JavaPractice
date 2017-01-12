
public class BMW extends Car {
	private boolean autotransmission;
	
	
	
	public BMW(String vehicleType, int noOfGears, int speed, String color,
			String brand, String yearOfManufacturing, boolean autotransmission) {
		super(vehicleType, noOfGears, speed, color, brand, yearOfManufacturing);
		this.autotransmission = autotransmission;
	}
	@Override
	public void changeGears() {
		// TODO Auto-generated method stub
		super.changeGears();
	}
	@Override
	public void decreaseSpeed(int speed) {
		// TODO Auto-generated method stub
		super.decreaseSpeed(speed);
	}
	
	
	
}
