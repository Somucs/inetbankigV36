package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
/*ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL(); //"http://demo.guru99.com/v4/index.php";
	public String baseURL="http://demo.guru99.com/v4/index.php";
	public String username=readconfig.getUserName(); //"mngr297641";
	public String password=readconfig.getPassword(); //"utaqUpY";
	*/
	public String baseURL="http://demo.guru99.com/v4/index.php";
	public String username="mngr475239";
	public String password="atUdusA";
	
	
	public static WebDriver driver;
	
	public Logger logger;
	
	//@Parameters("browser")
	
	@BeforeClass
	public void setup()
	//public void setup(String br)
	{	
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		/*if(br.equals("firefox")) //
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxpath());
			driver = new FirefoxDriver();
		}
		else if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
			driver=new ChromeDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIepath());
			driver = new InternetExplorerDriver();
		}
		
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		driver = new FirefoxDriver(); */
		
		WebDriverManager.chromedriver().setup();	
		driver=new ChromeDriver();
		driver.get(baseURL);
		
		
		logger.info("URL is openned");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	/*public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);*/
    }
	


