import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQATest {

    String projectLocation = System.getProperty("user.dir");

    ChromeDriver driver;


    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", projectLocation + "/recourses/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");


    }

    @Test
    public void testOne() {

        WebElement button = driver.findElementById("idExample");
        button.click();

        //assrtions
        WebElement text = driver.findElementByClassName("entry-title");
       // WebElement textUsingXpath = driver.findElementByXPath("//*[@class='entry-title']");
        Assertions.assertEquals("Button success", text.getText());



    }
    @AfterEach
    public  void teardown(){
        //roznica driver.quit() a driver.close()
        //driver.quit();
    }


   @Test
    public void testTwo(){
      WebElement nameInput = driver.findElementByName("et_pb_contact_name_0");
        nameInput.sendKeys("Tester");

        WebElement emailInput = driver.findElementByName("et_pb_contact_email_0");
        emailInput.sendKeys("tester@tester.pl");

    }
}
