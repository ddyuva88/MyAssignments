package week1.day3;

import java.util.Arrays;

public class PrintReverseString {
	
	public static void main(String[] args) {
		// TO find second largest
		String companyName="TestLeaf";
		
		char ch[]=companyName.toCharArray();

	for (int i = ch.length-1; i>=0; i--) {
		
		System.out.print(ch[i]);
		
	}
		}
}
