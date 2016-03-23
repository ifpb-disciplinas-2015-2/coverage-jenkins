/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.coverage;

/**
 *
 * @author Anderson Souza
 */
public class Calculadora {
    
    public int somar(Integer n1, Integer n2) throws OperacaoMatematicaException{
        if(n1 == null){
            throw new OperacaoMatematicaException("Numero invalido");
        }
        if(n2 == null){
            throw new OperacaoMatematicaException("Numero invalido");
        }
        return n1 + n2;
    }

}
