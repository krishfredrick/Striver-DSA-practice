package Day2_01_09.Basic_of_Recurison.Main;

public class N_Factorial {
    public static void main(String[] args) {
        int Number = 5;
        System.out.println(factorial(1,Number));
    }

    private static int factorial(int ans,int number) {
        if(number == 1) {
            return ans;
        }
        ans *= number;
        return factorial(ans, number - 1);
    }
}
