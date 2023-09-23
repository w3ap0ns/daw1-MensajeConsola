import java.util.Scanner;

public class app {

    public static void main(String[] arg){

        /*En el ejercicio 1 (MensajeConsola) se pedirá al usuario el mensaje
        a mostrar (usa un color diferente para mostrar el mensaje).*/

        Scanner readln = new Scanner(System.in);

        // Variables
        final String RESET = "\u001b[0m";
        final String NEGRO = "\u001b[30m";
        final String ROJO = "\u001b[31m";
        final String VERDE = "\u001b[32m";
        final String AMARILLO = "\u001b[33m";
        final String AZUL = "\u001b[34m";
        final String PURPURA = "\u001b[35m";
        final String CIELO = "\u001b[36m";
        final String BLANCO = "\u001b[37m";

        String mensaje = "";

        // Pedir mensaje al usuario
        System.out.printf("Por favor introduce un mensaje para mostrar en colores:...\n");
        mensaje = readln.nextLine();

        // Output
        System.out.printf("%s%s%s\n", NEGRO, mensaje,RESET);
        System.out.printf("%s%s%s\n", ROJO, mensaje,RESET);
        System.out.printf("%s%s%s\n", VERDE, mensaje,RESET);
        System.out.printf("%s%s%s\n", AMARILLO, mensaje,RESET);
        System.out.printf("%s%s%s\n", AZUL, mensaje,RESET);
        System.out.printf("%s%s%s\n", PURPURA, mensaje,RESET);
        System.out.printf("%s%s%s\n", CIELO, mensaje,RESET);
        System.out.printf("%s%s%s\n", BLANCO, mensaje,RESET);




    } // public static void main(String[] arg)

} // public class app
