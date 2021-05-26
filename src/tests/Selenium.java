package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\merim\\OneDrive\\Documents\\seleniumDependencies\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://cybertek-bnb.herokuapp.com");
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("Title: "+ title);
		System.out.println("Url: "+ url) ;
		if(title.equals("cybertek-bnb")) {
			System.out.println("Title verification passed");
		}else{
			System.out.println("Title verification failed");
}
		driver.findElement(By.linkText("sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("first-name")).sendKeys("James");
		driver.findElement(By.name("last-name")).sendKeys("Bond");
		driver.findElement(By.name("email")).sendKeys("bond@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Merim123");
		Thread.sleep(2000);
		driver.findElement(By.className("button is-dark")).click();
		driver.findElement(By.xpath("//button[.='sign up")).click();
		
		
		
		
		
		

	}

}
