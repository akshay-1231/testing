package selinaldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://demo.guru99.com/test/newtours/register.php");
		dr.findElement(By.name("firstName")).sendKeys("akshay");
		Thread.sleep(2000);
		dr.findElement(By.name("lastName")).sendKeys("prajapati");
		Thread.sleep(2000);
		dr.findElement(By.name("phone")).sendKeys("7218167057");
		
		Thread.sleep(2000);
		dr.findElement(By.name("userName")).sendKeys("akshayprajapat424206@gmail.com");
		Thread.sleep(2000);
		dr.findElement(By.name("address1")).sendKeys("pream nager jamner");
		Thread.sleep(2000);
		dr.findElement(By.name("city")).sendKeys(" jamner");
		Thread.sleep(2000);
		dr.findElement(By.name("state")).sendKeys("maharashtra");
		dr.findElement(By.name("postalCode")).sendKeys("424206");
		dr.findElement(By.name("country")).sendKeys("india");
		Thread.sleep(2000);
		dr.findElement(By.id("email")).sendKeys("akshayprajapati");
		dr.findElement(By.name("password")).sendKeys("akshay@124");
		dr.findElement(By.name("confirmPassword")).sendKeys("akshay@124");
		
		dr.findElement(By.name("submit")).click();
		//WebElement we=null;
	//	Select sr=new Select(dr.findElement(By.name("ANGOLA")));
		
		
		
	}

}
