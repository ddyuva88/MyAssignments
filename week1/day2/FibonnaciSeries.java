package week1.day2;

public class FibonnaciSeries {

	public static void main(String[] args) {

		int range=8;
		int fn=0; 
		int sn=1;
		int num;
		System.out.println("Fibonacci series of "+range+" is");
		for (int i=1;i<=range;i++)
		{
			num=fn+sn;
			System.out.println(fn);
			fn=sn;
			sn=num;

		}
	}

}