package selinaldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr3=new ChromeDriver();
		dr3.get("https://demo.guru99.com/test/newtours/register.php");
		//dr3.findElement(By.name("firstName")).sendKeys("akshay");
		
		//action class perform to get in tab and perform operations  so create object of action class w
		Actions act =new Actions(dr3);
		WebElement w=dr3.findElement(By.name("firstName"));
		w.sendKeys("akshay");
		//double click
		act.doubleClick(w).build().perform();
		
		//right click
		act.contextClick(w).build().perform();
		
	}

}
