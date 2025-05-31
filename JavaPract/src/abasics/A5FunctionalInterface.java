package abasics;

@FunctionalInterface
interface Vehicle {
	void drive(int distance, int speed);
}

@FunctionalInterface
interface HeavyVehicle {
	Truck drive(int distance, int speed);
}

class Car {
	static void drive(int distance, int speed) {
		System.out.println("Car details are " + distance + " " + speed);
	}
}

class Bike {
	
	void drive(int distance, int speed) {
		System.out.println("Bike details are " + distance + " " + speed);
	}
}

class Truck {
	Truck(int distance, int speed){
		System.out.println("Truck details are " + distance + " " + speed);
	}
}

public class A5FunctionalInterface {

	
	
	public static void main(String[] args) {
		
		// Method reference by static
		Vehicle vh1 = Car::drive;
		vh1.drive(10, 20);
		
		// Method reference by instance
		Bike bk = new Bike();
		Vehicle vh2 = bk::drive;
		vh2.drive(20,20);
		
		//  Method reference by constructor
		HeavyVehicle vh3 = Truck::new;
		vh3.drive(30, 30);
	}
}
