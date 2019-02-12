import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class berechnung {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ruv.de/home/");

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gsContainerDiv\"]/div/div[2]/div/div[1]/div/ul/li[8]/a")));
        driver.findElement(By.xpath("//*[@id=\"gsContainerDiv\"]/div/div[2]/div/div[1]/div/ul/li[8]/a")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ruvBodyEle\"]/div[4]/div/div[1]/div/a")));
        driver.findElement(By.xpath("//*[@id=\"ruvBodyEle\"]/div[4]/div/div[1]/div/a")).click();

        driver.findElement(By.xpath("//*[@id=\"ruvBodyEle\"]/div[1]/div/a")).click();

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"ruvIframe_inner\"]")));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"versicherungsbeginn\"]/p-calendar/span/input")));
        driver.findElement(By.xpath("//*[@id=\"versicherungsbeginn\"]/p-calendar/span/input")).sendKeys("01.03.2019");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#fahrzeugsucheAuswahl > div > div:nth-child(1)")));
        driver.findElement(By.cssSelector("#fahrzeugsucheAuswahl > div > div:nth-child(1)")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"hsn\"]")));
        driver.findElement(By.xpath("//*[@id=\"hsn\"]")).sendKeys("0588");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tsn\"]")));
        driver.findElement(By.xpath("//*[@id=\"tsn\"]")).sendKeys("ACI");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fahrzeugszulassungAuswahl\"]/div/div[1]")));
        driver.findElement(By.xpath("//*[@id=\"fahrzeugszulassungAuswahl\"]/div/div[1]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"halterPlz\"]")));
        driver.findElement(By.xpath("//*[@id=\"halterPlz\"]")).sendKeys("65185");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"erstzulassung\"]/p-calendar/span/input")));
        driver.findElement(By.xpath("//*[@id=\"erstzulassung\"]/p-calendar/span/input")).sendKeys("01.01.2015");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"halterzulassungCb\"]/div/div[2]")));
        driver.findElement(By.xpath("//*[@id=\"halterzulassungCb\"]/div/div[2]")).click();
        if (!driver.findElement(By.xpath("//*[@id=\"halterzulassungCb\"]/div/div[2]")).isSelected()) {
            driver.findElement(By.xpath("//*[@id=\"halterzulassungCb\"]/div/div[2]")).click();
        }

        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//*[@id=\"halterzulassung\"]/p-calendar/span/input")), "value", "01.03.2019"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"beruf\"]/div/p-dropdown/div")));
        driver.findElement(By.xpath("//*[@id=\"beruf\"]/div/p-dropdown/div")).click();
        driver.findElement(By.xpath("//*[@id=\"beruf\"]/div/p-dropdown/div/div[4]/div/ul/li[2]/span")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"button-weiter-allgemeine-angaben\"]")));
        driver.findElement(By.xpath("//*[@id=\"button-weiter-allgemeine-angaben\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"jungsterNutzerGeburtstag\"]/p-calendar/span/input")));
        driver.findElement(By.xpath("//*[@id=\"jungsterNutzerGeburtstag\"]/p-calendar/span/input")).sendKeys("11.11.1989");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"aeltesterNutzerGeburtstag\"]/p-calendar/span/input")));
        driver.findElement(By.xpath("//*[@id=\"aeltesterNutzerGeburtstag\"]/p-calendar/span/input")).sendKeys("11.11.1963");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fahrleistung\"]")));
        driver.findElement(By.xpath("//*[@id=\"fahrleistung\"]")).sendKeys("15.000");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fahrzeugNutzungArt\"]/div/p-dropdown/div")));
        driver.findElement(By.xpath("//*[@id=\"fahrzeugNutzungArt\"]/div/p-dropdown/div")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fahrzeugNutzungArt\"]/div/p-dropdown/div/div[4]/div/ul/li[1]")));
        driver.findElement(By.xpath("//*[@id=\"fahrzeugNutzungArt\"]/div/p-dropdown/div/div[4]/div/ul/li[1]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"button-weiter-fahrzeugnutzung\"]")));
        driver.findElement(By.xpath("//*[@id=\"button-weiter-fahrzeugnutzung\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"situationsklaerungSfk\"]/div/div[2]")));
        driver.findElement(By.xpath("//*[@id=\"situationsklaerungSfk\"]/div/div[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"referenzvertrag\"]/div/p-dropdown/div/label")));
        driver.findElement(By.xpath("//*[@id=\"referenzvertrag\"]/div/p-dropdown/div/label")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"referenzvertrag\"]/div/p-dropdown/div/div[4]/div/ul/li[4]/span")));
        driver.findElement(By.xpath("//*[@id=\"referenzvertrag\"]/div/p-dropdown/div/div[4]/div/ul/li[4]/span")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fuehrerscheinerwerbsdatum\"]/p-calendar/span/input")));
        driver.findElement(By.xpath("//*[@id=\"fuehrerscheinerwerbsdatum\"]/p-calendar/span/input")).sendKeys("01.02.2019");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"button-weiter-schadenfreiheitsklasse\"]")));
        driver.findElement(By.xpath("//*[@id=\"button-weiter-schadenfreiheitsklasse\"]")).click();
        if (!driver.findElement(By.xpath("//*[@id=\"button-weiter-schadenfreiheitsklasse\"]")).isSelected()) {
            driver.findElement(By.xpath("//*[@id=\"button-weiter-schadenfreiheitsklasse\"]")).click();
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"button-weiter-zusammenfassung\"]")));
        driver.findElement(By.xpath("//*[@id=\"button-weiter-zusammenfassung\"]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"versicherungsschutz\"]/div/div[1]/div[3]/div[1]")));
        driver.findElement(By.xpath("//*[@id=\"versicherungsschutz\"]/div/div[1]/div[3]/div[1]")).click();


        System.out.println(driver.findElement(By.xpath("//*[@id=\"kfz_preis_anzeige\"]")).getText());

        while (driver.findElement(By.xpath("//tr/th[2]/span[@class = 'preis']")).getText().equals("")) {
            Thread.sleep(250);
            System.out.println("wait a bit");
        }

        WebElement elem = driver.findElement(By.xpath("//tr/th[2]/span[@class = 'preis']"));
        System.out.println(elem.getText());
    }
}
