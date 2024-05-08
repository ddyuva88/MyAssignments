package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] array1 = {3, 2, 11, 4, 6, 7};
		
		List<Integer> arrayList=new ArrayList<Integer>();
		
		for (Integer i : array1) {
			arrayList.add(i);
			
		}
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		int size=arrayList.size();
		System.out.println("arrayListSize:" +size);
		
		System.out.println("Second Largest Num in the Arraylist :" +arrayList.get(size-2));
		
		
		

	}

}
