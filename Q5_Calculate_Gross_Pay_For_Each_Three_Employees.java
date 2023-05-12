/**
 *
 */
package OOP_Project;

import java.util.Scanner;
//	4.20 (Salary Calculator) Develop a Java application that
//	determines the gross pay for each of three employees. The
//	company pays straight time for the first 40 hours worked by
//	each employee and time and a half for all hours worked in
//	excess of 40. You�re given a list of the employees, their
//	number of hours worked last week and their hourly rates.
//	Your program should input this information for each employee,
//	then determine and display the employee�s gross pay.
//	Use class Scanner to input the data.

public class Q5_Calculate_Gross_Pay_For_Each_Three_Employees {

    public double CalculationMethod(int numberOfHours, double hourlyRate) {
        double grossPay;
        if (numberOfHours <= 40)
        {
            grossPay = numberOfHours * hourlyRate;
        }
        else
        {
            System.out.printf("%S", "Overtime Time Notice: ");
            int HalfTime = numberOfHours / 2;
            grossPay = (numberOfHours + HalfTime) * hourlyRate;
        }
        return grossPay;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Q5_Calculate_Gross_Pay_For_Each_Three_Employees myC = new Q5_Calculate_Gross_Pay_For_Each_Three_Employees();
        String[] EmployeeNames = {" ", " ", " "};
        int[] HoursWorked = {0, 0, 0};
        double hourlyRate;

        System.out.println("Welcome to the Salary Calculator.\n");
        System.out.println("Please enter:");

        for (int i = 0; i < 3; i++)
        {
            System.out.println("Employee" + (i + 1) + " Name: ");
            EmployeeNames[i] = input.nextLine();
        }

        for (int i = 0; i < 3; i++)
        {
            System.out.print(EmployeeNames[i] + "'s hours worked: ");
            HoursWorked[i] = input.nextInt();
        }

        System.out.print("and finally, how much all three made per hour: ");
        hourlyRate = input.nextDouble();
        for (int i = 0; i < 3; i++)
        {
            System.out.printf("The gross pay for " + EmployeeNames[i] + " is: $%.2f",
                    myC.CalculationMethod(HoursWorked[i], hourlyRate));
            System.out.println();
        }
    }

}
