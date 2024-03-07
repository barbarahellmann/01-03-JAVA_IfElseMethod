//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
// Sichtbarkeit (static) Rückgabeparameter Methodennamen (Übergabeparameter {Methodenkörper}
    public static void main(String[] args) {
        System.out.println("Hello world");

        //Ganzzahlen
        int age = 33;
        long bigNumber = 1000000000000000000L;

        //Fließkommazahlen
        float price= 3.99f;
        double scienceNumber =23.5465454654;

        //Wahrheitszustände
        boolean isSunny = true;
        boolean isRainy = false;

        //Zeichen
        char firstLetter = 'l';

        //String (Komplexxer Datentyp -> Zeichenkette)
        String name = "Max Mustermann";

        //Basic Operators
        /**
         * Mathematischen Operatoren = +, -, *, /  | Wir bekommen ein mathematisches Ergebnis (Zahl)
         * Vergleichsoperatoren = == (IstGleich), != (Ist nicht), >, <, >=, <=  | Wir bekommen einen Wahrheitswert, also true/false
         * Logische Operatoren = && (Und), || (Oder), ! (Nicht) | Anwendbar auf Wahrheitswerte
         */

        //Beispiel Operatoren
        int x = 10;
        int y= 5;

        int sum =x+y;
        int difference = x-y;
        int product = x*y;
        int quotient = x/y;
        System.out.println("Die Summe aus " + x + " und " + y + " ist gleich: " + sum);
        System.out.println(String.format("Die Summe aus %d und %d ist gleich %d",x, y,sum ));
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);

        boolean isEqual = x==y; //Prüfe auf Gleichheit
        boolean isGreater = x>y; // Größer als prüfen
        boolean logicalAnd = x > 0 && y>0; // Prüft ob beide Instanzen true sind
        boolean logicalOr = x > 0 || y < 0; // Prüft ob eine Instanz true ist
        boolean logicalNot = !(x>y);
        boolean logicalNot2 = !(x<y);
        System.out.println(isEqual);
        System.out.println(isGreater);
        System.out.println(logicalAnd);
        System.out.println(logicalOr);
        System.out.println(logicalNot);
        System.out.println(logicalNot2);
    }
}