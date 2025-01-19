package abasics;

class ParentClass {
	
	ParentClass(int a) {
		System.out.println("Parent Constructor " + a);
	}
	
	public void printDetails() {
		System.out.println("Ye to be recieved");
	}
}

public class A1Variable extends ParentClass{
	
	A1Variable(int a) {
		super(a);
		System.out.println("Variable Details");
	}

	public void ParentClass() {
		System.out.println("Check the details");
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,25,2,5,2,54};
		A1Variable var1 = new A1Variable(10);
		var1.ParentClass();
	}

}
