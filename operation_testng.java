package calculatortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import calculator_main.operation;

public class operation_testng {
WebDriver w;
operation op;

   @Test
public void openbrowser()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ashwini\\Desktop\\selenium jar\\chromedriver.exe");//set system property for chrome driver
	WebDriver w = new ChromeDriver();//instantiate a ChromeDriver class
	w.get("https://www.calculator.net/"); //Launch website
	w.manage().window().maximize();
	op  = new operation(w);
	
	
	}
   @Test
   public void runmul()
   {
	   op.multiplication();
	   System.out.println("multiplication run");
   }
   
   }
  

