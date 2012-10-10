package br.serpro;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void testCalculaComissao_100_Reais_Retorna_5_Reais() {

		double entrada = 100;
		double esperado = 5;
		double retornado = 0;

		Calculadora c = new Calculadora();
		retornado = c.calcular(entrada);

		Assert.assertEquals(esperado, retornado);

	}

	@Test
	public void testCalculaComissao_200_Reais_Retorna_10_Reais() {

		double entrada = 200;
		double esperado = 10;
		double retornado = 0;

		Calculadora c = new Calculadora();
		retornado = c.calcular(entrada);

		Assert.assertEquals(esperado, retornado);

	}

	@Test
	public void testCalculaComissao_1000_Reais_Retorna_50_Reais() {

		double entrada = 1000;
		double esperado = 50;
		double retornado = 0;

		Calculadora c = new Calculadora();
		retornado = c.calcular(entrada);

		Assert.assertEquals(esperado, retornado);

	}

	@Test
	public void testCalculaComissao_100000_Reais_Retorna_6000_Reais() {

		double entrada = 100000;
		double esperado = 6000;
		double retornado = 0;

		Calculadora c = new Calculadora();
		retornado = c.calcular(entrada);

		Assert.assertEquals(esperado, retornado);

	}

	@Test
	public void testCalculaComissao_101_Reais_Retorna_5_Reais_5_Centavos() {

		double entrada = 101;
		double esperado = 5.05;
		double retornado = 0;

		Calculadora c = new Calculadora();
		retornado = c.calcular(entrada);

		Assert.assertEquals(esperado, retornado, 0.0001);

	}
	
	@Test
	public void testCalculaComissao_55_Reais_59_Centavos_Retorna_2_Reais_77_Centavos() {

		double entrada = 55.59;
		double esperado = 2.77;
		double retornado = 0;

		Calculadora c = new Calculadora();
		retornado = c.calcular(entrada);

		Assert.assertEquals(esperado, retornado, 0.0001);

	}

}
