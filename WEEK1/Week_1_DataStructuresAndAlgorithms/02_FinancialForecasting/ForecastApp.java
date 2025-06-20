import java.util.Scanner;

public class ForecastApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Financial Revenue Forecast");
        System.out.print("Enter base year (e.g. 2024): ");
        int baseYear = sc.nextInt();

        System.out.print("Enter initial revenue (in Cr): ");
        double baseRevenue = sc.nextDouble();

        System.out.print("Enter annual growth rate (%): ");
        double growthRate = sc.nextDouble() / 100.0; // convert to decimal

        System.out.print("Enter number of years to forecast: ");
        int years = sc.nextInt();

        RevenueForecaster forecaster = new RevenueForecaster(baseRevenue, growthRate);

        System.out.println("\n Revenue Forecast:");
        for (int i = 0; i <= years; i++) {
            double forecastedValue = forecaster.predictRevenue(i);
            YearlyData data = new YearlyData(baseYear + i, forecastedValue);
            System.out.printf("Year %d: ₹%.2f Cr\n", data.getYear(), data.getValue());
        }

        sc.close();
    }
}
