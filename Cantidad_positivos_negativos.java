package Numeros_positivos_negativos;

import java.util.Scanner;

public class Cantidad_positivos_negativos {

    public static void main(String[] args) {

        int cantidad, numero, positivos = 0, negativos = 0;
        System.out.print("Numeros a introducir: ");
        Scanner sc = new Scanner(System.in);
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce un numero: ");
            numero = (new Scanner(System.in)).nextInt();
            if (numero < 0) {
            negativos++;
        } else {
            positivos++;
        }
        }

        System.out.println("Cantidad positivos: " + positivos);
        System.out.println("Cantidad negativos: " + negativos);
    }
}
