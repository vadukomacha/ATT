package att;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
public class Week10 {

public static void main(String[] args) throws InterruptedException {


WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();

driver.get("http://gmail.com/");

Thread.sleep(2000);

WebElement createAccount=driver.findElement(By.xpath("(//span[normalize-space()='Create account'])"));

createAccount.click();

Thread.sleep(2000);

WebElement mySelf=driver.findElement(By.xpath("(//span[normalize-space()='For my personal use'])"));

mySelf.click();

Thread.sleep(2000);

WebElement firstName = driver.findElement(By.name("firstName"));

firstName.sendKeys("Swathi");

Thread.sleep(2000);

WebElement lastName = driver.findElement(By.name("lastName"));

lastName.sendKeys("preti");

Thread.sleep(2000);

WebElement bn1 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));

bn1.click();

Thread.sleep(2000);

WebElement month=driver.findElement(By.xpath("//div[normalize-space()='Month']"));

month.click();

Thread.sleep(2000);

WebElement month1=driver.findElement(By.xpath("//li[normalize-space()='July']"));

month1.click();

Thread.sleep(2000);

WebElement day = driver.findElement(By.id("day"));

day.sendKeys("10");

Thread.sleep(2000);

WebElement year = driver.findElement(By.id("year"));

year.sendKeys("2005");

WebElement gender=driver.findElement(By.xpath("//div[normalize-space()='Gender']"));

gender.click();

Thread.sleep(2000);

WebElement gender1=driver.findElement(By.xpath("//li[normalize-space()='Female']"));

gender1.click();

Thread.sleep(2000);

WebElement bn2 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));

bn2.click();

Thread.sleep(2000);

WebElement uid = driver.findElement(By.name("usernameRadio"));

uid.click();//sendKeys("swathipreethi202013");

WebElement bn3 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));

bn3.click();

Thread.sleep(2000);

WebElement pswd = driver.findElement(By.name("Passwd"));

pswd.sendKeys("Jyo1234567#");

Thread.sleep(2000);

WebElement cpswd = driver.findElement(By.name("PasswdAgain"));

cpswd.sendKeys("Jyo1234567#");

Thread.sleep(2000);

WebElement bn4 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])"));

bn4.click();

}

}
