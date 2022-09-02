package Day2_01_09.Basic_of_Recurison.Main;

public class N_times {
    public static void main(String[] args) {
//         Printing anything in n-times
        int n =10;
        recur(n);

    }
    static int recur(int n){
        if(n == 0)
            return 0;
        System.out.println("This is the Noobie World and I'm noobie in it " + n);
        return recur(n-1);
    }
}
