package OOP_Project;

import java.util.Scanner;

public class Q6_Change_Binary_To_Decimal {

    public static void main(String[] args) {

        // creating our scanner object
//        Scanner input = new Scanner(System.in);
//
//        declaration of variables
//        long numberOfSize;
//        long rem;
//        long binary_num;
//        long decimal_num = 0;
//        long base = 1;
//
//        System.out.print(" Enter a binary number with the combination of 0s and 1s: ");
//        numberOfSize = input.nextLong();
//        binary_num = numberOfSize; // assign the binary number to the binary_num variable
//
//        while ( numberOfSize > 0) {
//            rem = numberOfSize % 10;  /* divide the binary number by 10 and store the remainder in rem variable. */
//            decimal_num = decimal_num + rem * base;
//            numberOfSize = numberOfSize / 10; // divide the number with quotient
//            base = base * 2;
//        }
//
//        String binary_number = " The binary number is: " + binary_num; // print the binary number
//        String decimal_number = " The decimal number is: " +  decimal_num; // print the decimal
//        System.out.println(binary_number);
//        System.out.println(decimal_number);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Binary Number: ");
        String BinaryNumber = input.nextLine();

        int decimalPoint = 0;
        int positionPoint = 1;

        for (int i = BinaryNumber.length() - 1; i >= 0; i--){
            if (BinaryNumber.charAt(i) == '1'){
                decimalPoint += positionPoint;
            }
            positionPoint *= 2;
        }

        System.out.println("decimal equivalent to: " + decimalPoint);

    }
}
