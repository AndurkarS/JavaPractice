
public class Main {

	public static void main(String[] args) {
		
		Vehicle bmw = new BMW("Car", 6, 100, "Blue", "BMW", "2016", true);
		bmw.changeGears();
		bmw.decreaseSpeed(20);
		bmw.increaseSpeed(20);
	}

}
