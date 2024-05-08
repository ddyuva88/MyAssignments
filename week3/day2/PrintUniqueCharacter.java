package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	
	public static void main(String[] args) {
		
		String name="DineshKumar";
		System.out.println("b4 removing duplicate characters: "+name);
		
		char[] charArray=name.toCharArray();
		
		Set<Character> nameSet= new HashSet<Character>();
		
		
		for (char c : charArray) {
			
			nameSet.add(c);
			
		}
		
		System.out.println("after Set: "+nameSet);
		
	}	

}
