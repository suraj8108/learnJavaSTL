package abasics;

class OuterClass {
	
	int outerVal;
	
	public OuterClass() {
		
	}
	
	public void outerFunc() {
		System.out.println("Access Outer Class");
	}
	InnerClass ic;
	class InnerClass {
		int innerVal;
		public InnerClass() {
			
		}
		
		public void innerFunc() {
			System.out.println("Access Inner Class");
		}
	}
}

public class A3InnerClass {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.outerFunc();
		
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.innerFunc();
	}
}
