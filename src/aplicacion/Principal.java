package aplicacion;

import mates.Matematicas;
/**
 * Clase principal para calcular una aproximación al número Pi utilizando el método de Montecarlo de forma recursiva.
 * Se espera un argumento de la línea de comandos que indica la cantidad de puntos a generar para la aproximación de Pi.
 * Para ejecutar la aplicación: {@code java aplicacion.Principal <numero_pasos>}.
 */
public class Principal {
    public static void main(String[] args) {
    /**
     * Punto de entrada principal para ejecutar el programa.
     * Se espera un argumento que indica la cantidad de pasos.
     */
        if (args.length != 1) {
            System.out.println("Uso: java Principal <numero_de_pasos>");
            System.exit(1);
        }

        long pasos = Long.parseLong(args[0]);

        System.out.println("El número PI es " + Matematicas.generarNumeroPiRecursivo(pasos));
    }
}


