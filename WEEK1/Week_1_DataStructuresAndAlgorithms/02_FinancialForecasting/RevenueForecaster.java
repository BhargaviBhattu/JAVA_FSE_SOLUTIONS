import java.util.HashMap;
import java.util.Map;

public class RevenueForecaster {
    private double initialValue;
    private double annualGrowthRate; // in decimal form (e.g. 0.10 for 10%)
    private Map<Integer, Double> memo = new HashMap<>();

    public RevenueForecaster(double initialValue, double annualGrowthRate) {
        this.initialValue = initialValue;
        this.annualGrowthRate = annualGrowthRate;
    }

    public double predictRevenue(int yearOffset) {
        if (yearOffset == 0) return initialValue;

        if (memo.containsKey(yearOffset)) return memo.get(yearOffset);

        double predicted = predictRevenue(yearOffset - 1) * (1 + annualGrowthRate);
        memo.put(yearOffset, predicted);
        return predicted;
    }
}
