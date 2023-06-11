import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTables {
	
	 public void WebTables_Entry(WebDriver driver) throws InterruptedException {
		 driver.findElement(By.cssSelector("#item-2")).click();
	        driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3)")).click();    
	        driver.findElement(By.cssSelector("#item-3")).click();
	        driver.findElement(By.cssSelector("#addNewRecordButton")).click();
	        driver.findElement(By.id("firstName")).sendKeys("Mujahid Akber Ali");
	        driver.findElement(By.id("lastName")).sendKeys("Akber Ali");
	        driver.findElement(By.id("userEmail")).sendKeys("mujahidakberali@gmail.com");  
	        driver.findElement(By.id("age")).sendKeys("23");
	        driver.findElement(By.id("salary")).sendKeys("23,000");
	        driver.findElement(By.id("department")).sendKeys("SQA");
	        driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.modal-header > button")).click();    
	        Thread.sleep(3000); 
		 }
}
