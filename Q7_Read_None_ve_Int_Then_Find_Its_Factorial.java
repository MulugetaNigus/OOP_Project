package OOP_Project;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q7_Read_None_ve_Int_Then_Find_Its_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int number = 0;
        System.out.print("Enter a Number: ");
        int number = scan.nextInt();

        for(; number < 0 ;){
            System.out.println("please, enter positive number");
            System.out.print("Enter a Number again: ");
            number = scan.nextInt();
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++){
                factorial = factorial * i;
             }
        System.out.println("the factorial of " + number + " is " + factorial);
       }
    }