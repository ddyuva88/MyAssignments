package week2.day3;

public class Calculator {
	
	public int add(int x,int y) {
		int z=x+y;
		return z;
		
	}
	
	public int add(int x,int y,int w) {
		int z1=x+y+w;
		return z1;
		
	}
	
	public double mul(double x,double y) {
		double m1=x*y;
		return m1;
		
	}
	
	public float mul(float x,double y) {
		float m2=(float) (x*y);
		return m2;
		
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add(5, 5));
		System.out.println(c.add(4, 3, 2));
		System.out.println(c.mul(256, 10));
		System.out.println(c.mul(1.5,3.2));
		
		
		

	}

}
