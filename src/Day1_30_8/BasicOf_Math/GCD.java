package Day1_30_8.BasicOf_Math;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int ans = gcd(n1, n2);
//        System.out.println(n1 % n2);
        System.out.println("This is the answer:"+ans);
    }
    private static int gcd(int n1, int n2){
        if(n2 == 0){
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}
// 15 42
