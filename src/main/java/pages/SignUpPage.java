package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageObject {

    @FindBy(id="firstname") private WebElement firstNameTextField;
    @FindBy(id="signup") private WebElement submitButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public Boolean isInitialised() {
        return firstNameTextField.isDisplayed();
    }

    public void enterName(String firstName, String lastName) {
        this.firstNameTextField.clear();
        this.firstNameTextField.sendKeys(firstName);
    }

    public ReceiptPage submit() {
        submitButton.click();
        return new ReceiptPage(driver);
    }
}
