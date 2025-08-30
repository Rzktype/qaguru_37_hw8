package tests;

import org.junit.jupiter.api.Test;
import pages.components.PracticeFormResultComponent;
import utils.TestData;

import static utils.RandomUtils.city;
import static utils.RandomUtils.state;

public class PracticeFormTests extends tests.TestBase {
    PracticeFormResultComponent tableUserInfo = new PracticeFormResultComponent();
    TestData random = new TestData();
    @Test
    void fillFormTest() {

        practiceFormPage.openPage()
                .setFirstName(random.firstName)
                .setLastName(random.lastName)
                .setUserEmail(random.email)
                .setGender(random.gender)
                .setUserNumber(random.phoneNumber)
                .setDateOfBirth(random.dayOfBirth, random.monthOfBirth, random.yearOfBirth)
                .setSubjectsInput(random.subjects)
                .setHobbies(random.hobbies)
                .uploadPicture(random.pictures)
                .setAddress(random.streetAddress)
                .setState(state)
                .setCity(city)
                .clickSubmit();

        tableUserInfo.checkResult("Student Name", random.firstName + " " + random.lastName)
                .checkResult("Student Email", random.email)
                .checkResult("Gender", random.gender)
                .checkResult("Mobile", random.phoneNumber)
                .checkResult("Date of Birth", random.dayOfBirth + " " + random.monthOfBirth + "," + random.yearOfBirth)
                .checkResult("Subjects", random.subjects)
                .checkResult("Hobbies", random.hobbies)
                .checkResult("Picture", random.pictures)
                .checkResult("Address", random.streetAddress)
                .checkResult("State and City", state + " " + city);
    }

    @Test
    void fillPartialFormTest() {
        practiceFormPage.openPage()
                .setFirstName(random.firstName)
                .setLastName(random.lastName)
                .setUserEmail(random.email)
                .setGender(random.gender)
                .setUserNumber(random.phoneNumber)
                .clickSubmit();
        tableUserInfo.checkResult("Student Name", random.firstName + " " + random.lastName)
                .checkResult("Student Email", random.email)
                .checkResult("Gender", random.gender)
                .checkResult("Mobile", random.phoneNumber);
    }

    @Test
    void emptyFormTest() {
        practiceFormPage.openPage()
                .clickSubmit();
        tableUserInfo.checkModal();
    }
}