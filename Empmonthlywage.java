public class MonthlyWage {
    public static void main(String[] args) {
        // Define the wage per hour, full day hour, and number of working days per month constants
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;
        final int WORKING_DAYS_PER_MONTH = 20;

        // Calculate the monthly wage for a full-time employee
        int monthlyWage = WAGE_PER_HOUR * FULL_DAY_HOUR * WORKING_DAYS_PER_MONTH;

        // Print the monthly wage
        System.out.println("The monthly wage of the employee is: " + monthlyWage);
    }
}
