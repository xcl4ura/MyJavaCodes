package Vetores;
import java.util.Scanner;

public class ChamadaAlunos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String aluno[] = new String[10];

        for (int i = 0; i < aluno.length; i++) {

            System.out.println("Informe o nome do aluno");
            aluno[i] = sc.next();
        }

        System.out.println("LISTA DE CHAMADA");

        for (int i = 0; i < aluno.length ; i++) {

            System.out.println(aluno[i]);

        }
    }
}