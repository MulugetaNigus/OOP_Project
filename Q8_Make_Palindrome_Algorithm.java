package OOP_Project;
import java.util.Scanner;
public class Q8_Make_Palindrome_Algorithm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;
        System.out.print("please, enter five digit number: ");
        number = input.nextInt();
        int num = number;
        int digit = 0;

        while(num!=0){
            num = num / 10;
            digit++;
        }
        if (digit != 5){
            System.out.println("Error");
            System.out.print("please, enter five digit number: ");
            number = input.nextInt();
        }
        int original_number = number;
        int reverse = 0;
        while(number != 0){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        if (original_number == reverse){
            System.out.println(original_number + " is palindrome number");
        }
        else{
            System.out.println(original_number + " is not palindrome number");
        }
    }
}
