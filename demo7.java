package selinaldemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver dr3=new ChromeDriver();
		dr3.get("https://demoqa.com/alerts");
		
		dr3.findElement(By.id("alertButton")).click();
		Thread.sleep(4000);
		Alert al =dr3.switchTo().alert();
		System.out.println(al.getText());
		dr3.findElement(By.id("promptButton")).click();
	//	dr.findElement(By.name("lastName")).sendKeys("prajapati");
	//	Alert al1 =dr3.switchTo().alert();
		//System.out.println(al1.getText());
		al.accept();
		
		
		
	
	}

}
