package BancoInter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Autbancointer {
	WebDriver driver;
	

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./Driver.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://inter.co/");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}


	@Test
	void test() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("d-block d-md-inline d-lg-block")).click();
		Thread.sleep(1000);
		String texto = driver.findElement(By.xpath("sc-AbpxN dKKQXp")).getText();
		assertEquals("Abra agora sua Conta Digital", texto);
		System.out.println("valor da variavel texto;" + texto);
		driver.findElement(By.id("name")).sendKeys("Auzirene Angelica");
		driver.findElement(By.id("phone")).sendKeys("61982769687");
		driver.findElement(By.id("email")).sendKeys("auzireneangelicat@hotmail.com");
		driver.findElement(By.id("socialId")).sendKeys("71992517002");
		driver.findElement(By.id("dateOfBirth")).sendKeys("01091982");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("conta-digital-pf")).click();
		Thread.sleep(3000);
	driver.findElement(By.cssSelector("submit")).click();
		

	}
	
	}


