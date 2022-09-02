package Day2_01_09.Basic_of_Recurison.Main;

import java.util.ArrayList;

public class Array_reverse {
    public static void main(String[] args) {
        int[] dumi = { 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        System.out.println((reverse(dumi, dumi.length-1)));
    }
    static ArrayList<Integer> answer = new ArrayList<>();
    public static ArrayList<Integer>  reverse( int[] dumi , int length){
        if( length  <= 0) {
//            answer.add(dumi[length]);
            return answer;
        }
        answer.add(dumi[length]);
        return reverse(dumi, --length ); // -> 3
    }
}

