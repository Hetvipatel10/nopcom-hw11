package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class TopMenuTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseurl);
    }


    @Test
    public void  userShouldNavigateToComputerPageSuccessfully(){
        //Click on the computer tab
        WebElement computerLink =driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
        computerLink.click();

        //Verify the text Computers
        WebElement Computers=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
        String actualText=Computers.getText();
        String expectedText="Computers";
        assertEquals(expectedText,actualText);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on Electronics tab
        WebElement ElectronicsLink =driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
        ElectronicsLink.click();

        //Verify the text Electronics
        WebElement Electronics=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
        String actualText=Electronics.getText();
        String expectedText="Electronics";
        assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //Click on Apparel tab
        WebElement apparelLink=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
        apparelLink.click();

        //Verify the text Apparel
        WebElement Apparel=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
        String actualText=Apparel.getText();
        String expectedText="Apparel";
        assertEquals(expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on the Books Tab
        WebElement BookLink=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
        BookLink.click();

        //Verify the text Books
        WebElement Books=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
        String actualText=Books.getText();
        String expectedText="Books";
        assertEquals(expectedText,actualText);


    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //click on the Jewelry Tab
        WebElement jewelryLink=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
        jewelryLink.click();

        //Verify the text Jewelry
        WebElement Jewelry=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
        String actualText=Jewelry.getText();
        String expectedText="Jewelry";
        assertEquals(expectedText,actualText);


    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //click on the Gift Cards Tab
        WebElement giftCard=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
        giftCard.click();

        WebElement gift=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
        String actualText=gift.getText();
        String expectedText="Gift Cards";
        assertEquals(expectedText,actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
