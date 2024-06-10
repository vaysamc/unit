package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTestNG {
    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn900IfAmountIs1100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 900;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}