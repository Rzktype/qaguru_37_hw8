package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PracticeFormResultComponent {
    SelenideElement tableInfo = $(".table-responsive"),
            modalTable = $(".modal-content");

    public PracticeFormResultComponent checkResult(String key, String value) {
        tableInfo.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }

    public void checkModal() {
        modalTable.shouldNotBe(visible);
    }

}
