package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPagePO {

    //Element locator - sage1
    @FindBy(id = "email")
    public static WebElement EmailAddressField;

    @FindBy(id = "pass")
    public static WebElement PasswordField;

    @FindBy(css = "#send2 > span")
    public static WebElement SignInButton;


    // Initialise WebElement Using Selenium WebDriver - stage2
    public SignInPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    // write method to describe web Element Action - stage3

    public void enterEmailAddress(String Email) {
        EmailAddressField.sendKeys(Email);
    }

    public void enterPassword(String Password) {
        PasswordField.sendKeys(Password);
    }

    public void clickSignInButton(){
        SignInButton.click();
    }


















}
