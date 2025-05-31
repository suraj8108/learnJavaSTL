package abasics;

import java.util.*;
import java.io.*;
public class A4UserInputs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		
		System.out.println("Your fetched name is " + name);
		System.out.println("Your fetched age is " + age);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		
		System.out.println("Enter your address");
		try {
			String address = bf.readLine();
			System.out.println("Your address is " + address);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
