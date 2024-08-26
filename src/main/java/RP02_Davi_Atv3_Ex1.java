import java.util.Scanner;

public class RP02_Davi_Atv3_Ex1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double x, soma = 0, cont;

        for(cont = 0; cont < 10; cont ++) {
            System.out.println("Informe o número você deseja somar: ");
            x = leia.nextFloat();

            soma += x;
        }
        System.out.println("O somatorio é: " + soma);

    }
}
