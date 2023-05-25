package ATV1;

import java.util.Scanner;

public class DivisiveisPorTres {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor mínimo do intervalo: ");
        int minimo = in.nextInt();
        System.out.print("Digite o valor máximo do intervalo: ");
        int maximo = in.nextInt();

        int contador = 0;
        for (int i = minimo; i <= maximo; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }
        System.out.println("Quantidade de números divisíveis por 3: " + contador);
    }
}