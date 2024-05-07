package week2.day3;


public class BrowserParent {
	String browserName;
	double browserVersion ;
	
	public void openURL(String browserName,double browserVersion) {
		
		System.out.println("URL is opened " +browserName +" "+browserVersion );
	}
	
	public void closeBrowser(String browserName,double browserVersion) {
		System.out.println("URL is closed " +browserName +" "+browserVersion );

	}
	
	public void navigateBack(String browserName,double browserVersion) {
		
		System.out.println("URL is navigated to previous state " +browserName +" "+browserVersion);
	}
	
	

}
