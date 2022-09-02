package Day1_30_8.BasicOf_Math.Practice;

import java.util.Scanner;

public class Practice_BSM {
    public static void main(String[] args) {
        Scanner abs = new Scanner(System.in);
        int Number_one = abs.nextInt();
        int Number_Two = abs.nextInt();
        reverse(Number_one);
        amstrong(370);
    }
    public static void reverse(int n){
        int rever = n;
        int ans = 0;
        while(n != 0){
            int unit = n%10;
            ans = ans * 10 + unit;
            n /= 10;
        }
        System.out.println("This is the Reverse: "+ans);
    }

    public static void amstrong (int number){
        int dumicount = number;
        int dumi = number;
        int count = 0;
        int answer = 0;

        while(dumicount != 0){
             count ++;
             dumicount /= 10;
        }
        System.out.println(count);
        while(dumi > 0 ){
            int unit = dumi % 10;
            answer  +=  Math.pow(unit,count);
            dumi /= 10;
        }
        if(number == answer)
            System.out.println("This is the amstrong number "+answer);
        else
            System.out.println(answer + ": This is not amstrong number");
    }
}
