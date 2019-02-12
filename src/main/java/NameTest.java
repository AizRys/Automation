import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NameTest {
    public static void main (String[]args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://en2.nametests.com/test/which-song-suits-your-life/36373/?ab=eyJxdWl6X3RpdGxlIjoxMDM3Njd9");

        WebElement whichSong = driver.findElement(By.xpath("//*[@id=`quiz_title`]"));
        whichSong.click();

        WebElement element = driver.findElement(By.xpath("//*[@id=`login_first`]"));
        element.click();

        WebElement login = driver.findElement(By.xpath("//*[@id=`email`]"));
        login.click();
        login.sendKeys("zuush89@gmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@id=`pass`]"));
        password.click();
        password.sendKeys("196308");

        WebElement submit = driver.findElement(By.xpath("//*[`@id=loginbutton`]"));
        submit.click();


        WebElement select = driver.findElement(By.xpath("//*[div [@class='overview']//img"));
        select.click();
    }
}

