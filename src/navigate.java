import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class navigate {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(3000);
		driver.navigate().to("htpps://www.facebook.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().refresh();

			}
			
		

}
