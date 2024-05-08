package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		//Declare Arrays
		
		int[] array1 = { 3, 2, 11, 4, 6, 7 };
		int[] array2 = { 1, 2, 8, 4, 9, 7 };
		
		//Initialise ArrayList 1
		
		List<Integer> arrayList1=new ArrayList<Integer>();
		
		for (Integer i : array1) {
			arrayList1.add(i);
		}
		
		//Sort the ArrayList 1 and print 
		Collections.sort(arrayList1);
		System.out.println(arrayList1);
		
		System.out.println("---------------------");
		
		//Initialise ArrayList 1
		
		List<Integer> arrayList2=new ArrayList<Integer>();
		
		for (Integer i : array2) {
			arrayList2.add(i);
		}
		
		//Sort the ArrayList 2 and print 
		Collections.sort(arrayList2);
		System.out.println(arrayList2);
		
		System.out.println("---------------------");
		
		for (int i = 0; i < arrayList1.size(); i++) {
			for (int j = 0; j < arrayList2.size(); j++) {
				// Compare both the arrayList
				// print the values if they are equal
				if (arrayList1.get(i) == arrayList2.get(j)) {
					System.out.println("both arrays intersect at: " + arrayList2.get(j));
				}
			}
		}
	}
}