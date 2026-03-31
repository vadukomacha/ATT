package att;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week4 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://duckduckgo.com/");
		Thread.sleep(1500);
		d.findElement(By.name("q")).sendKeys("Federal Bank Personal Banking\n");
		Thread.sleep(1500);
		d.findElement(By.xpath("//span[normalize-space()='Personal Banking Services | NRI, Business, & Online Banking | Federal Bank']")).click();
		Thread.sleep(1500);
		d.findElement(By.xpath("//i[@onclick='closeHomePopup()']")).click();
		Thread.sleep(1500);

	}

}



