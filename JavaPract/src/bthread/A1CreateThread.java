package bthread;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Create a thread by extending the Thread class
class MyThread extends Thread  {
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
			System.out.println("Thread " + Thread.currentThread().getId());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

// Create thread using Runnable interface.
class MyRunnableThread implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Runnable Interface " + Thread.currentThread().getId());	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class A1CreateThread {

	public static void main(String[] args) {
		
//		System.out.println(Thread.currentThread().getPriority());
		
//		int[] arr = new int[] {1,2,3,4,5,6,8,9,10};
		
//		List.of(1,2,3,4,5,6,8,9,10).stream().filter((a) -> a == 10).collect(Collectors.toList());
		
		for(int i = 0; i < 10; i++) {
			MyThread th = new MyThread();
			th.start();
		}
		
		for(int i = 0; i < 10; i++) {
			Thread th = new Thread(new MyRunnableThread());
			th.start();
		}
	}
}
