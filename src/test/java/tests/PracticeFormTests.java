package tests;

import org.junit.jupiter.api.Test;
import pages.components.PracticeFormResultComponent;


public class PracticeFormTests extends tests.TestBase {
    PracticeFormResultComponent tableUserInfo = new PracticeFormResultComponent();

    @Test
    void fillFormTest() {

        practiceFormPage.openPage()
                .setFirstName("Artur")
                .setLastName("Legenda")
                .setUserEmail("alex@egorov.com")
                .setGender("Male")
                .setUserNumber("7999333444")
                .setDateOfBirth("12", "August", "1993")
                .setSubjectsInput("Maths")
                .setHobbies("Music")
                .uploadPicture("testImage.jpg")
                .setAddress("Some street 1")
                .setState("Haryana")
                .setCity("Karnal")
                .clickSubmit();

        tableUserInfo.checkResult("Student Name", "Artur Legenda")
                .checkResult("Student Email", "alex@egorov.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "7999333444")
                .checkResult("Date of Birth", "12 August,1993")
                .checkResult("Subjects", "Maths")
                .checkResult("Hobbies", "Music")
                .checkResult("Picture", "testImage.jpg")
                .checkResult("Address", "Some street 1")
                .checkResult("State and City", "Haryana Karnal");
    }

    @Test
    void fillPartialFormTest() {
        practiceFormPage.openPage()
                .setFirstName("Artur")
                .setLastName("Legenda")
                .setUserEmail("alex@egorov.com")
                .setGender("Male")
                .setUserNumber("7999333444")
                .clickSubmit();
        tableUserInfo.checkResult("Student Name", "Artur Legenda")
                .checkResult("Student Email", "alex@egorov.com")
                .checkResult("Gender", "Male")
                .checkResult("Mobile", "7999333444");
    }

    @Test
    void emptyFormTest() {
        practiceFormPage.openPage()
                .clickSubmit();
        tableUserInfo.checkModal();
    }
}