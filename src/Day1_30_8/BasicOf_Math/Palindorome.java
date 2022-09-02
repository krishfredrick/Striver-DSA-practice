package Day1_30_8.BasicOf_Math;

import java.util.Scanner;

public class Palindorome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean ans = palindorome(number);
        System.out.println(ans);
    }

    private static boolean palindorome(int number) {
        int original = number;
        int duplicate = 0;
        while(number >0 ){
            int digit = number % 10;
            duplicate = duplicate * 10 + digit;
            number /= 10;
        }
        return duplicate == original;
    }
}
