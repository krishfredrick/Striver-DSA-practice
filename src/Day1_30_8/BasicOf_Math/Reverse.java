package Day1_30_8.BasicOf_Math;

import java.util.Scanner;

//import static java.lang.Integer.reverse;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Number = in.nextInt();
        int ans = reverse(Number);
        System.out.println(ans);
    }
    private static int reverse(int num){
        int ans = 0;
//        int i = 0;
        while(num != 0){ //- > num > 0
           int quoent = num % 10; // - > 143 ->  3
           ans = ans*10 +quoent;  // -> 3 -> 30 +4 - > 340 +1
           num /= 10;// -->
        }
        return ans ;
    }
}
 // 143