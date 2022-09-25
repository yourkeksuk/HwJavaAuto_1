package ru.netology.service;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
        System.out.println("Кэшбэк начисляется при заказе на сумму от 1000р. Дополните Ваш заказ и получите кэшбэк!");
    }
}