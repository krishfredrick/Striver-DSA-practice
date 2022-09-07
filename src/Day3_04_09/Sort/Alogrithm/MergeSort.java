package Day3_04_09.Sort.Alogrithm;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int number = in.nextInt();
        int arr[] = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
       int answer[] = mergeSort(arr);
        System.out.println(Arrays.toString(answer));
        mergeSort2nd(arr, 0,arr.length);
        System.out.println("This is the array in-place" + Arrays.toString(arr));

    }

    private static void mergeSort2nd(int[] arr, int start, int end) {
        if(end - start == 1) {
            return;
        }
        int mid = start + (end- start)/2;
        mergeSort2nd(arr,start,mid);
        mergeSort2nd(arr,mid,end);
        merge2nd(arr, start,mid,end);
    }

    private static void merge2nd(int[] arr, int start, int mid, int end) {
        int[] mix = new int [end- start];
        int i = start;
        int j =mid;
        int k = 0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k++] = arr[i++];
            }else{
                mix[k++] = arr[j++];
            }

        }
        while(i < mid ){
            mix[k++] = arr[i++];
        }
        while (j < end){
            mix[k++] = arr[j++];
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }

    private static int[] mergeSort(int[] arr ) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length /2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge (left, right) ;
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mixed  = new int[first.length + second.length];
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;
        while(i < first.length && j < second.length){
            if (first[i] > second[j]) {
                mixed[k] = second[j];
                j++;
            }
            else{
                mixed[k]=first[i];
                i++;
            }
            k++;

        }
        while(i<first.length){
            mixed[k++]=first[i++];
        }
        while(j<second.length){
            mixed[k++] = second[j++];
        }
        return mixed;
    }
}
