package week2.day3;

public class Edgechild extends Chromechild {
	
	String browserName="Edge";
	double browserVersion=1.15;
	
	
	public void takeSnap() {
		System.out.println("Snap is taken in " +browserName +" "+browserVersion );

	}
	
	public void clearCookies() {
		System.out.println("Cookies are cleared " +browserName +" "+browserVersion );

	}
	
	public static void main(String[] args) {
		Edgechild ED=new Edgechild();
		
		ED.openURL("Edge",1.16);
		ED.openIncognito();
		ED.takeSnap();
		ED.clearCookies();
		
	}

}
