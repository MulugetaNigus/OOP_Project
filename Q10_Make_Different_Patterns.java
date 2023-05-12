package OOP_Project;

public class Q10_Make_Different_Patterns {
    public static void main(String[] args) {
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
//        * * * * * * *
        for(int i = 0; i <= 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
            //* * * * * * *
            //* * * * * *
            //* * * * *
            //* * * *
            //* * *
            //* *
            //*
        for(int i = 0; i <= 10; i++){
            for(int j = 1; j <= 11 - i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();
        //              *
//                    * *
//                  * * *
//                * * * *
//              * * * * *
//            * * * * * *
//          * * * * * * *
        for(int i = 0; i <= 10; i++){
            for(int j = 1; j <=10; j++) {
                if ((i + j) >= 11)
                    System.out.print("* ");
                else
                    System.out.print("  ");//the space must be two
            }
            System.out.print("\n");
            }

        System.out.println();
        System.out.println();

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(i<=j)
                    System.out.print("* ");
                else
                    System.out.print("  ");//the space is two
            }
            System.out.print("\n");
        }


    }
}
