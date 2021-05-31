package calculator_main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class operation {
	//423 * 525 = 222075
@FindBy(xpath="//span[@onclick=\"r(4)\"]")
private WebElement m1;

@FindBy(xpath="//span[@onclick=\"r(2)\"]")
private WebElement m2;

@FindBy(xpath="//span[@onclick=\"r(3)\"]")
private WebElement m3;

@FindBy(xpath="//span[@onclick=\"r('*')\"]")
private WebElement mul;

@FindBy(xpath="//span[@onclick=\"r(5)\"]")
private WebElement m4;

@FindBy(xpath="//span[@onclick=\"r(2)\"]")
private WebElement m5;

@FindBy(xpath="//span[@onclick=\"r(5)\"]")
private WebElement m6;

@FindBy(xpath="//span[@onclick=\"r('C')\"]")
private WebElement m7; 

//division 4000 /200 = 20

@FindBy(xpath="//span[@onclick=\"r(4)\"]")
private WebElement d1;

@FindBy(xpath="//span[@onclick=\"r(0)\"]")
private WebElement d2;

@FindBy(xpath="//span[@onclick=\"r(0)\"]")
private WebElement d3;

@FindBy(xpath="//span[@onclick=\"r(0)\"]")
private WebElement d4;

@FindBy(xpath="//span[@onclick=\"r('/')\"]")
private WebElement div;

@FindBy(xpath="//span[@onclick=\"r(2)\"]")
private WebElement d5;

@FindBy(xpath="//span[@onclick=\"r(0)\"]")
private WebElement d6;

@FindBy(xpath="//span[@onclick=\"r(0)\"]")
private WebElement d7;

@FindBy(xpath="//span[@onclick=\"r('C')\"]")
private WebElement d8;

//addition -234234 + 345345=111111

@FindBy(xpath="//span[@onclick=\"r('-')\"]")
private WebElement au;

@FindBy(xpath="//span[@onclick=\"r(2)\"]")
private WebElement a2;

@FindBy(xpath="//span[@onclick=\"r(3)\"]")
private WebElement a3;

@FindBy(xpath="//span[@onclick=\"r(4)\"]")
private WebElement a4;

@FindBy(xpath="//span[@onclick=\"r(2)\"]")
private WebElement a5;

@FindBy(xpath="//span[@onclick=\"r(3)\"]")
private WebElement a6;

@FindBy(xpath="//span[@onclick=\"r(4)\"]")
private WebElement a7;

@FindBy(xpath="//span[@onclick=\"r('+')\"]")
private WebElement add;

@FindBy(xpath="//span[@onclick=\"r(3)\"]")
private WebElement a8;

@FindBy(xpath="//span[@onclick=\"r(4)\"]")
private WebElement a9;

@FindBy(xpath="//span[@onclick=\"r(5)\"]")
private WebElement a10;

@FindBy(xpath="//span[@onclick=\"r(3)\"]")
private WebElement a11;

@FindBy(xpath="//span[@onclick=\"r(4)\"]")
private WebElement a12;

@FindBy(xpath="//span[@onclick=\"r(5)\"]")
private WebElement a13;

@FindBy(xpath="//span[@onclick=\"r('C')\"]")
private WebElement a14;

//substraction 234823
@FindBy(xpath="//span[@onclick=\"r(2)\"]")
private WebElement s1;

@FindBy(xpath="//span[@onclick=\"r(3)\"]")
private WebElement s2;

@FindBy(xpath="//span[@onclick=\"r(4)\"]")
private WebElement s3;

@FindBy(xpath="//span[@onclick=\"r(8)\"]")
private WebElement s4;

@FindBy(xpath="//span[@onclick=\"r(2)\"]")
private WebElement s5;

@FindBy(xpath="//span[@onclick=\"r(3)\"]")
private WebElement s6;

@FindBy(xpath="//span[@onclick=\"r('-')\"]")
private WebElement s7;

@FindBy(xpath="//span[@onclick=\"r('-')\"]")
private WebElement s8;

@FindBy(xpath="//span[@onclick=\"r(2)\"]")
private WebElement s9;

@FindBy(xpath="//span[@onclick=\"r(3)\"]")
private WebElement s10;

@FindBy(xpath="//span[@onclick=\"r(0)\"]")
private WebElement s11;

@FindBy(xpath="//span[@onclick=\"r(9)\"]")
private WebElement s12;

@FindBy(xpath="//span[@onclick=\"r(4)\"]")
private WebElement s13;

@FindBy(xpath="//span[@onclick=\"r(8)\"]")
private WebElement s14;

@FindBy(xpath="//span[@onclick=\"r(2)\"]")
private WebElement s15;

@FindBy(xpath="//span[@onclick=\"r(3)\"]")
private WebElement s16;
public operation(WebDriver w) {
	PageFactory.initElements(w, this);
}

public void multiplication() {
	m1.click();
	m2.click();
	m3.click();
	mul.click();
	m4.click();
	m5.click();
	m6.click();
	m7.click();
	
	d1.click();
	d2.click();
	d3.click();
	d4.click();
	div.click();
	d5.click();
	d6.click();
	d7.click();
	d8.click();
	
	
	au.click();
	a2.click();
	a3.click();
	a4.click();
	a5.click();
	a6.click();
	a7.click();
	add.click();
	a8.click();
	a9.click();
	a10.click();
     a11.click();
     a12.click();
     a13.click();
     a14.click();
     
     s1.click();
     s2.click();
     s3.click();
     s4.click();
     s5.click();
     s6.click();
     s7.click();
     s8.click();
	 s9.click();
	 s10.click();
	 s11.click();
	 s12.click();
	 s13.click();
	 s14.click();
	 s15.click();
	 s16.click();
}
}
