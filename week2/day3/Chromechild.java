package week2.day3;

public class Chromechild extends BrowserParent {
	
	String browserName="Chrome";
	double browserVersion=1.25;
	
	
	
	public void openIncognito() {
		System.out.println("URL is opened in Incognito " +browserName +" "+browserVersion );

	}

	
	public void clearCache() {
		System.out.println("Cache is cleared for " +browserName +" "+browserVersion );

	}
	public static void main(String[] args) {
		
		Chromechild chrome=new Chromechild();
		chrome.openURL("Chrome",1.30);
		chrome.closeBrowser("Chrome",1.30);
		chrome.navigateBack("Chrome",1.30);
		chrome.openIncognito();
		chrome.clearCache();
	

	}

}
