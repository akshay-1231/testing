package selinaldemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr3=new ChromeDriver();
	//	dr3.get("https://www.google.com");
		
		String Pw= dr3.getWindowHandle();
		dr3.navigate().to("https://www.google.com");
		//to open new tab
	
		dr3.switchTo().newWindow(WindowType.TAB);
		String cw= dr3.getWindowHandle();
		dr3.navigate().to("https://www.gmail.com");
		dr3.switchTo().window(Pw);
	
	
	}

}
