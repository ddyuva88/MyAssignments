package week1.day3;

import java.util.Arrays;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		// TO find second largest
		
		int data[]= {3,2,11,4,6,7};

		int len=data.length;
		
		Arrays.sort(data);
		
		System.out.println("2nd largest element : " +data[len-2]);
			
		}
}
