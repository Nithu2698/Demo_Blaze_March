package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Phones 
{
	WebDriver driver;
	public Phones(WebDriver driver)
	{
		this.driver = driver;
	}
	By Phone = By.xpath("//a[text()='Phones']");
	By Iphone = By.xpath("//a[text()='Iphone 6 32gb']");
	By VerifyingMessage = By.xpath("//h2");
	public void ClickPhonesTab()
	{
		driver.findElement(Phone).click();
	}
	public void ClickIphone(String s)
	{
		driver.findElement(Iphone).click();
	}
	public void VerifyingMessagePhone()
	{
		String a = driver.findElement(VerifyingMessage).getText();
		System.out.println(a);
	}
}
