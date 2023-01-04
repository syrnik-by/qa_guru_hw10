package by.syrnik;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TheInternetTests {

    @Test
    void checkDragAndDropWithSelenide() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-b header").shouldHave(text("A"));
        $("#column-a header").shouldHave(text("B"));
    }

    @Test
    void checkDragAndDropWithActions() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
//        через actions() не работает
//        actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(405, 88).release().perform();
//        actions().dragAndDrop($("#column-a"), $("#column-b"));
    }
}
