package OOP_Project;
import java.util.Scanner;

public class Q3_Change_Student_Mark_Out_Of_100 {

    public static void main(String[] args) {
        // creating our object
        Scanner input = new Scanner(System.in);
        int NumberOfStudentStorage;
        System.out.print("Enter the number of student you want to store: ");
        NumberOfStudentStorage = input.nextInt();

        int[] mark = new int[10];

        System.out.print("Enter the mark of student from total assessment: ");
        for(int i = 0; i < NumberOfStudentStorage; i++){
            mark[i] = input.nextInt();
        }

        System.out.print("Enter total mark or total assessment: ");
        float TotalAssessment = input.nextFloat();

        System.out.print("The changed mark of student out of 100% is :");
        for(int i = 0; i < NumberOfStudentStorage; i++){
            System.out.println(mark[i] * 100 / TotalAssessment);
        }

//        // declaring our array
//        float[] mark = new float[2];
//
//
//        for (int i = 0; i <= 1; i++){
//            // Accepting the student marks
//            System.out.println("Enter your mark Here: ");
//            mark[i] = input.nextFloat();
//
//        // making validation
//        if (mark[i] > 100){
//            mark[i] = 100 * mark[i] / 200;
//          }
//        }
//
//        // displaying the final correct values
//        for (int i = 0; i < 40; i++){
//            System.out.println("marks out of 100: " + mark[i]);
//        }
    }
}
