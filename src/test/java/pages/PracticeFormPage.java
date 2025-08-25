package pages;


import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.ClearPageComponent;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage extends ClearPageComponent {

    CalendarComponent calendar = new CalendarComponent();
    /// SelenideElements
    SelenideElement titleLabel = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            setBirthDate = $("#dateOfBirthInput"),
            userNumberInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbiesCheckboxes = $("#hobbiesWrapper"),
            uploadPictureInput = $("#uploadPicture"),
            currentAddressTextArea = $("#currentAddress"),
            stateDropDown = $("#react-select-3-input"),
            cityDropDown = $("#react-select-4-input"),
            submitButton = $(".btn-primary");


    public PracticeFormPage openPage() {
        open("/automation-practice-form");
        titleLabel.shouldHave(text("Student Registration"));
        removeBanners();
        return this;
    }


    public PracticeFormPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public PracticeFormPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public PracticeFormPage setUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public PracticeFormPage setGender(String gender) {
        genderWrapper.$(byText(gender)).click();
        return this;
    }

    public PracticeFormPage setUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public PracticeFormPage setDateOfBirth(String day, String month, String year) {
        setBirthDate.click();
        calendar.setDate(day, month, year);
        return this;
    }

    public PracticeFormPage setSubjectsInput(String subject) {
        subjectsInput.setValue(subject).pressEnter();
        return this;
    }

    public PracticeFormPage setHobbies(String hobby) {
        hobbiesCheckboxes.$(byText(hobby)).click();
        return this;
    }

    public PracticeFormPage uploadPicture(String filename) {
        uploadPictureInput.uploadFromClasspath(filename);
        return this;
    }

    public PracticeFormPage setAddress(String value) {
        currentAddressTextArea.setValue(value);
        return this;
    }

    public PracticeFormPage setState(String state) {
        stateDropDown.setValue(state).pressEnter();
        return this;
    }

    public PracticeFormPage setCity(String city) {
        cityDropDown.setValue(city).pressEnter();
        return this;
    }

    public void clickSubmit() {
        submitButton.click();
    }

}