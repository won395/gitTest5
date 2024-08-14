package day10;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add("글자: "+i);
		}
		endTime = System.nanoTime();
		System.out.println("Array"+list1);
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add("글자: "+i);
		}
		endTime = System.nanoTime();
		System.out.println("Array"+list2);
	}
}
