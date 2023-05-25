package ATV1;

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = in.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = in.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numero3 = in.nextInt();

        if (numero1 <= numero2 && numero1 <= numero3) {
            if (numero2 <= numero3) {
                System.out.println(numero1 + ", " + numero2 + ", " + numero3);
            } else {
                System.out.println(numero1 + ", " + numero3 + ", " + numero2);
            }
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            if (numero1 <= numero3) {
                System.out.println(numero2 + ", " + numero1 + ", " + numero3);
            } else {
                System.out.println(numero2 + ", " + numero3 + ", " + numero1);
            }
        } else {
            if (numero1 <= numero2) {
                System.out.println(numero3 + ", " + numero1 + ", " + numero2);
            } else {
                System.out.println(numero3 + ", " + numero2 + ", " + numero1);
            }
        }
    }
}