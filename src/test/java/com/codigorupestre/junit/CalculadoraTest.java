package com.codigorupestre.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	/**
	 * 
	 * Feature: La suma de dos numeros
	 * 
	 * Scenario: tenemos un valor1 y un valor2 y se deben 
	 * de sumar
	 * 
	 * Given: valor1 y valor2
	 * When: estos dos valores se sumen
	 * Then: Debe de dar el resultado de la suma
	 */
	@Test
	public void sumarTest() {
	  Calculadora calculadora = new Calculadora();
	  long resultado = calculadora.sumar(10, 5);
	  
	  assertEquals(15, resultado);
	}
	
	
	/**
	 * 
	 * Feature: La multiplicacion de dos numeros
	 * 
	 * Scenario: tenemos un valor1 y un valor2 y se deben 
	 * de multiplicar
	 * 
	 * Given: valor1 y valor2
	 * When: estos dos valores se multipliquen
	 * Then: Debe de dar el resultado de la multiplicacion
	 */
	@Test
	public void multiplicarTest() {
		Calculadora calculadora = new Calculadora();
		long resultado = calculadora.multiplicar(10, 2);
		
		assertEquals(20, resultado);
	}
	
	
	/**
	 * 
	 * Feature: La resta de dos numeros
	 * 
	 * Scenario: tenemos un valor1 y un valor2 y se deben 
	 * de restar
	 * 
	 * Given: valor1 y valor2
	 * When: estos dos valores se restar
	 * Then: Debe de dar el resultado de la resta
	 */
	@Test
	public void restarTest() {
		Calculadora calculadora = new Calculadora();
		
		long resultado = calculadora.restar(20, 5);
		
		assertEquals(15, resultado);
	}
	
	@Test
	public void dividirTest() {
		Calculadora calculadora = new Calculadora();
		
		long resultado = calculadora.dividir(10, 2);
		
		assertEquals(5, resultado);
	}
	

}
