package Numeros_positivos_negativos;

import java.util.Scanner;

public class Suma_positivos_negativos {

    public static void main(String[] args) {

        int cantidad, numero, sPositivos = 0, sNegativos = 0;
        System.out.print("Numeros a introducir: ");
        Scanner sc = new Scanner(System.in);
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce un numero: ");
            numero = (new Scanner(System.in)).nextInt();
            if (numero < 0) {
                sNegativos = sNegativos + numero;
            } else {
                sPositivos = sPositivos + numero;
            }
        }

        System.out.println("Cantidad positivos: " + sPositivos);
        System.out.println("Cantidad negativos: " + sNegativos);
    }
}
