package br.scrumban;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.dbunit.DBTestCase;
import org.junit.Test;

import br.scrumban.dao.VendaDAO;
import br.scrumban.dao.VendedorDAO;
import br.scrumban.infra.BaseDBTest;

public class VendaDAOTest extends BaseDBTest {

	@Test
	public void testTotal_Vendas_Vendedor_2_Em_2011_Retorno_100() {
		// Arrange

		Vendedor vendedor = new Vendedor();
		int entradaIdVendedor = 2;
		vendedor.setId(entradaIdVendedor);
		int entradaAno = 2011;
		double resultado;
		double esperado = 100.0;
		
		// act
		VendaDAO.setEntityManager(emf.createEntityManager());
		resultado = VendaDAO.buscarTotalDeVendasPorVendedorEAno(vendedor, entradaAno);
		
		// asserts
		Assert.assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void testTotal_Vendas_Vendedor_3_Em_2011_Retorno_0() {
		// Arrange

		Vendedor vendedor = new Vendedor();
		int entradaIdVendedor = 3;
		vendedor.setId(entradaIdVendedor);
		int entradaAno = 2011;
		double resultado;
		double esperado = 0;
		
		// act
		VendaDAO.setEntityManager(emf.createEntityManager());
		resultado = VendaDAO.buscarTotalDeVendasPorVendedorEAno(vendedor, entradaAno);
		
		// asserts
		Assert.assertEquals(esperado, resultado);
		
	}	
	
	@Test
	public void testTotal_Vendas_Vendedor_5_Em_2012_Retorno_200() {
		// Arrange

		Vendedor vendedor = new Vendedor();
		int entradaIdVendedor = 5;
		vendedor.setId(entradaIdVendedor);
		int entradaAno = 2012;
		double resultado;
		double esperado = 200;
		
		// act
		VendaDAO.setEntityManager(emf.createEntityManager());
		resultado = VendaDAO.buscarTotalDeVendasPorVendedorEAno(vendedor, entradaAno);
		
		// asserts
		Assert.assertEquals(esperado, resultado);
		
	}
	@Test
	public void testTotal_Vendas_Vendedor_6_Em_2012_Retorno_100() {
		// Arrange

		Vendedor vendedor = new Vendedor();
		int entradaIdVendedor = 6;
		vendedor.setId(entradaIdVendedor);
		int entradaAno = 2012;
		double resultado;
		double esperado = 100;
		
		// act
		VendaDAO.setEntityManager(emf.createEntityManager());
		resultado = VendaDAO.buscarTotalDeVendasPorVendedorEAno(vendedor, entradaAno);
		
		// asserts
		Assert.assertEquals(esperado, resultado);
		
	}	


}
