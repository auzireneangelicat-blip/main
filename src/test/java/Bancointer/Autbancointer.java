package Bancointer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autbancointer {

    private WebDriver driver;

    @BeforeEach
    void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get("https://inter.co/");
    }

    @AfterEach
    void tearDown() throws Exception {
       driver.quit();
        }
   

    @Disabled
	@Test
    void test() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#gatsby-focus-wrapper > header > div > nav > div.sc-brKBMN.hSNTxE > button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("Auzirene Angelica");
        driver.findElement(By.id("phone")).sendKeys("61982769687");
        driver.findElement(By.id("email")).sendKeys("auzireneangelicat@hotmail.com");
        driver.findElement(By.id("socialId")).sendKeys("373.607.050-02");
        driver.findElement(By.id("dateOfBirth")).sendKeys("01091983");
        driver.findElement(By.cssSelector("body > div.sc-dILkzW.jmczzn > div.sc-hUheUT.eReyjh > div > form > div.sc-jNDflC.RXypR > label")).click();
        String texto = new driver.findElement(By.cssSelector("body > div.sc-dILkzW.jmczzn > div.sc-hUheUT.eReyjh > div > p")).getText();
    assert.assertEquals("Prontinho! Recebemos os seus dados.", texto);
     System.out.println("valor da variavel texto:"+ texto);
     
    }


	}

