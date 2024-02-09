package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class swaglabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		String exceptedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(exceptedTitle))
		{
			System.out.println("pass");
	
		}
		else {
			System.out.println("fail");

			
		}
			
		}
		


	}


