package edu.escuelaing.arsw.app;
import edu.escuelaing.arsw.util.LinkedList;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.sqrt;


/**
 * Clase Encargada de calcular la desviacion estandar y la media  de un set de archivos de n numeros
 * @author Mateo Quintero
 */
public class calculateStandardDeviation  {
    
     public static LinkedList<Double> muestraContenido(String archivo) throws IOException {
        LinkedList<String> array = new LinkedList<>();
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null && !cadena.isEmpty()) {
            if (cadena.startsWith("1") || cadena.startsWith("2") || cadena.startsWith("3") || cadena.startsWith("4") || cadena.startsWith("5") || cadena.startsWith("6") || cadena.startsWith("7") || cadena.startsWith("8") || cadena.startsWith("9") || cadena.startsWith("0")) {
                array.add(cadena);
            }
        }
        b.close();

        LinkedList<Double> arraydouble =stringtodoublearray(array);
        return arraydouble;



    }

    /**
     *
     * @param arraydouble array para calcular la desviacion estandar
     * @return
     */
    public static Double deviationStandard(LinkedList<Double> arraydouble) {
         LinkedList<Double> arrayresultado = new LinkedList<>();
         Double xavg = mean(arraydouble);
         for (Double i : arraydouble) {
             arrayresultado.add(Math.pow(i - xavg, 2));
        }
        return sqrt((sumararray(arrayresultado) / (arraydouble.size() - 1)));

    }

    /**
     * Metodo para obtener un LinkedList de doubles a partir de un LinkedList de String
     * @param array Linked List String
     * @return Linked List Double
     */
    public static LinkedList<Double> stringtodoublearray(LinkedList<String> array){
        LinkedList<Double> arraydouble = new LinkedList<>();
        for (String dato : array) {
            arraydouble.add(Double.parseDouble(dato));
        }
        return arraydouble;
    }

    /**
     * Metodo para obtener la suma de los elementos de un array
     * @param arraystring Linked list a la cual se le van a sumar cada uno de los valores
     * @return Double con la suma de los elementos de linked list
     */
    public static Double sumararray(LinkedList<Double> arraystring) {
        double contador=0.0;
        for (Double dato : arraystring) {
            contador +=dato;
        }
        return contador;
    }

    /**
     * Metodo para calcular la Media de un set de n numeros tomados de un archivo
     * @param array array al cual se desea calcular la media
     * @return double media del array
     */
    public static Double mean(LinkedList<Double> array){
       Double media = sumararray(array) /(double) array.size();
        return media;
    }


}


