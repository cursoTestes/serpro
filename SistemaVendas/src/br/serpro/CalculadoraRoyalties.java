package br.serpro;

import java.util.Date;
import java.util.List;

import br.serpro.dao.VendaRepository;
import br.serpro.modelo.Venda;


public class CalculadoraRoyalties {

	private VendaRepository vendaRepository;
	private Calculadora calculadoraComissaoVenda;
	
	
	public CalculadoraRoyalties(VendaRepository repository,
			Calculadora calculadoraComissao) {
		this.vendaRepository = repository;
		this.calculadoraComissaoVenda = calculadoraComissao;
	}

	public double calcular(Date data) {
		List<Venda> vendas = vendaRepository.obterVendasPorMesEAno(data.getYear(), data.getMonth());
		
		Double valorLiquido = 0d;
		
		for(Venda v : vendas)
		{
			valorLiquido += v.getValor() - calculadoraComissaoVenda.calcular(v.getValor());
		}
		
		Double royalties = valorLiquido * 0.2;
		
		return royalties;
	
	}



}
