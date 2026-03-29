package att;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Week3 {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://duckduckgo.com/");

		driver.findElement(By.name("q")).sendKeys("Facebook login or signup\n");

		Thread.sleep(1500);

		driver.findElement(By.xpath("//span[normalize-space()='Facebook - log in or sign up']")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//a[normalize-space()='Create new account']")).click();

		Thread.sleep(1500);

		driver.findElement(By.name("firstname")).sendKeys("Dimpi");

		Thread.sleep(500);

		driver.findElement(By.name("lastname")).sendKeys("Nannaka");

		Thread.sleep(500);

		driver.findElement(By.id("day")).sendKeys("25");

		Thread.sleep(500);

		driver.findElement(By.id("month")).sendKeys("November");

		Thread.sleep(500);

		driver.findElement(By.id("year")).sendKeys("2006");

		Thread.sleep(1500);

		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();

		Thread.sleep(500);

		driver.findElement(By.name("reg_email__")).sendKeys("nannakadimpi2006@gmail.com");

		Thread.sleep(500);

		driver.findElement(By.id("password_step_input")).sendKeys("Hello2345678()");

		Thread.sleep(500);

		driver.findElement(By.name("websubmit")).click();

		


}
}




