package libro.cap01;

import java.util.Scanner;

public class Switch{ 

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un dia de la semana (numero): ");
        int v = entrada.nextInt();
        String dia;

        switch (v) {
            case 1:
                dia = "Lunes";

            case 2:
                dia = "Martes";

            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Dia incorrecto... El valor debe ser entre 1 y 7.";
        }
        System.out.println(dia);
    }
}
