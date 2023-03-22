public class PartTimeEmployee {
    public static void main(String[] args) {
        // Define the wage per hour, full day hour, and part-time hour constants
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;
        final int PART_TIME_HOUR = 4;

        // Calculate the daily wage for a full-time employee
        int fullTimeWage = WAGE_PER_HOUR * FULL_DAY_HOUR;

        // Calculate the daily wage for a part-time employee
        int partTimeWage = WAGE_PER_HOUR * PART_TIME_HOUR;

        // Print the daily wages for a full-time and part-time employee
        System.out.println("The daily wage of a full-time employee is: " + fullTimeWage);
        System.out.println("The daily wage of a part-time employee is: " + partTimeWage);
    }
}
