import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton {
	
	 public void RadioButton_Selection(WebDriver driver) throws InterruptedException {
	 driver.findElement(By.cssSelector("#item-2")).click();
     driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3)")).click(); 
	 }
}
