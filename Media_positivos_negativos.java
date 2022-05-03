package Numeros_positivos_negativos;

import java.util.Scanner;

public class Media_positivos_negativos {

    public static void main(String[] args) {

        int cantidad, numero, positivos = 0, negativos = 0, sPositivos = 0, sNegativos = 0, mPositivos = 0, mNegativos = 0;
        System.out.print("Numeros a introducir: ");
        Scanner sc = new Scanner(System.in);
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce un numero: ");
            numero = (new Scanner(System.in)).nextInt();
            if (numero < 0) {
                sNegativos = sNegativos + numero;
                negativos++;
            } else {
                sPositivos = sPositivos + numero;
                positivos++;
            }
        }
        mPositivos = sPositivos / positivos;
        mNegativos = sNegativos / negativos;

        System.out.println("Cantidad positivos: " + mPositivos);
        System.out.println("Cantidad negativos: " + mNegativos);
    }
}
