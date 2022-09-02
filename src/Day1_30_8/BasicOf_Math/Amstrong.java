package Day1_30_8.BasicOf_Math;

import java.util.Scanner;

//Amstrong number where the number unit it is multiplied and checked
public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Number = in.nextInt();
        if (amstrong(Number)){
            System.out.println("This is the Palindrome");
        }else{
            System.out.println("This is the non Palindrome");
        }
    }

    private static boolean amstrong(int number) {
        int dumicount = number , dumi = number;
        int answer = 0;
        int count =0;
        while(dumicount != 0){
            count++;
            dumicount /= 10;
        }
        while(dumi > 0){
            int unit = dumi % 10;
            answer+= Math.pow(unit,count);
            dumi /= 10;
        }
        return (answer == number);
    }
}
// 143 -- 1**3 + 4**3 + 3** 3
// 1645 --> 1**