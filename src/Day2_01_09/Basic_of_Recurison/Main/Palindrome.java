package Day2_01_09.Basic_of_Recurison.Main;

public class Palindrome {
    public static void main(String[] args) {
        String Ummul = "bob";
        boolean answer = palindrom(Ummul.toLowerCase(),0);
        System.out.println(answer);
    }

    private static boolean palindrom(String dost, int half) {
        if(half > dost.length()/2)
            return true;
        if(dost.charAt(half) != dost.charAt(dost.length()/2 - (half-1)))
            return false;
        return palindrom(dost,half+1);
    }
}
