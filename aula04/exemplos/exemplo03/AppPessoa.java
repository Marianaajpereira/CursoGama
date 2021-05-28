package exemplos.exemplo03;

public class AppPessoa {
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Mariana", 12345);
        
        p.apresentar();
        System.out.print("Meu telefone e " + p.obterTelefone());
    }
}
