package selenium.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class WebTest
{
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception 
	{
		//driver = new HtmlUnitDriver();
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void  tearDown() throws Exception
	{
		driver.close();
		driver.quit();
	}

	
	@Test
	public void googleExists() throws Exception
	{
		driver.get("http://www.google.com");
        assertEquals("Google", driver.getTitle());		
	}
	
	
	@Test
	public void Verify55() throws Exception //verify is Frustration of Software Developers 
	{
		driver.get("http://www.checkbox.io/studies.html");
		String titlexpath="//div[@class='span8']//span[.='Frustration of Software Developers']";
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(titlexpath)));
		WebElement title=driver.findElement(By.xpath(titlexpath));
		WebElement next= title.findElement(By.xpath("../../following-sibling::div//span[@class='backers']"));
		
		assertNotNull(next);
		assertEquals(next.getText(),"55");
	}
	
	@Test
	public void Closed() throws Exception //total studies closed is 5
	{
		driver.get("http://www.checkbox.io/studies.html");
		
		// http://geekswithblogs.net/Aligned/archive/2014/10/16/selenium-and-timing-issues.aspx
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='status']/span[.='CLOSED']")));
		List<WebElement> spans = driver.findElements(By.xpath("//a[@class='status']/span[.='CLOSED']"));

		assertNotNull(spans);
		assertEquals(5, spans.size());
	}
	
	@Test
	public void Participate() throws Exception //verify if status is open, participate button is clickable
	{
		driver.get("http://www.checkbox.io/studies.html");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='status']/span[.='OPEN']")));
		WebElement spans = driver.findElement(By.xpath("//a[@class='status']/span[.='OPEN']"));
		WebElement next=spans.findElement(By.xpath("../following-sibling::div//button[@class='btn btn-info']"));
		String textS=next.getText();
		assertNotNull(next);
		assertEquals(textS,"Participate");
	}
	
	@Test
	public void VerifyAmazon() throws Exception //verify amazon image available for Software Changes Survey
	{
		driver.get("http://www.checkbox.io/studies.html");
		String titlexpath="//div[@class='span8']//span[.='Software Changes Survey']";
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(titlexpath)));
		WebElement title=driver.findElement(By.xpath(titlexpath));
		WebElement next= title.findElement(By.xpath("../following-sibling::div[@class='award']//div[@data-bind='foreach: awards']//span//img[@src='/media/amazongc-micro.jpg']"));
		assertNotNull(next);
	}
}
