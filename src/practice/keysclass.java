package practice;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class keysclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	
	driver.findElement(By.id("email")).sendKeys("mounikakoragoni7@gmail.com",Keys.TAB,"adonai7773",Keys.ENTER);
		////System.out.println("ygjghj");
		

	}

		
	}


