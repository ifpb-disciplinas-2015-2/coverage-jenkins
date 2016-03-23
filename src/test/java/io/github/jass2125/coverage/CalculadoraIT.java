/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.coverage;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Anderson Souza
 */
public class CalculadoraIT {

    private Calculadora calc;
    private Integer n1;
    private Integer n2;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        calc = new Calculadora();
        n1 = null;
        n2 = new Integer(10);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of somar method, of class Calculadora.
     * @throws io.github.jass2125.coverage.OperacaoMatematicaException
     */
//    @Test(expected = OperacaoMatematicaException.class)
//    public void testSomarValorNulo() throws OperacaoMatematicaException {
//        calc.somar(n1, n2);
//        n1 = new Integer(20);
//        n2 = null;
//        calc.somar(n1, n2);
//    }
    
    @Test
    public void Somar() throws OperacaoMatematicaException{
        n1 = new Integer(8);
        int result = calc.somar(n1, n2);
        assertEquals(result, 18);
        
        
    }

}
