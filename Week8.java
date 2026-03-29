package att;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Week8 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://duckduckgo.com");
		driver.findElement(By.name("q")).sendKeys("cmrit hyderabad \n");
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		Thread.sleep(1000);
		WebElement img=driver.findElement(By.xpath("//img[@alt='CMR Institute of Technology | Top Engineering College in Hyderabad']"));
		Actions action= new Actions(driver);
		action.contextClick(img).build().perform();
		Thread.sleep(2000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

}
}
