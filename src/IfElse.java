import java.net.SocketOption;

public class IfElse {

    public static void main (String[] args) {
        int a = 5;
        int b = 20;

        /**
         * If (boolischer Ausdruck){
         *     Was soll ausgeführt werden wenn true!
         * }else {
         *     Was soll ausgeführt werden wenn (alles andere) false
         *     }
         *
         * zwischen if und else können beliebig viele elseif (bollischer Ausdruck) gesetzt werden
         */

        if (a>b){
            System.out.println("a ist größer als b");
        } else if (a==b) {
            System.out.println("a und b sind gleich");
        } else {
            System.out.println("b ist größer als a");
        }
    }
}
