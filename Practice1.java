public class WdExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement forgotPassLink = driver.findElement(By.linkText("Forgot Password") );
        forgotPassLink.click();

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.clear();
        emailInput.sendKeys("success@mail.com");

        driver.findElement(By.id("form_submit")).click();





        driver.quit();
    }
