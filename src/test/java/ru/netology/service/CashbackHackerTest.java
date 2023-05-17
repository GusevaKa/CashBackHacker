package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerTest {
    @Test
    public void testCalculBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculBonus0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testCalculBonus999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculBonus1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculBonus1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }


}
