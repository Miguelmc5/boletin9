package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Calculo {

    Scanner sc = new Scanner(System.in);
    private int num;
    private int contador;
    private int positivo;
    private int negativo;
    private int cero;

    public void calcular() {

        while (contador < 10) {
            System.out.println("Dame números");
            num = sc.nextInt();
            if (num > 0) {
                positivo++;
            } else if (num < 0) {
                negativo++;
            } else {
                cero++;
            }
            contador++;
        }
        System.out.println("Los positivos son " + positivo);
        System.out.println("Los negativos son " + negativo);
        System.out.println("Los ceros son " + cero);
    }
}
