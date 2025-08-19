package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumMCPTest {

    static WebDriver driver;

    @BeforeAll
    static void setup() {
        // WebDriverManager descarcă și configurează automat ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void openGoogle() {
        driver.get("https://google.com");
        Assertions.assertEquals("Google", driver.getTitle());
    }

    @AfterAll
    static void teardown() {
        if (driver != null) driver.quit();
    }
}
