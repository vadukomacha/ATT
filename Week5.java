package att;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Week5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		Thread.sleep(1000);

		WebElement search=driver.findElement(By.name("p"));
		search.sendKeys("cmrit syllabus");
		search.sendKeys(Keys.ENTER);

		WebElement li=driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[1]/div/div[3]/ul[1]/li/a"));
		li.click();

		String parent = driver.getWindowHandle();
		      System.out.print("parent");

		      for (String h : driver.getWindowHandles()) {
		          if (!h.equals(parent)) {
		              driver.switchTo().window(h);
		              break;
		          }
		      }


		WebElement reg=driver.findElement(By.xpath("//*[@id=\"post-5634\"]/div/div/section/div/div/div/div/div/table/tbody/tr[2]/td[3]/a[2]"));
		reg.click();

	}

}
