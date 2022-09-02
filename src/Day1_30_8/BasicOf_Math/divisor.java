package Day1_30_8.BasicOf_Math;

import java.util.Scanner;

public class divisor {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int Number = in.nextInt();
        printDivisorsOptimal(Number);

    }

    public static void printDivisorsOptimal(int n){

        System.out.println("The divisors of "+n+" are:");
        for(int i = 1; i <= (int)Math.sqrt(n); i++)
            if(n % i == 0){ // 1 2 3
                System.out.print(i + " ");
                if(i != n/i) System.out.print(n/i + " "); // 24 24 /1 = 24 24/2 = 12 24 /3 = 8
            }

        System.out.println();
    }
}
// 24 --> 1x 24 ,2 x 12  3 x 8  4
// 4 1x4 ,2x2
//128 -> 64