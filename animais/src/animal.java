//public class App {
//    public static void main(String[] args) throws Exception {
//        System.out.println("Hello, World!");
//    }
//}

import animais.Cachorro;
import animais.Gato;
import animais.Passaro;

public class animal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3, "Labrador");
        Gato gato = new Gato("Mimi", 2, true);
        Passaro passaro = new Passaro("Piu", 1, true);

        System.out.println("=== Cachorro ===");
        cachorro.imprimirInfo();

        System.out.println("\n=== Gato ===");
        gato.imprimirInfo();
