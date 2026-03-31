package att;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week7 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://duckduckgo.com/");
		Thread.sleep(1500);
		driver.findElement(By.name("q")).sendKeys("CMRIT Hyberabad\n");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='CMR Institute of Technology - Top Engineering collage in Hyderabad")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='closebtn']")).click();
		Thread.sleep(2000);
		driver.quit();
}

}
