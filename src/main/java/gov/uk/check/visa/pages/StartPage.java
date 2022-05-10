package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {

    public StartPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement cookies;

    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startButton;

    public void clickStartNow() {
        clickOnElement(cookies);
        clickOnElement(startButton);
    }
}
