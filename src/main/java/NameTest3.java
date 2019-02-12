import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class NameTest3 {
    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://en2.nametests.com/test/who-do-you-need-in-your-life/37762/?ab=eyJxdWl6X3RpdGxlIjoxMDkzMDN9");

        WebElement whatNeed = driver.findElement(By.xpath("//*[@id='quiz_title']"));
        whatNeed.click();

        WebElement exit = driver.findElement(By.xpath("//*[@id='login_first']"));
        exit.click();


        WebElement login = driver.findElement(By.xpath("//*[@id='email']"));
        login.click();
        login.sendKeys("zuush89@gmail.com");

        WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));
        password.click();
        password.sendKeys("196308");

        WebElement submit = driver.findElement(By.xpath("//*[@id='loginbutton']"));
        submit.click();

        WebElement select = driver.findElement(By.xpath("//div [@class='overview']//img"));
        select.click();


    }
}
