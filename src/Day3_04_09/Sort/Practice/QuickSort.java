package Day3_04_09.Sort.Practice;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner abs = new Scanner(System.in);
        int number = abs.nextInt();
        int [] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = abs.nextInt();
        }
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int left, int right) {

            if(right - left ==  0){
                return;
            }
            int start = left;
            int end = right;
            int mid = start+(end-right)/2;
            int pivot = mid;
    }
}
