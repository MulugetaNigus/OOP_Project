package OOP_Project;

// making encryption and decryption program
// algorithms
//1 first read 4 integer from the user using input dialog and encrypted as follows
// replace each digit with the result of adding 7 to the digit
// and get the reminder after dividing the new value by 10
// swap 1-3 and 2-4
// then print encryption format
// finally write a separate program that can decrypt into original form

import java.util.Scanner;
public class Q9_EncryptionAndDecryption {

    // accepting user integers up to 4 length
    public void AcceptUserint(int[] user){

        // creating Scanner object for our program
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < user.length; i++){
            System.out.print("Number : " + i + " ");
            int users = scan.nextInt();
            user[i] = users;
        }
    }

    //DisplayTheValuesEnteredByTheUser
    public void DisplayTheValuesEnteredByTheUser(int[] user){
        // user values
        System.out.print("You Entered: ");
        for (int i = 0; i < user.length; i++){
            System.out.print(user[i]);
        }

    }

    // methods for adding 7 in each user values
    public void Add7InEachUserValues(int[] user){

        //adding 7 for each element
        for (int i = 0; i < user.length; i++){
            user[i] += 7;
        }
    }

    // adding array elements
    public void AddArrayEl(int[] user){

        // adding array elements
        int sum = 0;
        for (int i = 0; i < user.length; i++){
            sum+=user[i];
        }
        System.out.println("the sum is: " + sum);
        float reminder = (float) sum / 10;
        System.out.println("the reminder is: " + reminder);
    }


    // using for each and display array elements after adding seven in each values
    public void DisplayArrayAfterAdd7(int[] user){

        System.out.print("After Adding Seven In each Val: ");
        // using for each and display array elements after adding seven in each values
        for (int me: user) {
            System.out.print(me);
        }
    }

    // developing the encryption methods
    public void swapAndMakeEncryption(int[] user) {

        // declaring temporary variables
        int temp1;
        int temp2;

        // reassigning the index elements
        // 1 with 3
        temp1 = user[0];
        user[0] = user[2];
        user[2] = temp1;

        // and 2 with 4
        temp2 = user[3];
        user[3] = user[1];
        user[1] = temp2;

        // after sawing display the value
        System.out.print("Encrypted Data: ");
        for (int me: user) {
            System.out.print(me);
        }
    }

    // developing the encryption methods
    public void swapAndMakeDecryption(int[] user){

        // declaring temporary variables
        int temp1;
        int temp2;

        // reassigning the index elements
        // 1 with 3
        temp1 = user[2];
        user[2] = user[0];
        user[0] = temp1;

        // and 2 with 4
        temp2 = user[1];
        user[1] = user[3];
        user[3] = temp2;

        for (int i = 0; i< user.length; i++){
            user[i] -= 7;
        }

        // after sawing display the value
        System.out.print("Decrypted Data: ");
        for (int me: user) {
            System.out.print(me);
        }

    }

    public static void main(String[] args) {

        // making encryption and decryption program
        // algorithms
        //1 first read 4 integer from the user using input dialog and encrypted as follows
        // replace each digit with the result of adding 7 to the digit
        // and get the reminder after dividing the new value by 10
        // swap 1-3 and 2-4
        // then print encryption format
        // finally write a separate program that can decrypt into original form


        // creating an object for our class
        Q9_EncryptionAndDecryption VirtualPrivateNetwork = new Q9_EncryptionAndDecryption();

        // creating Scanner object for our program
        Scanner scan = new Scanner(System.in);

        //array declaration with array elements and Over wright it letter
        //int[] user[] = {1,2,3,4};
        int[] user = new int[4];

        // loop up to array length and assign a new value for our array
        System.out.print("Enter The Number One !Then Hit Enter Up To 4 Integer !");
        System.out.println();

        //
        VirtualPrivateNetwork.AcceptUserint( user );
        System.out.println();
        //
        VirtualPrivateNetwork.DisplayTheValuesEnteredByTheUser( user );
        //
        VirtualPrivateNetwork.Add7InEachUserValues( user );
        System.out.println();
        //
        System.out.println();
        VirtualPrivateNetwork.DisplayArrayAfterAdd7( user );
        System.out.println();
        //
        System.out.println();
        VirtualPrivateNetwork.swapAndMakeEncryption( user );
        System.out.println();
        //
        System.out.println();
        VirtualPrivateNetwork.swapAndMakeDecryption( user );
        System.out.println();
        //
        System.out.println();
        VirtualPrivateNetwork.AddArrayEl( user );
        System.out.println();

    }
}
