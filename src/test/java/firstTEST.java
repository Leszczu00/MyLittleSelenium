import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTEST {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String actualTitle = "";

        driver.get("http://www.pracuj.pl");

        actualTitle = driver.getTitle();
        System.out.println("NIZEJ BEDZIE TYTUL");
        System.out.println("TUTAJ TYTUL STRONY: " + actualTitle);

        if (actualTitle.contentEquals("Oferty pracy - Pracuj.pl")) {
            System.out.println("Test Passed!");
            }else {
            System.out.println("Test Failed!");
            }

        driver.getTitle();



        driver.quit();
    }
}
