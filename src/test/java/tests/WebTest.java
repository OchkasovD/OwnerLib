package tests;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class WebTest extends TestBase {
    @Test
    void gitTest() {

        open("/");
        $(Selectors.byTagAndText("button", "Solutions")).hover();
        $(Selectors.byTagAndText("a", "Enterprise")).click();
        $("h4.h6-mktg").shouldHave(text("GitHub for enterprises"));

    }
}


