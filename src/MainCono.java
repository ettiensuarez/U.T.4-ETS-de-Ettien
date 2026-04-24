import java.util.Scanner;

/**
 * Clase principal para probar el funcionamiento de la clase Cono.
 * * @author Ettien Suárez Ramírez
 * @version 1.0
 */
public class MainCono {

    /**
     * Metodo principal de la aplicación.
     * * @param args Argumentos de terminal
     * @throws Exception Puede lanzar excepción si falla la entrada, aunque está controlada
     */
    public static void main(String[] args) throws Exception {
        // Comprobamos siempre el tamaño de los arrays
        Cono[] conos = new Cono[4];

        System.out.println("Vamos a crear 4 conos.");

        for (int i = 0; i < conos.length; i++) {
            System.out.println("\n--- Datos para el Cono " + (i + 1) + " ---");
            float radio = solicitarValorSeguro("Introduce el radio de la base: ");
            float altura = solicitarValorSeguro("Introduce la altura: ");

            conos[i] = new Cono(radio, altura);

            System.out.println("El área de la base es: " + conos[i].calcularAreaBase());
            System.out.println("El volumen del cono es: " + conos[i].calcularVolumen());
        }

        // Ordenamos los conos de mayor a menor por su volumen
        for (int i = 0; i < conos.length - 1; i++) {
            for (int j = 0; j < conos.length - 1 - i; j++) {
                if (conos[j].calcularVolumen() < conos[j + 1].calcularVolumen()) {
                    Cono temporal = conos[j];
                    conos[j] = conos[j + 1];
                    conos[j + 1] = temporal;
                }
            }
        }

        System.out.println("\n--- Conos ordenados de MAYOR a MENOR volumen ---");
        for (int i = 0; i < conos.length; i++) {
            System.out.println("Cono " + (i+1) + " - Volumen: " + conos[i].calcularVolumen());
        }
    }

    /**
     * Metodo a prueba de balas para solicitar un valor numérico al usuario.
     * Evita que el programa se cuelgue si el usuario introduce una letra.
     * * @param mensaje El texto que se muestra al usuario para pedir el dato
     * @return El valor float introducido correctamente
     */
    public static float solicitarValorSeguro(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        float valor = 0;
        boolean datoCorrecto = false;

        while (!datoCorrecto) {
            try {
                System.out.print(mensaje);
                valor = Float.parseFloat(scanner.nextLine());
                if (valor > 0) {
                    datoCorrecto = true;
                } else {
                    System.out.println("Error: El valor debe ser positivo.");
                }
            } catch (Exception e) {
                System.out.println("Error de entrada: Por favor, introduce un número válido, no letras.");
            }
        }
        return valor;
    }
}