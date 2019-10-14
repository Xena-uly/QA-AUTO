import java.util.concurrent.TimeUnit;

public class BaseTaste {

    WebDriver driver;

    private static final String BASE_URL = "http://automationpractice.com/index.php";
    //private static final String PATH_TO_DRIVER = "src\\main\\resources\\Driwers\\chromedriver.exe";


    @BeforeMethod
    public void setUp()  {

        //   System.setProperty("webdriver.chrome.driver",PATH_TO_DRIVER);
        WebDriverManager.chromedriver().version("77.0").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to(BASE_URL);
        //WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
    }
