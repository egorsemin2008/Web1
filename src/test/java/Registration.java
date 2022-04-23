import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Registration extends Data {

    private By btnSingUp = By.className("personal-info");
    private By btnregistr = By.xpath("/html/body/div[3]/div[2]/div/div/div/noindex[2]/div/a");
    private By firstname = By.xpath("/html/body/div[3]/div[2]/div/div/div/noindex/form/div[1]/div[2]/input");
    private By lastName = By.xpath("/html/body/div[3]/div[2]/div/div/div/noindex/form/div[2]/div[2]/input");
    private By login = By.xpath("/html/body/div[3]/div[2]/div/div/div/noindex/form/div[3]/div[2]/input");
    private By password = By.xpath("/html/body/div[3]/div[2]/div/div/div/noindex/form/div[4]/div[2]/input");
    private By passwordadd = By.xpath("/html/body/div[3]/div[2]/div/div/div/noindex/form/div[5]/div[2]/input");
    private By email = By.xpath("/html/body/div[3]/div[2]/div/div/div/noindex/form/div[6]/div[2]/input");
    private By btnentrance = By.xpath("/html/body/div[3]/div[2]/div/div/div/noindex/form/div[9]/input");

    @Test
    public void registration() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();

        driver.manage().window().maximize();
        driver.get(getDate.getUrl);
        driver.findElement(btnSingUp).click();
        driver.findElement(btnregistr).click();
        driver.findElement(firstname).sendKeys(getDate.firstname);
        driver.findElement(lastName).sendKeys(getDate.lastName);
        driver.findElement(login).sendKeys(getDate.login);
        driver.findElement(password).sendKeys(getDate.password);
        driver.findElement(email).sendKeys(getDate.email);
        driver.findElement(btnentrance).click();

        sleep(5000);
        driver.quit();



    }


}




