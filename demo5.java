package selinaldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.guru99.com/test/radio.html");
	//	dr.findElement(By.id("vfb-7-1")).click();
		WebElement we=dr.findElement(By.id("vfb-7-1"));
		Thread.sleep(2000);
	
		we.click();
		Thread.sleep(2000);
		
		WebElement we1=dr.findElement(By.id("vfb-7-2"));
		Thread.sleep(2000);
		
		we1.click();
		WebElement we2=dr.findElement(By.id("vfb-6-0"));
		Thread.sleep(2000);
		we2.click();
	}

}
