public class Methods {

    public static void main(String[] args) {
        String name = "Max";
        sayHello(name);

        int sum = addNumbers(10, 20);
    }

    public static void sayHello(String currywurst) {
        System.out.println("Hallo " + currywurst);
        System.out.println("Wie geht es dir heute?");
    }

    // void = Rückgabetyp in unserem Fall nichts!
    public static int addNumbers(int a, int b){
        return a+b;
    }
}
