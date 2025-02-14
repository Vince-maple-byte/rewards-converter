import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        //When
        double cashValue = 100;
        RewardValue rewardValue = new RewardValue(cashValue);
        int milesValue = 100 / RewardValue.CONVERSION_RATE;
        //Then
        assertEquals(milesValue, rewardValue.cashToMiles());
    }

    @Test
    void convert_from_miles_to_cash() {
        //When
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(cashValue);
        double cash = 10000 * RewardValue.CONVERSION_RATE;
        //Then
        assertEquals(cash, rewardValue.milesToCash());
    }
}
