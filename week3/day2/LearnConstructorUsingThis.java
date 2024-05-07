package week3.day2;

public class LearnConstructorUsingThis {
	
	int x;
	int y;
	//Constructor Chaining concept
	public LearnConstructorUsingThis() {
		
		System.out.println("no Arg Constructor");
	
	}
	
	public LearnConstructorUsingThis(int x) {
		this();
		this.x=x;
		System.out.println("Single Arg Constructor "+x);
	
	}
	
	public LearnConstructorUsingThis(int x,int y) {
		this(x);
		this.x=x;
		this.y=y;
				
		System.out.println("Multi Arg Constructor "+x +","+y);
	
	}
	
	public static void main(String[] args) {
		LearnConstructorUsingThis lcThis=new LearnConstructorUsingThis(10,20);
		
	}
	
	
	
}
	
	

	