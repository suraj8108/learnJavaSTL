package abasics;

class Universe {
	
	// Step1: Creating a private constructor
	private Universe() {
		
	}
	
	// Step2: Creating private attribute of class type
	private static final Universe universeRef = new Universe();
	
	// Step3: Creating method that returns singleton object
	static Universe getUniverse() {
		return universeRef;
	}
	
	public void getDetails() {
		System.out.println("Hello Suraj");
	}
}

public class A2SingletonClass {

	public static void main(String[] args) {
		Universe ub = Universe.getUniverse();
		ub.getDetails();
	}
}
