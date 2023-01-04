package by.syrnik;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTests extends TestBase {

    @Test
    void checkPageEnterprise() {
        open("");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("html").shouldHave(text("Build like the best"));
    }
}
