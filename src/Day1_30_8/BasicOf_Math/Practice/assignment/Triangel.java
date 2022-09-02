package Day1_30_8.BasicOf_Math.Practice.assignment;

import java.util.Scanner;

public class Triangel {
    public static void main(String[] args) {
        Scanner abs = new Scanner(System.in);
        int number = abs.nextInt();
        upperTriangle(number);
        System.out.println("Lower Triangle");
        lowerTriangle(number);

    }
//***************************The upperTriangle*********************************************//
    public static void upperTriangle(int number){
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//***************************The LowerTriangle*********************************************//
    public static void lowerTriangle( int number){
        for (int i = number; i > 0; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
