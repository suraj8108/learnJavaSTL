package abasics;

class Decimal{
	private final double decimalValue;
	
	public Decimal(double value) {
		decimalValue = value;
	}
	
	public double getDecimal() {
		return decimalValue;
	}
}

class SingleTon{
	private static SingleTon st = null;
	private SingleTon() {
		
	}
	
	static SingleTon getReference(){
		if(st != null) {
			return st;
		} else {
			st = new SingleTon();
			return st;
		}
	}
}

public class A7MutableClass {

	public static void main(String[] args)  {
		// Immutable class
		Decimal dc = new Decimal(10.1);
		System.out.println(dc.getDecimal());
		
		//Singleton Class
		SingleTon st = SingleTon.getReference();
		System.out.println(st);
	}
}
