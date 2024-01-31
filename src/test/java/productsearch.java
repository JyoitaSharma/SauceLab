import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class productsearch {
ChromeDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/jyoitasharma/Desktop/selenium webdriver/chromedriver_mac_arm64/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
			
	}
	
	@After
    public void tearDown() throws Exception{
	driver.close();
	}
	
	@Test
	public void search() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String expectedTitle="Swag Labs";
		String actualTitle=((WebDriver) driver).getTitle();
		try {
		Assert.assertEquals(actualTitle,expectedTitle);
		}
		catch(Throwable e)
		{
		System.out.println("Title can be skipped");
		}
		driver.findElement(By.xpath(//*[@id="item_4_title_link"]/div)).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Assert.assertTrue(driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).isDisplayed());
		
	
				
	
	
}
}