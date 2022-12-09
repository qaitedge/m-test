package pratice.itedge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Praticepage {
	//WebDriver driver;
	public static WebElement element = null;
	
	public static WebElement practicebutton(WebDriver driver) {
		element=driver.findElement(By.linkText("Practice"));
		return element; 
		
	}
	
	public static WebElement searchbutton(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@id=\"name\"]"));
		return element; 
		
	}
	

	
	
	
	

}
