package Day3_04_09.Sort.Alogrithm;

import java.util.Arrays;
import java.util.Scanner;

public class SortWithoutRecursion {
    public static void main(String[] args) {
        Scanner abs =new Scanner(System.in);
        int number = abs.nextInt();
        int arr[] = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= abs.nextByte();
        }
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);

    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // 13, 46 24 52
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]> current){
                arr[j+1]= arr[j];
//
            }
            arr[j+1]=current;

        }
        System.out.println("insertionSort"+Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
               if(arr[i]> arr[j]){
                   int temp = arr[i];
                   arr[i]= arr[j];
                   arr[j]= temp;
               }
            }
        }
        System.out.println("This is the SelectionSort" + Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j <arr.length-i-1 ; j++) {
//                 arr.length-i-1 is already on its shorted path so we doesn't need to envoke the loop again
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    flag = true;
                }
            }
                if (!flag){
                    break;
                }
        }
        System.out.println("BubbleSort :" + Arrays.toString(arr));
    }
    
}
