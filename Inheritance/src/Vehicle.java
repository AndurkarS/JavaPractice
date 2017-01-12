
public class Vehicle {
	private String vehicleType;
	private int noOfGears;
	private int speed;
	private String color;
	
	public Vehicle(String vehicleType, int noOfGears, int speed, String color) {
		super();
		this.vehicleType = vehicleType;
		this.noOfGears = noOfGears;
		this.speed = speed;
		this.color = color;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public int getSpeed() {
		return speed;
	}

	public String getColor() {
		return color;
	}
	
	public void changeGears(){
		System.out.println("Changing gears");
	}
	
	public void increaseSpeed(int speed){
		this.speed+=speed;
		System.out.println("Speed increased");
	}
	
	public void decreaseSpeed(int speed){
		this.speed-=speed;
		System.out.println("Speed decreased");
	}
	
	
    

}
