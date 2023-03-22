public class EmployeeAttendance {
    public static void main(String[] args) {
        // Generate a random number between 0 and 1 (inclusive)
        int attendance = (int) (Math.random() * 2);

        // Check if the employee is present or absent
        if (attendance == 1) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}
