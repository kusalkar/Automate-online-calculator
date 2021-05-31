package calculatortest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import calculator_main.operation;

public class operation_test {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ashwini\\Desktop\\selenium jar\\chromedriver.exe");//set system property for chrome driver
	WebDriver w = new ChromeDriver();//instantiate a ChromeDriver class
	w.get("https://www.calculator.net/"); //Launch website
	w.manage().window().maximize();
	
	
	operation obj = new operation(w);
	obj.multiplication();
	Thread.sleep(4000);
}
}
