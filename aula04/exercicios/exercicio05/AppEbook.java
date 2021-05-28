package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Ebook livro1 = new Ebook("Livro", "Autor", 100);

        livro1.exibirCapa();
        livro1.avancarPag();
        System.out.println("Pagina atual: " + livro1.exibirPag());
        livro1.voltarPag();
        System.out.println("Pagina atual: " + livro1.exibirPag());
        livro1.irParaPag(76);
        System.out.println("Pagina atual: " + livro1.exibirPag());
    }
}
