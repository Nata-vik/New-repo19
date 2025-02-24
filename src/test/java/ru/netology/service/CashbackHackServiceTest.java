package ru.netology.service;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {


    @Test

    public void ShouldeCalculateAmountBuyInAddition() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test

    public void ShouldeCalculateAmountBuyInAddition1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;

        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(expected, actual);
    }

    @Test

    public void ShouldeCalculateAmountBuyInAddition2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}