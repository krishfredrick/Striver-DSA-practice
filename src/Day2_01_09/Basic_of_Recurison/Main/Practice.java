package Day2_01_09.Basic_of_Recurison.Main;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        } int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer +=arr [i];
            int dumi =0;
            for (int j = arr.length -1; j > i; j--) {
                dumi +=arr[j];

            }
            if(answer < dumi){
                break;
            }

        }
    }
}
