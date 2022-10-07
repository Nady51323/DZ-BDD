package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
public class MoneyTransfer {

    private SelenideElement title = $("[data-test-id='dashboard']");
    private SelenideElement subtitle = $(byText("Пополнение карты"));
    private SelenideElement amountForTransfer = $("[data-test-id='amount'] input");
    private SelenideElement cardNumberFrom = $("[data-test-id='from'] input");
    private SelenideElement transferButton = $("[data-test-id='action-transfer'] span");
    private SelenideElement errorNotification = $("[data-test-id='error-notification']");


    public MoneyTransfer(){
        title.shouldBe(visible);
        subtitle.shouldBe(visible);
    }

    public void moneyTransfer(int amount, String cardNumber) {
        amountForTransfer.setValue(String.valueOf(amount));
        cardNumberFrom.setValue(cardNumber);
        transferButton.click();
//        return new MoneyTransfer();
    }

    public void errorNotification() {
        errorNotification.shouldBe(visible);
    }
}
