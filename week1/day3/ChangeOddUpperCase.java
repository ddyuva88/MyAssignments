package week1.day3;

public class ChangeOddUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme"; 
		char[] input=test.toCharArray();
		
		for(int i=0; i<input.length; i++) {
			if(i%2==0) {
				System.out.print(input[i]);
			}else {
				char a = Character.toUpperCase(input[i]);
				System.out.print(a);
			}
		}

	}
	}