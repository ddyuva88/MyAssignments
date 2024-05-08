package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		// Declare a String array and add the values 
				String[] company = { "HCL", "Wipro", "Aspire Systems", "CTS" };
				
				List<String> companyList=new ArrayList<String>();
				
				for (String i : company) {
					
					companyList.add(i);
				}
				
				Collections.sort(companyList);
				System.out.println(companyList);
				System.out.println("List Size:" +companyList.size());
				
				for (int i = companyList.size()-1; i >=0; i--) {
					System.out.print(companyList.get(i)+",");
				}
				

	}

}
