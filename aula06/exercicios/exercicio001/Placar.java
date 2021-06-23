package exercicios.exercicio001;

public class Placar {
    private String time1, time2;
    private int placar1, placar2;
    
    public Placar() {
        this("Time da casa","Visitante",0,0); // chamada ao construtor da prória classe
    }

    public Placar(String time1, String time2){
        this(time1,time2,0,0); // chamada ao construtor da prória classe
    }

    public Placar(String time1, String time2, int placar1, int placar2) {
        this.time1=time1;
        this.time2=time2;
        this.placar1=placar1;
        this.placar2=placar2;
    }

    public String getPlacar() {
        return time1 + " " + placar1 + " X " + placar2 + " " + time2;
    }
}