package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldAdviceWhenAmountNotEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdviceWhenAmountEqualsZero() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdviceZeroWhenAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}