package gov.uk.check.visa.pages;
import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static gov.uk.check.visa.driverfactory.ManageDriver.driver;

public class SelectNationalityPage extends Utility {

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//select[@id='response']")
    WebElement findNationality;

    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;



    public void selectNationality(String nationality){
        selectByVisibleTextFromDropDown(findNationality, nationality);
            }

    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
    }
}
