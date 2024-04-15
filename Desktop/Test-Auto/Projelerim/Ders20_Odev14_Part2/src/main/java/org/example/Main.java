package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20); // Bekleme süresi 20 saniye olarak artırıldı

        try {
            driver.get("https://demoqa.com/webtables");

            // Sayfanın tamamen yüklenmesini bekleyin
            new WebDriverWait(driver, 30).until(
                    webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

            driver.findElement(By.cssSelector("#addNewRecordButton")).click(); // "Add" düğmesine tıklama

            // Yeni kayıt formunu doldurun
            driver.findElement(By.cssSelector("#firstName")).sendKeys("Kadriye");
            driver.findElement(By.cssSelector("#lastName")).sendKeys("Yener");
            driver.findElement(By.cssSelector("#userEmail")).sendKeys("kadriye@deneme.com");
            driver.findElement(By.cssSelector("#age")).sendKeys("35");
            driver.findElement(By.cssSelector("#salary")).sendKeys("100000");
            driver.findElement(By.cssSelector("#department")).sendKeys("TestAutomation");
            driver.findElement(By.cssSelector("#submit")).click(); // Formu gönder

            // Formun başarılı bir şekilde gönderildiğini doğrulayın
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Kadriye')]")));

            // Düzenleme butonunu bul
            WebElement editButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id^='edit-record']")));
            editButton.click(); // İlk düzenleme butonuna tıkla

            // Düzenleme formunun açılmasını bekle
            WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='lastName']")));
            lastNameField.clear();
            lastNameField.sendKeys("Updated Sir");
            driver.findElement(By.cssSelector("#submit")).click(); // Değişiklikleri kaydet

        } finally {
            driver.quit(); // Tarayıcıyı kapat
        }
    }
}
