package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackHackerServiceTest {


    @Test
    void shouldReturn200IfAmountIs800() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturn700IfAmountIs1300() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1300;

        int actual = service.remain(amount);
        int expected = 700;

        assertEquals(actual, expected);

    }

    @Test
    void shouldReturn1000IfAmountIsZero() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnZeroIfAmountIs1000() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}
