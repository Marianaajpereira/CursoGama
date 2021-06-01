package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int alunos, turmas;
        double mediaAluno, somaTurma, somaGeral, mediaTurma, mediaGeral;

        alunos=3;
        turmas=2;
        somaTurma = 0;
        somaGeral = 0;

        for(int t=1;t<=turmas;t++){
            for(int a=1;a<=alunos;a++){
                System.out.printf("Media aluno %d (t%d): ", a, t);
                mediaAluno = entrada.nextDouble();
                somaTurma = somaTurma + mediaAluno;
            }
            mediaTurma = somaTurma/alunos;
            somaGeral = somaGeral + mediaTurma;
            somaTurma = 0;
            System.out.printf("Media Turma %d = %.1f\n", t, mediaTurma);
        }
        mediaGeral = somaGeral/turmas;
        System.out.printf("Media Geral = %.1f\n", mediaGeral);
        entrada.close();
    }
}
