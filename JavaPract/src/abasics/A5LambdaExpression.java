package abasics;

import java.util.ArrayList;
import java.util.List;

interface PrintStatement{
	public int printDetails(int[] arr);
}

public class A5LambdaExpression {

	
	public static void forEach(PrintStatement ps, int[] arr) {
		System.out.println(
				ps.printDetails(arr));
	}
	
	public static void main(String[] args) {
//		List<Integer> element = new ArrayList<>();
//		element.forEach(null);
		int[] arr = new int[10];
		A5LambdaExpression.forEach((e) -> e[9] , arr);
	}
}
