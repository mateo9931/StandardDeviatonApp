package edu.escuelaing.arsw.ASE.app;

import edu.escuelaing.arsw.app.calculateStandardDeviation;
import edu.escuelaing.arsw.util.LinkedList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Unit test for StandardDeviationApp.
 */
public class StandardDeviationAppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public StandardDeviationAppTest(String testName )
    {
        super( testName );
    }

    /**
     * Test deviation standard answers
     * @throws IOException
     */
    public void testdeviationestandar1() throws IOException {
        Double resultadoEsperado=625.6339806770231;
        String ruta = new String("./src/main/resources/prueba1");
        LinkedList<Double> array = calculateStandardDeviation.muestraContenido(ruta);
        Double resusltadoObtenido= calculateStandardDeviation.deviationStandard(array);
        assertEquals(resultadoEsperado,resusltadoObtenido);
    }

    /**
     * Test deviation estandar answers and verify empty strings
     * @throws IOException
     */

    public void testdeviationestandar2() throws IOException {
        Double resultadoEsperado=664.5002717163561;
        String ruta = new String("./src/main/resources/prueba2");
        LinkedList<Double> array = calculateStandardDeviation.muestraContenido(ruta);
        Double resusltadoObtenido= calculateStandardDeviation.deviationStandard(array);
        assertEquals(resultadoEsperado,resusltadoObtenido);
    }
    /**
     * Test deviation estandar answers and verify letters strings
     * @throws IOException
     */

    public void testdeviationestandar3() throws IOException {
        Double resultadoEsperado=597.142705485285;
        String ruta = new String("./src/main/resources/prueba3");
        LinkedList<Double> array = calculateStandardDeviation.muestraContenido(ruta);
        Double resusltadoObtenido= calculateStandardDeviation.deviationStandard(array);
        assertEquals(resultadoEsperado,resusltadoObtenido);
    }

    /**
     * Test deviation standard file not found
     * @throws IOException
     */
    public void testfilenotfound() throws IOException {
        boolean thrown = false;
        try {
            String ruta = new String("./src/main/resources/prueba1noexiste");
            LinkedList<Double> array = calculateStandardDeviation.muestraContenido(ruta);
            Double resusltadoObtenido= calculateStandardDeviation.deviationStandard(array);
        } catch (FileNotFoundException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    /**
     *Test deviation estandard test file found
     * @throws IOException
     */
    public void testfilefound() throws IOException {
        boolean thrown = true;
        try {
            String ruta = new String("./src/main/resources/prueba1");
            LinkedList<Double> array = calculateStandardDeviation.muestraContenido(ruta);
            Double resusltadoObtenido= calculateStandardDeviation.deviationStandard(array);
        } catch (FileNotFoundException e) {
            thrown = false;
        }
        assertTrue(thrown);
    }
    /**
     * Test mean  answers
     * @throws IOException
     */
    public void testmedia1() throws IOException {
        Double resultadoEsperado=660.8888888888889;
        String ruta = new String("./src/main/resources/prueba2");
        LinkedList<Double> array = calculateStandardDeviation.muestraContenido(ruta);
        Double resusltadoObtenido= calculateStandardDeviation.mean(array);
        assertEquals(resultadoEsperado,resusltadoObtenido);
    }
    /**
     * Test mean  answers
     * @throws IOException
     */
    public void testmedia2() throws IOException {
        Double resultadoEsperado=550.6;
        String ruta = new String("./src/main/resources/prueba4");
        LinkedList<Double> array = calculateStandardDeviation.muestraContenido(ruta);
        Double resusltadoObtenido= calculateStandardDeviation.mean(array);
        assertEquals(resultadoEsperado,resusltadoObtenido);
    }
    /**
     * Test mean  answers
     * @throws IOException
     */
    public void testmedia3() throws IOException {
        Double resultadoEsperado=60.32000000000001;
        String ruta = new String("./src/main/resources/prueba5");
        LinkedList<Double> array = calculateStandardDeviation.muestraContenido(ruta);
        Double resusltadoObtenido= calculateStandardDeviation.mean(array);
        assertEquals(resultadoEsperado,resusltadoObtenido);
    }
    /**
     * Test deviation standard answers
     * @throws IOException
     */
    public void testdeviationestandard4() throws IOException {
        Double resultadoEsperado=62.25583060601187;
        String ruta = new String("./src/main/resources/prueba5");
        LinkedList<Double> array = calculateStandardDeviation.muestraContenido(ruta);
        Double resusltadoObtenido= calculateStandardDeviation.deviationStandard(array);
        assertEquals(resultadoEsperado,resusltadoObtenido);
    }



}
