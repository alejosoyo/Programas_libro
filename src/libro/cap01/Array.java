package libro.cap01;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
// defi no un array de 10 enteros
        int arr[] = new int[10];
// el scanner para leer por teclado...
        Scanner scanner = new Scanner(System.in);
// leo el primer valor
        System.out.print("Ingrese un valor (0=>fi n): ");
        int v = scanner.nextInt();
        int i = 0;
// mientras v sea distinto de cero AND i sea menor que 10
        while (v != 0 && i < 10) {
// asigna v en arr[i] y luego incrementa el valor de i
            arr[i++] = v;
// leo el siguiente valor
            System.out.print("Ingrese el siguiente valor (0=>fi n): ");
            v = scanner.nextInt();
        }
// recorro el array mostrando su contenido
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }
    }
}
