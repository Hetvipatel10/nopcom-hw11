package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class RegisterTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";


    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //Click on Register link
        WebElement register=driver.findElement(By.xpath("//div[@class='header-links']//a[text()='Register']"));
        register.click();

        //verify the text register
        WebElement registerLink=driver.findElement(By.xpath("//div[@class='header-links']//a[text()='Register']"));
        String actualText=registerLink.getText();
        String expectedText="Register";
        assertEquals(expectedText,actualText);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //click on the ‘Register’ link
        WebElement register=driver.findElement(By.xpath("//div[@class='header-links']//a[text()='Register']"));
        register.click();

        //Select gender radio button
        WebElement gender=driver.findElement(By.xpath("//div[@id='gender']//span[@class='female']"));
        gender.click();

        //enter first name
        WebElement firstn=driver.findElement(By.id("FirstName"));
        firstn.sendKeys("Hetvi");

        //enter lastname
        WebElement lastn=driver.findElement(By.id("LastName"));
        lastn.sendKeys("Patel");

        //select day
        WebElement day=driver.findElement(By.name("DateOfBirthDay"));
        Select select=new Select(day);
        select.selectByVisibleText("10");

        //select month
        WebElement month=driver.findElement(By.xpath("//div[@class='date-picker-wrapper']//select[@name='DateOfBirthMonth']"));
        Select select1=new Select(month);
        select1.selectByVisibleText("june");

        //select year
        WebElement year=driver.findElement(By.name("DateOfBirthYear"));
        Select select2=new Select(year);
        select2.selectByVisibleText("1997");

        //enter email
        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("patelhetvi20@gmail.com");

        //enter password
        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("123456");

        //confirm password
        WebElement confPassword=driver.findElement(By.id("ConfirmPassword"));
        confPassword.sendKeys("123456");

        //click on register button
        WebElement regisetrButton=driver.findElement(By.id("register-button"));
        regisetrButton.click();

        //verify text 'Your registration completed’
        WebElement text=driver.findElement(By.xpath("//div[@class='page registration-result-page']"));
        String actualText= text.getText();
        String expextedText="Your registarion completed";
        assertEquals(expextedText,actualText);

    }



    @After
    public void tearDown() {
        closeBrowser();
    }

}
