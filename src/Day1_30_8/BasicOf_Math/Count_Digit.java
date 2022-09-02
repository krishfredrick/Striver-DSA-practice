package Day1_30_8.BasicOf_Math;

import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        Scanner abs = new Scanner(System.in);
        int number = abs.nextInt();
        int ans = count(number);
        System.out.println("The Number of the digits there "+ans);
    }

    private static int count(int number) {
        int count = 0;
        while(number > 0){
            number/=10;
            count++;
        }
        return count;
    }

}
