//public class App {
//    public static void main(String[] args) throws Exception {
//        System.out.println("Hello, World!");
//    }
//}

import animal.cachorro.gato.passaro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3, "Labrador");
        Gato gato = new Gato("Mimi", 2, true);
        Passaro passaro = new Passaro("Piu", 1, true);

        System.out.println("=== Cachorro ===");
        cachorro.imprimirInfo();

        System.out.println("\n=== Gato ===");
        gato.imprimirInfo();

        System.out.println("\n=== Pássaro ===");
        passaro.imprimirInfo();
    }
}
