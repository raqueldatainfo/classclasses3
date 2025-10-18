//public class Passaro {}

package animais;

public class Passaro extends Animal {
    boolean podeVoar;

    public Passaro(String nome, int idade, boolean podeVoar) {
        super(nome, idade);
        this.podeVoar = podeVoar;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Pode voar? " + (podeVoar ? "Sim" : "Não"));
    }
}
