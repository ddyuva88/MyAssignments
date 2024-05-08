package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListMissingElement {

	public static void main(String[] args) {
		
		int[] array1 = { 1, 2, 3, 4, 10, 7, 8 };
		
		List<Integer> arrayList=new ArrayList<Integer>();
		
		for (Integer i : array1) {
			arrayList.add(i);
			
		}
		
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		for (int i = 0; i < arrayList.size()-1; i++) {
			
			if (arrayList.get(i + 1) != (arrayList.get(i) + 1)) {
				System.out.println((arrayList.get(i) + 1));
			}
			
		}

}
	
}
