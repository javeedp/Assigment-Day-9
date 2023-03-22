public class DailyWage {
    public static void main(String[] args) {
        // Define the wage per hour and full day hour constants
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;

        // Calculate the daily wage
        int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;

        // Print the daily wage
        System.out.println("The daily wage of the employee is: " + dailyWage);
    }
}
