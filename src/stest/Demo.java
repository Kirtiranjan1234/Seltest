package stest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
	ChromeOptions co=new ChromeOptions();
	co.setBrowserVersion("119");
	WebDriver driver=new ChromeDriver(co);
	driver.get("https://www.selenium.dev/downloads/");
	
	}

}
