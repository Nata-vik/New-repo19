package ru.netology.service;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {


    @Test

    public void ShouldeCalculateAmountBuyInAddition() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test

    public void ShouldeCalculateAmountBuyInAddition1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;

        int expected = 800;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test

    public void ShouldeCalculateAmountBuyInAddition2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}