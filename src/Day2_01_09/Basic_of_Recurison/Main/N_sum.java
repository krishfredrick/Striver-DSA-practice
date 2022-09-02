package Day2_01_09.Basic_of_Recurison.Main;

public class N_sum {
    public static void main(String[] args) {
        int Number = 4;
       System.out.println( sum(0,Number));

    }

    private static int sum(int ans ,int number) {

        if(number == 0){
            return ans;
        }
        ans+=number;
        return sum(ans,number -1);
    }
}
