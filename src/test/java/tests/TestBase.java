package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import pages.TextBoxPage;
import pages.PracticeFormPage;


public class TestBase {

    public PracticeFormPage practiceFormPage = new PracticeFormPage();
    public TextBoxPage textBoxPage = new TextBoxPage();

    @BeforeAll
    static void setupConfig() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @AfterEach
    void cleanUp() {
        Selenide.clearBrowserCookies();
        Selenide.closeWebDriver();
    }

}