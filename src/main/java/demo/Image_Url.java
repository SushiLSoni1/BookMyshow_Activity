package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image_Url {
    
        ChromeDriver driver;

         public Image_Url(){

        System.out.println("Constructor: Image_Url");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void endTest()
{
    System.out.println("End Test: Image_Url");
    driver.close();
    driver.quit();
}


    public void Image_Url() throws InterruptedException {

        System.out.println("Start Test case: Image_Url");
       //Navigate to url "https://in.bookmyshow.com/explore/home/chennai"
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        //Get the image url using locator xpath "//div[@class='style__RelativeContainer-sc-lnhrs7-0 jhuTSq']//img"
        List<WebElement> Image_url = driver.findElements(By.xpath("//div[@class='style__RelativeContainer-sc-lnhrs7-0 jhuTSq']//img"));
        //Print the image url on console using getAttribute("src")
               for (int i = 0; i < Image_url.size(); i++) {
            System.out.println("Image URLs for Recommended Movies : " + Image_url.get(i).getAttribute("src"));

        }
        //Get the name using xpath "//div[@class='style__RelativeContainer-sc-lnhrs7-0 jhuTSq']//div[text()='Blue Star']"
       WebElement Name = driver.findElement(By.xpath("//div[@class='style__RelativeContainer-sc-lnhrs7-0 jhuTSq']//div[text()='Blue Star']"));
       //Print the name on console
       System.out.println("Name of the Movie : " + Name.getText());
       //Get the genre using xpath "//div[@class='style__RelativeContainer-sc-lnhrs7-0 jhuTSq']//div[text()='Drama/Sports']"
       WebElement Genre = driver.findElement(By.xpath("//div[@class='style__RelativeContainer-sc-lnhrs7-0 jhuTSq']//div[text()='Drama/Sports']"));
       System.out.println("Genre of the Movie : "  + Genre.getText());
    
}
}