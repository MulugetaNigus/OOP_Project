package OOP_Project;

//import java.util.Scanner;

public class Q11_Make_a_Diamond_Pattern {

    public static void main(String[] args) {

        for(int i = 0; i <= 9; i++)
        {
            for(int j = 1; j <= 9-i; j++)
                System.out.print(" ");
            for(int j = 1; j <= 2*i-1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(int i=9-1; i>=1; i--)
        {
            for(int j = 1; j <= 9-i; j++)
                System.out.print(" ");
            for(int j = 1; j <= 2*i-1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}

