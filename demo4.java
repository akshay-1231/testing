package selinaldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement we=dr.findElement(By.name("firstName"));
		we.sendKeys("ajay");
		Thread.sleep(2000);
		we.clear();
		Thread.sleep(2000);
		we.sendKeys("akshay");
		Thread.sleep(2000);
	String s=	we.getAttribute("value");
	System.out.println(s);
	
	}

}
