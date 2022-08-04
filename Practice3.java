public class ChallengeDomexample {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        driver.findElement(By.linkText("Challenging DOM")).click();

        List<WebElement> buttons = driver.findElements(By.cssSelector(".button"));
        for (WebElement b : buttons) {
            b.click();
        }
    String sText = driver.findElement(By.cssSelector("table tbody tr:nth-of-type(4) td:nth-of-type(4)")).getText();
    System.out.println(sText);
    }

}
