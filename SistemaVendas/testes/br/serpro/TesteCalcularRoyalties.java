package br.serpro;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.Mockito;

import br.serpro.dao.VendaRepository;
import br.serpro.modelo.Venda;

public class TesteCalcularRoyalties {

	@Test
	public void testCalculaRoyalties_Mes_Qualquer_1_Venda_100_Reais_Retorna_20_Reais() {
		
		double entrada = 100;
		double esperado = 20;
		Date dataQualquer = new Date();
		
		VendaRepository mockVendaRepo = mock(VendaRepository.class);
		Calculadora mockCalculadora = mock(Calculadora.class);
		
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		Venda venda = new Venda(1, 1, 1, 1, entrada);
		vendas.add(venda);
		
		when(mockVendaRepo.obterVendasPorMesEAno(any(Integer.class), any(Integer.class))).thenReturn(vendas);
		when(mockCalculadora.calcular(any(Double.class))).thenReturn(0.0);
		
		CalculadoraRoyalties c = new CalculadoraRoyalties(mockVendaRepo, mockCalculadora);
		double retornado = c.calcular(dataQualquer);

		Assert.assertEquals(esperado, retornado, 0.0001);

	}

	

	@Test
	public void testCalculaRoyalties_Mes_Qualquer_1_Venda_200_Reais_Retorna_40_Reais() {
		//arrange
		double entrada = 200;
		double esperado = 40;
		Date dataQualquer = new Date();
		
		VendaRepository mockVendaRepo = mock(VendaRepository.class);
		Calculadora mockCalculadora = mock(Calculadora.class);
		
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		Venda venda = new Venda(1, 1, 1, 1, entrada);
		vendas.add(venda);
		
		when(mockVendaRepo.obterVendasPorMesEAno(any(Integer.class), any(Integer.class))).thenReturn(vendas);
		when(mockCalculadora.calcular(any(Double.class))).thenReturn(0.0);
		
		//act
		CalculadoraRoyalties c = new CalculadoraRoyalties(mockVendaRepo, mockCalculadora);
		double retornado = c.calcular(dataQualquer);

		
		
		//assert
		Assert.assertEquals(esperado, retornado, 0.0001);
		
		Mockito.verify(mockVendaRepo).obterVendasPorMesEAno(any(Integer.class), any(Integer.class));
		Mockito.verify(mockCalculadora).calcular(any(Double.class));
		
		
	}



}
