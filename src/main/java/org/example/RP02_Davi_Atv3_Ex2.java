package org.example;

import java.util.Scanner;

public class RP02_Davi_Atv3_Ex2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cont, x, res;

        System.out.println("Informe o número que deseja obter a tabuada da multiplicação: ");
        x = leia.nextInt();

        System.out.println(" ");
        System.out.println("TABUADA DO "+x);
        for(cont = 1; cont <= 10; cont ++){
            res = cont * x;
            System.out.println(cont+" x "+x+" = "+res);

        }

    }
}
