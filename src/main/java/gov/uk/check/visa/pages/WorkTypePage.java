package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static gov.uk.check.visa.driverfactory.ManageDriver.driver;

public class WorkTypePage extends Utility {

    public WorkTypePage(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> jobType;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;

    public void selectJobType(String job) {
        for (WebElement menu : jobType) {
            if (menu.getText().equals(job)) {
                clickOnElement(menu);
                break;
            }
        }
    }

    public void clickNextStepButton() {
        clickOnElement(continueButton);
            }
}
