package selinaldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver dr3=new ChromeDriver();
		dr3.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions act =new Actions(dr3);
		WebElement drag=dr3.findElement(By.id("fourth"));
		WebElement drop=dr3.findElement(By.id("amt7"));
		act.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2000);
		WebElement drag1=dr3.findElement(By.id("credit2"));
		Thread.sleep(2000);
		WebElement drop1=dr3.findElement(By.id("bank"));
		act.dragAndDrop(drag1, drop1).build().perform();
		
		
		
		
		
		
	}

}
