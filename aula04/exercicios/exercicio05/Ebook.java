package exercicios.exercicio05;

public class Ebook {
    // atributos
    private String titulo, autor;
    private int totalPag, pagAtual;

    public Ebook(String titulo, String autor, int totalPag) {
        this.titulo=titulo;
        this.autor=autor;
        if(totalPag>0) {
            this.totalPag=totalPag;
        }
        pagAtual=0;
    }

    public void avancarPag() {
        if(pagAtual<totalPag){
            pagAtual++;
        }
    }

    public void voltarPag() {
        if(pagAtual>0){
            pagAtual--;
        }
    }

    public void irParaPag(int pagina) {
        if(pagina>=0 && pagina<=totalPag);
        pagAtual = pagina;
    }

    public int exibirPag() {
        return pagAtual;
    }

    public void exibirCapa(){
        System.out.printf("Livro: %s - %s (%d)\n", titulo, autor, totalPag);
    }
}
