import java.sql.SQLOutput;

public class MethodsChallenge {

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(subtract(5, 8));

        System.out.println(makePositive(6));
        System.out.println(makePositive(-6));

        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("teller"));




        int a = 10;
        int b = 20;

        if (a > b){
            subtract(a,b);
            System.out.println("True");
        } else {
            add(a, b);
            System.out.println("False)");
        }
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int makePositive (int a){
        return Math.abs(a);
    }

    public static int isEven(int a){
        if (a % 2 == 0) {
            return a;
        }else{
            return a*2;
        }


    }

    public static Boolean isPalindrome(String palindrome){

        String umgedreht = new StringBuilder(palindrome).reverse().toString();

        if (palindrome.equals(umgedreht)){
            return true;
        }else{
            return true;
        }
    }
}
