package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void ShouldeCalculateAmountBuyInAddition() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void ShouldeCalculateAmountBuyInAddition1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;

        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(expected, actual);
    }

    @Test
    void ShouldeCalculateAmountBuyInAddition2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}