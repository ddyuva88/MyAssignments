package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String str="PayPal India";
		
		System.out.println("b4 Set = "+str);
		char[] Ch = str.toCharArray();
		
		Set<String> charSet =new LinkedHashSet<String>();
		
		for (Object i : Ch) {
		charSet.add(i.toString());
		
		
		
			
		}
		
		System.out.println("after Set = "+charSet);
		
		
		List<String> charList=new ArrayList<String>(charSet);
		
		for (int i = 0; i < charList.size(); i++) {
			String str1=charList.get(i).trim();
			
			System.out.print(str1);
			
		}
	}

}
