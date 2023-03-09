package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Laptops 
{
	WebDriver driver;
	public Laptops(WebDriver driver)
	{
		this.driver = driver;
	}
	By Laptops = By.xpath("//a[text()='Laptops']");
	By MacBook = By.xpath("//a[text()='MacBook Pro']");
	By VerifyingMessage = By.xpath("//h2");
	public void ClickLaptops()
	{
		driver.findElement(Laptops).click();
	}
	public void ClickLaptopName(String s)
	{
		driver.findElement(MacBook).click();
	}
	public void VerifyLaptop()
	{
		String q = driver.findElement(VerifyingMessage).getText();
		System.out.println(q);
	}
}
