package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class intro {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.facebook.com");
	}

}
