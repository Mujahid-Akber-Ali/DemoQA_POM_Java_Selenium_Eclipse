import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
	
	 public void Checkbox_Selection(WebDriver driver) throws InterruptedException {
	Thread.sleep(2000);
    driver.findElement(By.cssSelector("#item-1")).click();
    driver.findElement(By.cssSelector("#tree-node > div > button.rct-option.rct-option-expand-all > svg")).click();
    driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg")).click();
    driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg")).click();
    driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg")).click();
    driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg")).click();

   
    Thread.sleep(3000);
    driver.findElement(By.cssSelector(".rct-option-collapse-all")).click();
	 }
}
