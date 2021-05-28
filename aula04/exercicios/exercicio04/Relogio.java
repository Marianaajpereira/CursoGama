package exercicios.exercicio04;

public class Relogio {
    // atributos
    private int hora, min, seg;

    public Relogio(int hora, int min, int seg) {
        setHora(hora);
        setMin(min);
        setSeg(seg);
    }

    public void setHora(int novaHora) {
        if(novaHora>=0 && novaHora<=23) {
            hora = novaHora;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setMin(int novoMin) {
        if(novoMin>=0 && novoMin<=60) {
            min = novoMin;
        }
    }

    public int getMin() {
        return min;
    }
    
    public void setSeg(int novoSeg) {
        if(novoSeg>=0 && novoSeg<=60) {
            seg = novoSeg;
        }
    }

    public int getSeg() {
        return seg;
    }
    
    public String horaAtual(){
        return hora + ":" + min + ":" + seg;
    }
}
