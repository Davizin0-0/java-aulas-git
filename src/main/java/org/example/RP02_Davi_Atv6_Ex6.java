package org.example;

import java.util.Scanner;

public class RP02_Davi_Atv6_Ex6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double media[] = new double[10];
        int x = 0;
        String nome[] = new String[10];

        System.out.println("Informe os nomes dos alunos: ");
        for(x = 0; x < 10; x++){
            nome[x] = leia.nextLine();
        }

        System.out.println("Informe as médias dos alunos: ");
        for(x = 0; x < 10; x++){
            media[x] = leia.nextDouble();
        }

        for(x = 0; x < 10; x++){
            if(media[x] < 6 ){
                System.out.println("Nome: "+nome[x]+" - media: "+media[x]);
            }
        }
    }
}
