import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;

public class Verti {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.verti.de/lp/autoversicherung/a.jsp?partnerid=dl18&gclid=Cj0KCQiAtP_iBRDGARIsAEWJA8j02R_gCldljHbK4rzo1mfd7XTPunuNexOmc1zvimI6rmvEcEpBgg0aArs9EALw_wcB&gclsrc=aw.ds");

        WebDriverWait wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"content\"]/div[1]/header/div[2]/div[2]/div/a")));
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/header/div[2]/div[2]/div/a")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form:next_Button']")));
        driver.findElement(By.xpath("//*[@id=\"form:next_Button\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form:manufYear_label\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:manufYear_label\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:manufYear_3\"]")));
        driver.findElement(By.xpath("//*[@id='form:manufYear_3']")).click();

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//*[@id='form:manufYear_items']"))));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:purchaseYear_label\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:purchaseYear_label\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:purchaseYear_2\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:purchaseYear_2\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:j_idt166\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:j_idt166\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:j_idt179\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:j_idt179\"]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form:hsn\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:hsn\"]")).sendKeys("0039");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form:tsn\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:tsn\"]")).sendKeys("176");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:next_Button\"]/span")));
        driver.findElement(By.xpath("//*[@id=\"form:next_Button\"]/span")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='form:j_idt117']")));
        driver.findElement(By.xpath("//*[@id=\"form:j_idt117\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:annualDistance\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:annualDistance\"]")).sendKeys("15.000");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:houseOwner_label\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:houseOwner_label\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:houseOwner_3\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:houseOwner_3\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:parkingType_label\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:parkingType_label\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:parkingType_2\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:parkingType_2\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:next_Button\"]/span")));
        driver.findElement(By.xpath("//*[@id=\"form:next_Button\"]/span")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:policyHolderCheckbox\"]/div[1]/div[1]/div/label")));
        driver.findElement(By.xpath("//*[@id=\"form:policyHolderCheckbox\"]/div[1]/div[1]/div/label")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:j_idt163\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:j_idt163\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:birthday_input\"]")));

        ((JavascriptExecutor) driver).executeScript("document.getElementById('form:birthday_input').setAttribute('value', '08.07.1989')");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:license\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:license\"]")).sendKeys("2012");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:job_label\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:job_label\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:job_1\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:job_1\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:family_label\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:family_label\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:family_1\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:family_1\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:j_idt308\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:j_idt308\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:numberOfCarsInHH_label\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:numberOfCarsInHH_label\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:numberOfCarsInHH_1\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:numberOfCarsInHH_1\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:lastIncidents_label\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:lastIncidents_label\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:lastIncidents_1\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:lastIncidents_1\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:j_idt411\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:j_idt411\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:next_Button\"]/span")));
        driver.findElement(By.xpath("//*[@id=\"form:next_Button\"]/span")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:vehicleOwner_label\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:vehicleOwner_label\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:vehicleOwner_0\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:vehicleOwner_0\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:vehicleOwnerPostcode\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:vehicleOwnerPostcode\"]")).sendKeys("12055");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:driverRegistration_label\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:driverRegistration_label\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:driverRegistration_0\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:driverRegistration_0\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:next_Button\"]/span")));
        driver.findElement(By.xpath("//*[@id=\"form:next_Button\"]/span")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:comprehensive2_label\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:comprehensive2_label\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:j_idt330\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:j_idt330\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:j_idt440\"]")));
        driver.findElement(By.xpath("//*[@id=\"form:j_idt440\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form:next_Button\"]/span")));
        driver.findElement(By.xpath("//*[@id=\"form:next_Button\"]/span")).click();

        System.out.println(driver.findElement(By.xpath("//*[@id=\"form:j_idt100\"]/div[2]/h1")).getText());
        }
    }


