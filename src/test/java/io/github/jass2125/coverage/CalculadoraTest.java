/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.coverage;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Anderson Souza
 */
public class CalculadoraTest {

    private Calculadora calc;
    private Integer n1;
    private Integer n2;

    @Before
    public void setUp() {
        calc = new Calculadora();
    }

    /**
     * Test of somar method, of class Calculadora.
     *
     * @throws io.github.jass2125.coverage.OperacaoMatematicaException
     */
    @Test(expected = OperacaoMatematicaException.class)
    public void testSomarPrimeiroValorNulo() throws OperacaoMatematicaException {
        n1 = null;
        n2 = new Integer(10);
        calc.somar(n1, n2);
    }
    @Test(expected = OperacaoMatematicaException.class)
    public void testSomarSegundoValorNulo() throws OperacaoMatematicaException {
        n1 = null;
        n2 = new Integer(10);
        calc.somar(n2, n1);
    }

    @Test
    public void Somar() throws OperacaoMatematicaException {
        n1 = new Integer(8);
        n2 = new Integer(2);
        int result = calc.somar(n1, n2);
        assertEquals(10, result);

    }

}
