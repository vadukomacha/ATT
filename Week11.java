package att;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(1000);
		WebElement profile=driver.findElement(By.xpath("//span[normalize-space()='Profile']"));
         profile.click();
         Thread.sleep(1000);
         WebElement login=driver.findElement(By.xpath("//a[normalize-space()='login / Signup']"));
        login.click();
        Thread.sleep(1000);
        WebElement mobileno=driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
        mobileno.sendKeys("9160510123");
        Thread.sleep(1000);
        WebElement check=driver.findElement(By.xpath("//input[@class='consentCheckbox']"));
        check.click();
        Thread.sleep(1000);
        WebElement proceed=driver.findElement(By.xpath("//div[normalize-space()='CONTINUE']"));
        proceed.click();
        Thread.sleep(1000);
       

	}

}
