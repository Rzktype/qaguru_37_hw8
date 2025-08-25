package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.ClearPageComponent;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class TextBoxPage extends ClearPageComponent {

    SelenideElement mainHeaderText = $(".text-center"),
            userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressTextArea = $("#currentAddress"),
            permanentAddressTextArea = $("#permanentAddress"),
            submitButton = $(".btn-primary");

    public TextBoxPage openPage() {
        open("/text-box");
        mainHeaderText.shouldHave(text("Text Box"));
        removeBanners();
        return this;
    }

    public TextBoxPage setUserName(String value) {
        userNameInput.setValue(value);
        return this;
    }

    public TextBoxPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddressTextArea.setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddressTextArea.setValue(value);
        return this;
    }

    public void clickButton() {
        submitButton.click();
    }


}
