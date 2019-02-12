import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;

public class HolidayCheck {
    public static void main (String[]args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com/");

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"frm\"]/div[1]/div[1]/div[1]/div[1]")));
        driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys("Malediven,Malediven");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]")));
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[4]/td[5]")));
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[4]/td[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[3]/td[3]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"xp__guests__toggle\"]/span")));
        driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[1]/div/div[2]/button[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[2]/div/div[2]/button[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[3]/div/div[2]/button[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[4]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[4]/select")).sendKeys("5");
        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"hotellist_inner\"]/div[4]/div[2]/div[3]/div/div[3]/div/div/div/a/span")).click();
        driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#hp_hotel_name")));
        System.out.println(driver.findElement(By.cssSelector("#hp_hotel_name")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"group_recommendation\"]/table/tbody/tr/td[2]/table/tbody/tr[1]/td")).getText());

        driver.close();
    }
}

