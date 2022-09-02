package Day2_01_09.Basic_of_Recurison.Main;

public class Fibonacci {
    public static void main(String[] args) {
        int number = 7;
        int answer = fibno(number);
        System.out.println(answer);
    }

    private static int fibno(int number) {
        if(number < 3)
            return 1;
        return fibno(number-2) + fibno(number -1);
    }


}
