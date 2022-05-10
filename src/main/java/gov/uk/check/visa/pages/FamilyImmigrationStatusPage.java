package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static gov.uk.check.visa.driverfactory.ManageDriver.driver;

public class FamilyImmigrationStatusPage extends Utility {

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> immigrationStatus;

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continueButton;


    public void selectImmigrationStatus(String status){
        for (WebElement menu : immigrationStatus) {
            if (menu.getText().equals(status)) {
                clickOnElement(menu);
                break;
            }
        }
    }
    public void clickNextStepButton() {
        clickOnElement(continueButton);
    }
}
