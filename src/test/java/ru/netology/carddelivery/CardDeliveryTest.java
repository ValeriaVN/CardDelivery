package ru.netology.carddelivery;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CardDeliveryTest {
    @Test
    public void shouldSubmitRequest(){
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999");
        $("[data-test-id=city] input").setValue("Москва");
        $("[data-test-id=date] input").doubleClick();
        $("[data-test-id=date] input").sendKeys("30.09.2022");
        $("[data-test-id=name] input").setValue("Петров Иван");
        $("[data-test-id=phone] input").setValue("+74951001010");
        $("[data-test-id=agreement]").click();
        $(".button__text").click();
        $(withText("Успешно!")).shouldBe(visible, Duration.ofSeconds(15));








    }
}
