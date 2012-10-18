package br.scrumban;

import junit.framework.Assert;

import org.fluentlenium.adapter.FluentTest;
import org.junit.Test;

public class CadastroDeUmaVendaInterfaceTest extends FluentTest {

	@Test
	public void teste_cadastra_uma_venda_Sem_preencher_campos_obrigatorios() {
		goTo("http://localhost:58034/Venda/Add");
		fill("#Vendedor").with("");
		fill("#DataVenda").with("");
		fill("#Valor").with("");
		
		submit("input[type=\"submit\"]");
		
		Assert.assertEquals("O campo Id Vendedor � obrigat�rio.", findFirst("#validacaoVendedor").getText()); 
		Assert.assertEquals("O campo Valor � obrigat�rio.", findFirst("#validacaoValor").getText()); 
		Assert.assertEquals("O campo Data Venda � obrigat�rio.", findFirst("#validacaoDataVenda").getText());
			
	}
	
	@Test
	public void teste_cadastra_uma_venda_com_valor_negativo() {
		goTo("http://localhost:58034/Venda/Add");
		fill("#Vendedor").with("2");
		fill("#DataVenda").with("11/10/2012");
		fill("#Valor").with("-1");
		
		submit("input[type=\"submit\"]");
		
		 
		Assert.assertEquals("O campo Valor n�o pode ser negativo.", findFirst("#validacaoValor").getText()); 
		
			
	}
	
	@Test
	public void teste_cadastra_uma_venda_com_vendedor_inexistente() {
		goTo("http://localhost:58034/Venda/Add");
		fill("#Vendedor").with("12");
		fill("#DataVenda").with("11/10/2012");
		fill("#Valor").with("1");
		
		submit("input[type=\"submit\"]");
		
		 
		Assert.assertEquals("O campo Id Vendedor � inexistente.", findFirst("#validacaoVendedor").getText()); 
		
			
	}
	
	@Test
	public void teste_cadastra_uma_venda_com_sucesso() {
		goTo("http://localhost:58034/Venda/Add");
		fill("#Vendedor").with("1");
		fill("#DataVenda").with("11/10/2012");
		fill("#Valor").with("100");
		
		submit("input[type=\"submit\"]");
		
		 
		Assert.assertEquals("O cadastro realizado com sucesso.", findFirst("#respostaSucesso").getText()); 
		
			
	}
}
