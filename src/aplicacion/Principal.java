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
        System.out.println("El número PI es " + Matematicas.generarNumeroPiRecursivo(Integer.parseInt(args[0])));
    }
}

