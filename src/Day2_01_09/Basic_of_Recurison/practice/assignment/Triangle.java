package Day2_01_09.Basic_of_Recurison.practice.assignment;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner abs = new Scanner(System.in);
        int number = abs.nextInt();
        upperEqualatorTriangle(number);
        System.out.println();
        System.out.println("This is the upper equalator Triangle");
        lowerEqualatorTriangle(number);
    }

    private static void lowerEqualatorTriangle(int number) {
        for (int i = number; i > 0 ; i--) {
            for (int j = 1; j <= number -i ; j++) {
                System.out.print(" "+" ");

            }
            for (int j = 1; j < i *2 ; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();

        }
    }

    private static void upperEqualatorTriangle(int number) {
        for ( int i = 1; i <= number; i++){
            for (int j = 1; j <=number - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j < i * 2 ; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
