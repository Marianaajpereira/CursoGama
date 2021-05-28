package exemplos.exemplo03;

public class Pessoa {
    // atributos
    String nome;
    int telefone;

    // metodos
    Pessoa(String n, int t) { // construtor
        nome = n;
        telefone = t;
    }

    void apresentar() {
        System.out.println("Ola! Eu sou " + nome);
    }

    int obterTelefone() {
        return telefone;
    }
}