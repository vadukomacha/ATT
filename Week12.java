package att;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Week12 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://smallpdf.com/word-to-pdf");
	        WebElement chooseFile = driver.findElement(By.xpath("//span[normalize-space()='Choose Files']"));
	        chooseFile.click();
	        Thread.sleep(2000);
	        StringSelection str = new StringSelection("C:\\Users\\student\\Downloads\\sample-docx-files-sample3.docx");
	        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	        clipboard.setContents(str, null);
            Thread.sleep(1000);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        Thread.sleep(1000);
	        robot.keyPress(KeyEvent.VK_ENTER);
	        Thread.sleep(1000);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        WebElement download = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Download']")));
	        download.click();
	        Thread.sleep(1000);

	}

}
