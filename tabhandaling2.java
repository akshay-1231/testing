package selinaldemo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabhandaling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr3=new ChromeDriver();
		
			
			String Pw= dr3.getWindowHandle();
			dr3.navigate().to("https://www.google.com");
		
		
			dr3.switchTo().newWindow(WindowType.TAB);
			String sw= dr3.getWindowHandle();
			dr3.navigate().to("https://www.gmail.com");
			dr3.switchTo().newWindow(WindowType.TAB);
			String tw= dr3.getWindowHandle();
			dr3.navigate().to("https://www.facebook.com");
			dr3.switchTo().newWindow(WindowType.TAB);
			String fw= dr3.getWindowHandle();
			dr3.navigate().to("https://www.github.com");
			dr3.switchTo().newWindow(WindowType.TAB);
		dr3.switchTo().window(Pw);
		     
	}

}
