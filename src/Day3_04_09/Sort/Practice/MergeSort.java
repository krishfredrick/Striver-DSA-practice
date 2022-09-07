package Day3_04_09.Sort.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner  abs = new Scanner(System.in);
        int number = abs.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = abs.nextInt();
        }
       int[] answer = mergeSort(arr);
        System.out.println("This is the new Array method"+Arrays.toString(answer));

//        Sorting in place
        mergeSort2nd(arr, 0, arr.length-1);
        System.out.println("This is the inplace merge Sort" + Arrays.toString(arr));
    }

    private static void mergeSort2nd(int[] arr, int left, int right) {
        if(right - left == 1){
            return;
        }
        int mid = left + (right - left)/2;
        mergeSort2nd(arr , left , mid);
        mergeSort2nd(arr, mid, right);
        merge2nd(arr,left, mid, right);
    }

    private static void merge2nd(int[] arr, int left, int mid, int right) {
        int[] mix = new int [right-left];
        int i=left;
        int j=mid;
        int k=0;
        while (i<mid && j < right){
            if(arr[i]< arr[j]){
                mix[k++] = arr[i++];
            }else{
                mix[k++] = arr[j++];
            }

        }
        while (i<mid){
            mix[k++] = arr[i++];
        }
        while (j< right){
            mix[k++] = arr[ j++];
        }
        for (int l = 0; l < mix.length; l++) {
            arr[left+ l] = mix[l];
        }
    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1)
            return arr;
        int mid = arr.length /2;
        int [] left = mergeSort(Arrays.copyOfRange(arr, 0,mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr, mid,arr.length));
        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {
        int [] mixture = new int[left.length+ right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mixture[k++] = left[i++];
            }else{
                mixture[k++] = right[j++];
            }
        }
        while(i< left.length){
            mixture[k++] = left[i++];
        }
        while (j<right.length){
            mixture[k++] = right[j++];
        }
        return mixture;
    }
}
