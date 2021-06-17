package ru.netology.service;

import org.junit.jupiter.api.Test;
import ru.netology.service.CashBackHackerService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashBackHackerServiceTest {
    @Test
    void shouldReturn200IfAmountIs800() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn700IfAmountIs1300() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1300;

        int actual = service.remain(amount);
        int expected = 700;

        assertEquals(expected, actual);

    }

    @Test
    void shouldReturn1000IfAmountIsZero() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    void  shouldReturn1000IfAmountIs1000() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }
}