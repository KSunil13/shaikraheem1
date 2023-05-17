package Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterClass;

public class Secondtest {
    WebDriver driver;
	@Test
	public void baby() throws Exception {
		Thread.sleep(2000);
		//add patient
		driver.findElement(By.xpath("/html/body/header/nav/ul/span[1]/li[1]/div/a/img")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"search_bar_panel\"]/span[1]/li[1]/div/a")).click();
		driver.findElement(By.xpath("/html/body/main/div/form/div[2]/div/ul/li/div/div[3]/div[2]/span/span[1]/span")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/main/div/form/div[2]/div/ul/li/div/div[3]/div[2]/span/span[1]/span")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("/html/body/main/div/form/div[2]/div/ul/li/div/div[3]/div[2]/span/span[1]/span")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("/html/body/main/div/form/div[2]/div/ul/li/div/div[3]/div[2]/span/span[1]/span")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/main/div/form/div[2]/div/ul/li/div/div[3]/div[2]/span/span[1]/span")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.id("first_name")).sendKeys("Demoo");
		driver.findElement(By.id("lst_name")).sendKeys("Babeie");
		Thread.sleep(1000);
		WebElement m = driver.findElement(By.xpath("//label[text()='F']"));
		m.click();
		//driver.findElement(By.id("patient_master_dob")).click();
		Thread.sleep(1000);
		//entering the age 
		driver.findElement(By.id("age")).sendKeys("3");
		Thread.sleep(1000);
		//country code
		driver.findElement(By.xpath("/html/body/main/div/form/div[2]/div/ul/li/div/div[5]/div[2]/span/span[1]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='+91']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("nmbr")).sendKeys("838546684");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("demobabey123456@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("address-line1")).sendKeys("Hyderabad");
		driver.findElement(By.name("adrs_line2")).sendKeys("Hyderabad");
		driver.findElement(By.id("landmark")).sendKeys("Ameerpet");
		Thread.sleep(3000);
		//profession
		//driver.findElement(By.name("patient_master[profession]")).sendKeys("Student");
		//Referred by - web
		driver.findElement(By.xpath("/html/body/main/div/form/div[2]/div/ul/li/div/div[10]/div[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/main/div/form/div[3]/div/div[2]/div/div[1]/div/div[2]/div/div")).click(); //web
		Thread.sleep(1000);
		//selecting facebook from web
		driver.findElement(By.xpath("/html/body/main/div/form/div[3]/div/div[2]/div/div[6]/div/div[1]/i")).click(); //facebook
		//clicking on the submit 
		driver.findElement(By.xpath("/html/body/main/div/form/div[3]/div/div[2]/div/div[7]/span")).click();
		//Insurance
		driver.findElement(By.xpath("/html/body/main/div/form/div[2]/div/ul/li/div/div[11]/div[2]/a")).click();
		driver.findElement(By.id("policy_no")).sendKeys("12345");
		driver.findElement(By.name("id_card")).sendKeys("13");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/main/div/form/div[4]/div/div[2]/div[4]/span")).click();
		Thread.sleep(1000);
		//submit
		//driver.findElement(By.id("update_submit")).click();
		Thread.sleep(2000);

	}
	@BeforeClass
	public void login() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/workspace/Automationtestjob/driver/chromedriver");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		HtmlUnitDriver driver = new HtmlUnitDriver();
		//WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://3.110.104.233:3002/users/sign_in");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys("sunilcm@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("Demo@1234");
		//driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div[2]/form/div[2]/i[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(1000);
		//selecting Role clicking on Clinic manager Role
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[2]/a[1]/div/div/div/div[2]")).click();
		Thread.sleep(2000);
	}

	@AfterClass
	public void close() {
	}

}
