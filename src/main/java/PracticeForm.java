import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PracticeForm {
	
	public void PracticeForm_Entry(WebDriver driver) throws InterruptedException {
	driver.navigate().to("https://demoqa.com/automation-practice-form");
    driver.findElement(By.id("firstName")).sendKeys("Mujahid Akber Ali");
    driver.findElement(By.id("lastName")).sendKeys("Akber Ali");
    driver.findElement(By.id("userEmail")).sendKeys("mujahidakberali@gmail.com");
    driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label")).click();
    driver.findElement(By.cssSelector("#userNumber")).sendKeys("3132206219");  

    driver.findElement(By.cssSelector("#dateOfBirthInput")).click();

    driver.findElement(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--select > select")).click();
    driver.findElement(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--select > select")).sendKeys("o");
    driver.findElement(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--select > select")).sendKeys(Keys.ENTER);

    driver.findElement(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__year-dropdown-container.react-datepicker__year-dropdown-container--select > select")).click();
    driver.findElement(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__year-dropdown-container.react-datepicker__year-dropdown-container--select > select")).sendKeys("1999");
    driver.findElement(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__year-dropdown-container.react-datepicker__year-dropdown-container--select > select")).sendKeys(Keys.ENTER);
    
    driver.findElement(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__month > div:nth-child(2) > div.react-datepicker__day.react-datepicker__day--005")).click();

    driver.findElement(By.id("subjectsInput")).sendKeys("math");
    driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("subjectsInput")).sendKeys(Keys.TAB);
    
    driver.findElement(By.id("subjectsInput")).sendKeys("physics");
    driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("subjectsInput")).sendKeys(Keys.TAB);
    

    driver.findElement(By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label")).click();        
    
    driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\aadil\\Desktop\\02.png");
    driver.findElement(By.id("currentAddress")).sendKeys("Karachi,Pakistan");
    
    driver.findElement(By.id("react-select-3-input")).sendKeys("NCR");
    driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);

    driver.findElement(By.id("react-select-4-input")).sendKeys("Delhi");
    driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
    
    driver.findElement(By.id("submit")).click();
    Thread.sleep(3000);
	}
}
