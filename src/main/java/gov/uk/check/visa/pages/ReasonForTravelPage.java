package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    public ReasonForTravelPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> needUKVisa;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    public void selectReasonForVisit(String reason) {
        for (WebElement menu : needUKVisa) {
            if (menu.getText().equals(reason)) {
                clickOnElement(menu);
                break;
            }
        }
    }

    public void clickNextStepButton() {
        clickOnElement(continueButton);
    }
}
