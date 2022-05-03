package Numeros_positivos_negativos;

import java.util.Scanner;

public class Positivo_o_negativo {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        numero = teclado.nextInt();
        if (numero < 0) {
            System.out.println(numero + " es negativo");
        } else {
            System.out.println(numero + " es positivo");
        }
    }
}
