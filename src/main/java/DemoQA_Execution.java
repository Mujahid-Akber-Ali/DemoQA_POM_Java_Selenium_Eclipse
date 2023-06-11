import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class DemoQA_Execution{

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void exampleTest() throws InterruptedException {
    	driver.get("https://demoqa.com/");
        driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#item-0")).click();
        
        Text_box Obj_Text_box = new Text_box();
        Obj_Text_box.TextBox_Entry(driver);
        
        CheckBox Obj_CheckBox = new CheckBox();
        Obj_CheckBox.Checkbox_Selection(driver);
        
        RadioButton Obj_RadioButton = new RadioButton();
        Obj_RadioButton.RadioButton_Selection(driver);
        
        WebTables Obj_WebTables = new WebTables();
        Obj_WebTables.WebTables_Entry(driver);
        
        PracticeForm Obj_PracticeForm = new PracticeForm();
        Obj_PracticeForm.PracticeForm_Entry(driver);
        
    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
