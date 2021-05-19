package pl.coderslab.test1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.junit.*;

public class WypelnijformularzTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do formularza
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void testGoogleSearch() {
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.id("first-name"));
        // Wyczyść teskst zapisany w elemencie
        element.clear();

        // Wpisz informacje do wyszukania
        element.sendKeys("Karol");

        WebElement nazwisko = driver.findElement(By.id("last-name"));
        nazwisko.clear();
        nazwisko.sendKeys("Kowalski");

        WebElement gender = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[3]/div/div/label[1]/input"));
        gender.click();


        WebElement dob = driver.findElement(By.id("dob"));
        dob.clear();
        dob.sendKeys("05/22/2010");

        WebElement adress = driver.findElement(By.id("address"));
        adress.clear();
        adress.sendKeys("Prosta 51");

        WebElement email = driver.findElement(By.id("email"));
        email.clear();
        email.sendKeys("karol.kowalski@mailinator.com");

        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("Pass123");

        WebElement company = driver.findElement(By.xpath("//*[@id='company']"));
        company.clear();
        company.sendKeys("Coders Lab");


        WebElement comment = driver.findElement(By.id("comment"));
        comment.clear();
        comment.sendKeys("To jest mój pierwszy automat testowy");

        WebElement role = driver.findElement(By.xpath("//*[@id=\"role\"]/option[4]"));
        role.click();


        WebElement jobexp = driver.findElement(By.xpath("//*[@id=\"expectation\"]/option[1]"));
        jobexp.click();

        WebElement wod1 = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[1]/label/input"));
        wod1.click();

        WebElement wod2 = driver.findElement(By.xpath("//*[@id=\"infoForm\"]/div[11]/div/div[6]/label/input"));
        wod2.click();

        WebElement wod3 = driver.findElement(By.xpath(" //*[@id=\"infoForm\"]/div[11]/div/div[5]/label/input"));
        wod3.click();


        // Prześlij formularz
        element.submit();
    }

    @After
    public void tearDown() throws Exception {
        // Zamknij przeglądarkę
        // driver.quit();
    }
}

