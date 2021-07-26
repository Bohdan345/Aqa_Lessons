import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTests {

    @Test
    void selenideSearchTest() {
        // Открыть google
        open("https://www.google.com/");

        // Ввести Selenide в поиск
        $(byName("q")).setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("#search").shouldHave(text("selenide.org"));

        System.out.println("Test commit ");
        System.out.println("Test commit 2  ");
        Assertions.assertEquals(11,100);

    }
}


