package Day3_04_09.Sort.Alogrithm;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {

    Scanner abs = new Scanner(System.in);
    int number = abs.nextInt();
    int[] arr = new int[number];
    for(int i = 0; i < arr.length;i++){
        arr[i]= abs.nextInt();
    }
     quickSort(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int left, int right) {
        if(left >= right){
            return;
        }
        int start = left;
        int end = right;
        int mid = left +(right-left) /2 ;
        int pivot = arr[mid];
        while(start <= end ){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end --;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

        }
        quickSort(arr,start, right);
        quickSort(arr, left , end);
    }
}
