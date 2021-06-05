package edu.escuelaing.arsw.app;

import edu.escuelaing.arsw.util.LinkedList;

import java.io.*;
import static edu.escuelaing.arsw.app.calculateStandardDeviation.deviationStandard;
import static edu.escuelaing.arsw.app.calculateStandardDeviation.mean;

/**
 *Esta es la clase main de "standard deviation app"
 * @author Mateo Quintero
 *
 */
public class StandardDeviationApp
{
    public static void main( String[] args ) throws IOException {
        String nombreArchivo = args[0];
        LinkedList<Double> array = (calculateStandardDeviation.muestraContenido(nombreArchivo));
        System.out.println("El valor de la desviacion estandar es: "+ deviationStandard(array));
        System.out.println("El valor de la media es : "+mean(array));
    }

}

