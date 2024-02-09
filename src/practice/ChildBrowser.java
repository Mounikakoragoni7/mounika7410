package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildBrowser {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.ajio.com");
//driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("black kurti's under 2000");

//driver.findElement(By.xpath("//span[@class='ic-search']")).click();
//driver.findElement(By.xpath("")).click();

	}
}
