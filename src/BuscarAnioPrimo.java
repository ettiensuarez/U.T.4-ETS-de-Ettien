import java.util.Scanner;

/**
 * Clase que calcula y muestra el primer año primo a partir del 2008.
 * * @author Ettien Suárez Ramírez.
 * @version 1.0
 */
public class BuscarAnioPrimo {

    /**
     * Metodo principal que arranca el programa.
     * * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        int primerAnioPrimo = 0;
        int anioActual = 2008;

        // Buscamos el año primo hasta el 2033
        while (anioActual <= 2033) {
            if (comprobarSiEsPrimo(anioActual)) {
                primerAnioPrimo = anioActual;
                // Aplicamos break para optimizar y ahorrar iteraciones
                break;
            }
            anioActual++;
        }

        mostrarResultados(primerAnioPrimo);
    }

    /**
     * Comprobamos si un número dado es primo.
     * * @param numero El número (año) que queremos comprobar
     * @return true si el número es primo, false si no lo es
     */
    public static boolean comprobarSiEsPrimo(int numero) {
        boolean esPrimo = true;
        for (int i = numero - 1; i > 1; i--) {
            if (numero % i == 0) {
                esPrimo = false;
                break; // Optimizamos saliendo del bucle en cuanto sabemos que no es primo.
            }
        }
        return esPrimo;
    }

    /**
     * Imprime por pantalla los resultados formateados y simplificados.
     * * @param anioPrimo El año primo que hemos encontrado
     */
    public static void mostrarResultados(int anioPrimo) {
        System.out.println("El primer año primo encontrado es " + anioPrimo);

        // Simplificación de condicionales.
        if (anioPrimo % 2 == 0) {
            System.out.println("que es un año par");
        }


        // Combinamos las dos expresiones condicionales en una sola con &&
        if (anioPrimo > 2008 && anioPrimo < 2033) {
            System.out.println("y está comprendido entre 2008 y 2033");
        }
    }
}