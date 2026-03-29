package att;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week6 {
	public static void main(String[] args) throws InterruptedException  {
	    WebDriver driver = new ChromeDriver();
	   
	    driver.manage().window().maximize();
	driver.get("https://in.search.yahoo.com/?fr2=inr");
	WebElement searchBar=driver.findElement(By.name("p"));
	searchBar.sendKeys("Ajio");
	Thread.sleep(1000);
	searchBar.sendKeys(Keys.ENTER);
	Thread.sleep(1000);

	WebElement link=driver.findElement(By.xpath("//*[@id=\"web\"]/ol/li[5]/div/div[1]/h3/a"));
	   Thread.sleep(2000);
	   link.click();
	   
	   String parent = driver.getWindowHandle();
//	       System.out.println("parent");

	      for (String h : driver.getWindowHandles()) {
	          if (!h.equals(parent)) {
	              driver.switchTo().window(h);
//	               System.out.println("child");
	              break;
	          }
	      }

	driver.findElement(By.xpath("//*[@id=\"loginAjio\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"mobileNumber\"]")).sendKeys("9949781361");
	driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[3]/div/form/div/div[2]/input")).click();

}
}
