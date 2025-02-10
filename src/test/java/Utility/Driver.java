package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    public static synchronized WebDriver getDriver() {

        if (driver.get() == null) {
            String browserType = System.getProperty("browser");
            if (browserType == null) {
                browserType = ConfigReader.getProperty("browser");
            }

            switch (browserType.toLowerCase()) {
                case "chrome" -> driver.set(new ChromeDriver());
                case "firefox" -> driver.set(new FirefoxDriver());
                case "edge" -> driver.set(new EdgeDriver());

                default -> throw new IllegalArgumentException("Invalid driver");
            }
        }

        return driver.get();
    }

        public static synchronized void quitDriver(){
            if (driver.get() != null) {
                driver.get().quit();
                driver.remove();

            }

        }


    }
