//public class Animal {}

package animal;

public class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}


