public class HomeWork {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        WebElement loginPageLink = driver.findElement(By.linkText("Login Page") );
        loginPageLink.click();

        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("password")).click();

        List<WebElement> buttons = driver.findElements(By.cssSelector(".button"));
        for (WebElement b : buttons) {
            b.click();
        }
        String sText = driver.findElement(By.cssSelector("fa fa-2x fa-sign-in")).getText();
        System.out.println(sText);


        driver.quit();
    }
}
