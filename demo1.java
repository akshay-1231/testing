package selinaldemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method 
		
		WebDriver dr= new ChromeDriver();     //to open webpage 
		dr.get("https://www.google.com");
		//Thread.sleep(2000);                      
		WebDriver dr1= new ChromeDriver();
		dr1.get("https://www.gmail.com");
		
		WebDriver dr3=new ChromeDriver();
		dr3.get("https://www.demoblaze.com");
		
		//dr.manage().window().maximize();       //maximize size of page
	String s=dr.getTitle();         //to get title of website
		System.out.println(s);
		String s1=dr1.getTitle();         //to get title of website
		System.out.println(s1);
		
		
		//System.out.println(dr.getCurrentUrl()); //to get current url
		
		//if(s=s1) {                  //compare url
		//	System.out.println("string matches");
		//}else {
		//	System.out.println("string not matches");
		
		//dr.navigate().back();
		//to close browser
		dr.close();
		dr1.close();
		}
		
	}


