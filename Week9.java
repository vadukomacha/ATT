package att;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Week9 {

public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.justdial.com/Hyderabad/Bakeries/nct-10033880?trkid=11687-hyderabad-fcat-catne&term=backery&cbflg=");
List<WebElement> m = driver.findElements(By.xpath("//h2[contains(@class,'resultbox_title')]"));
for(int i = 0; i< m.size(); i++) {
String s = m.get(i).getText();
System.out.println("Text is: " + s);
}

}

}
