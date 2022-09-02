package Day1_30_8.BasicOf_Math;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
      if(prime(number)){
          System.out.println("Prime number");
      } else {
          System.out.println("Not A prime Number");
      }
    }
    private static boolean prime(int number){
        boolean arr [] = new boolean [number];
        for(int i = 2; i< arr.length; i++){

            if(!arr[i]){
                for (int j = i; j < arr.length; j*=i) {
                    arr[j] = true;
                }

            }
        }
        return false;
    }
}
