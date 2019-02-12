import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameTest2 {
    public static void main(String[]args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://en2.nametests.com/test/what-are-your-traits-for-2019/37740/?ab=eyJxdWl6X3RpdGxlIjoxMDkyMzZ9");

        WebElement whatTraits = driver.findElement(By.xpath("//*[@id='quiz_title']"));
        whatTraits.click();

        WebElement element = driver.findElement(By.xpath("//*[@id=`login_first']/span[1]"));
        element.click();

        WebElement login = driver.findElement(By.xpath("//*[@id='email']"));
        login.click();
        login.sendKeys("zuush89@gmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@id=`pass`]"));
        password.click();
        password.sendKeys("196308");

        WebElement submit = driver.findElement(By.xpath("//*[@id=`loginbutton`]"));
        submit.click();

        WebElement securityCheck = driver.findElement(By.xpath("//*[@id=`captcha´]/h3"));
        securityCheck.click();

        WebElement roboter = driver.findElement(By.xpath("//*[@id=`recaptcha-anchor`]/div[5]"));
        roboter.click();

        WebElement next = driver.findElement(By.xpath("//*[@id=`checkpointSubmitButton`]"));
        next.click();



    }
}
