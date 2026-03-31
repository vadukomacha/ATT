package att;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Week2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://duckduckgo.com/");
		driver.findElement(By.name("q")).sendKeys("Mercury Travels\n");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space()='Mercury Travels']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[normalize-space()='Customer Login'])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[normalize-space()='Register'])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("acc_first_name")).sendKeys("MANASA");    
        Thread.sleep(1000);
		driver.findElement(By.id("acc_last_name")).sendKeys("AMARTHI");
        Thread.sleep(1000);

		driver.findElement(By.id("acc_user_email")).sendKeys("AAAAAA@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.id("acc_user_password")).sendKeys("963210");
		Thread.sleep(1000);

		driver.findElement(By.id("acc_user_passconf")).sendKeys("963210");
		Thread.sleep(1000);

		driver.findElement(By.id("acc_mobile_no")).sendKeys("9876543224");
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//button[normalize-space()='Register'])[1]")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
