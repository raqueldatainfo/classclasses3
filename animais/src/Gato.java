//public class Gato {
package animais;

public class Gato extends Animal {
    boolean ehDomestico;

    public Gato(String nome, int idade, boolean ehDomestico) {
        super(nome, idade);
        this.ehDomestico = ehDomestico;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("É doméstico? " + (ehDomestico ? "Sim" : "Não"));
    }
}
