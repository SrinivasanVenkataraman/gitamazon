package amazontest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPageTest {
	
@Test
	public void testGoogle() throws IOException {
			WebDriverManager.chromedriver().setup();
			WebDriver wd=new ChromeDriver();
			wd.get("https://www.amazon.in/");	
			File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("screenshot/amazon.png"));
		
	}
	

}
