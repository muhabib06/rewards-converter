import java.util.*;
public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // convert cash to miles
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // convert miles to cash
    }

    // get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}