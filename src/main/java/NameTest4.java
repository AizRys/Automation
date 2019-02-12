import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameTest4 {
    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://en2.nametests.com/test/what-are-your-6-best-qualities/37730/?ab=eyJxdWl6X3RpdGxlIjp7fX0");

        //*[@id="quiz_title"]
        WebElement sixQaulities = driver.findElement(By.xpath("//*[@id='quiz_title']"));
        sixQaulities.click();
        ////*[@id="login_first"]
        WebElement exit = driver.findElement(By.xpath("//*[@id='login_first']"));
        exit.click();
        //*[@id="email"]
        WebElement login = driver.findElement(By.xpath("//*[@id='email']"));
        login.click();
        login.sendKeys("zuush89@gmail.com");


        //*[@id=\"pass\"]"
        WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));
        password.click();
        password.sendKeys("196308");

        //*[@id="loginbutton"]
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"loginbutton\"]"));
        submit.click();


        //*[@id=\"photoselect-holder\"]/div[2]/div/div[2]/a/img"
        WebElement select = driver.findElement(By.xpath("//div [@class='overview']//img"));
        select.click();



    }
}
