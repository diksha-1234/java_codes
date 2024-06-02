/*Write a java program to accept and print the employee details during runtime.The details will include employee id, name, dept_ Id. The program should raise an exception if user inputs incomplete or incorrect data. The entered value should meet the following conditions:
a. First Letter of employee name should be in capital letter.
b. Employee id should be between 2001 and 5001
c. Department id should be an integer between 1 and 5.
If the above conditions are not met, then the application should raise specific exception else should complete normal execution.*/

import java.util.Scanner;

class InvalidEmployeeNameException extends Exception {
    public InvalidEmployeeNameException(String message) {
        super(message);
    }
}

class InvalidEmployeeIdException extends Exception {
    public InvalidEmployeeIdException(String message) {
        super(message);
    }
}

class InvalidDepartmentIdException extends Exception {
    public InvalidDepartmentIdException(String message) {
        super(message);
    }
}

public class EmployeeDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Accept Employee ID
            System.out.print("Enter Employee ID: ");
            int employeeId = scanner.nextInt();
            if (employeeId < 2001 || employeeId > 5001) {
                throw new InvalidEmployeeIdException("Employee ID must be between 2001 and 5001.");
            }

            // Accept Employee Name
            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.next();
            if (Character.isLowerCase(employeeName.charAt(0))) {
                throw new InvalidEmployeeNameException("First letter of Employee Name must be a capital letter.");
            }

            // Accept Department ID
            System.out.print("Enter Department ID: ");
            int deptId = scanner.nextInt();
            if (deptId < 1 || deptId > 5) {
                throw new InvalidDepartmentIdException("Department ID must be between 1 and 5.");
            }

            // Print Employee Details
            System.out.println("Employee Details:");
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Employee Name: " + employeeName);
            System.out.println("Department ID: " + deptId);

        } catch (InvalidEmployeeIdException | InvalidEmployeeNameException | InvalidDepartmentIdException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}