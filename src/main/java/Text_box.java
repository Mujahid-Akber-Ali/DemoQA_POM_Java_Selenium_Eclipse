import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class Text_box {
	
	 public void TextBox_Entry(WebDriver driver) throws InterruptedException {
	  	 
	 driver.findElement(By.id("userName")).sendKeys("Mujahid Akber Ali");
     driver.findElement(By.id("userEmail")).sendKeys("mujahidakberali@gmail.com");
     driver.findElement(By.id("currentAddress")).sendKeys("Karachi, Pakistan");  
     driver.findElement(By.id("permanentAddress")).sendKeys("Karachi, Pakistan");
     Thread.sleep(1000);
     driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
     Thread.sleep(1000);
     driver.findElement(By.id("submit")).click();
	 
	 }
}
