package OOP_Project;

import java.util.Scanner;

public class Q4_Calculate_Miles_Per_Gallon {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                int tripCount = 0;
                float totalMpg = 0;

                while (true) {
                    System.out.print("Enter miles driven for trip " + (tripCount+1) + " (-1 to quit): ");
                    int milesDriven = input.nextInt();

                    if (milesDriven == -1) {
                        System.out.println("Goodbye!");
                        break;
                    }

                    System.out.print("Enter gallons used for trip " + (tripCount+1) + ": ");
                    int gallonsUsed = input.nextInt();

                    float mpg = (float) milesDriven / gallonsUsed;
                    System.out.printf("Miles per gallon for trip %d: %.2f\n", tripCount+1, mpg);

                    totalMpg += mpg;
                    System.out.printf("Combined miles per gallon for all trips up to now: %.2f\n", totalMpg / (tripCount+1));
                    tripCount++;
                }
            }
        }

// The program uses a while loop to repeatedly prompt the user for miles driven and gallons used for each trip. The loop continues until the user enters -1 to quit.

// For each trip, the program calculates the miles per gallon by dividing miles driven by gallons used, and then displays the result using printf to format the output with two decimal places.

// The program also calculates the combined miles per gallon for all trips up to this point by adding up all the individual miles per gallon values and dividing by the number of trips. The result is also displayed using printf with two decimal places.
