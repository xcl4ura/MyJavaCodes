package Vetores;

import java.util.Scanner;

public class BandaEMusicas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeBanda;
        String musica[] = new String[3];

        System.out.println("Informe o nome de uma banda: ");
        nomeBanda = sc.nextLine();

        for (int i = 0; i < musica.length; i++) {
            System.out.println("Digite uma música da banda ");
            musica[i] = sc.nextLine();
        }

        System.out.println(nomeBanda);
        for (int i = 0; i < musica.length; i++) {
            System.out.println(musica[i]);
        }


    }
}