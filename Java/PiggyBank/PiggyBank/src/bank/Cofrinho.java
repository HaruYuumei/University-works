package bank;

import java.util.ArrayList;
import java.util.Collection;

public class Cofrinho {
	
	//Coleção de moedas
	private Collection<Moeda> listaMoedas;
	
	//construtor
	public Cofrinho() {
		this.listaMoedas = new ArrayList<Moeda>();
	}
	
	
	//adicionar moedas
	public void adicionar(Moeda novaMoeda) {
		
		listaMoedas.add(novaMoeda);
		
		//debug
		System.out.println("Adicionado: "+ novaMoeda.valor);
	}
	

	//remover moedas
	public void remover(double moedaIndex) {
		
		for(Moeda moedas : listaMoedas)
		{
			if (moedas.valor == moedaIndex) {
				listaMoedas.remove(moedas);
				break;
			}
		}
	}
	
	//listar as moedas
	public void listagemMoedas() {
		
		for(Moeda moeda : listaMoedas) {
			moeda.info();
		}
	}
	
	
	//converção de moedas
	public void totalConvertido() {
		
		double valorTotal = 0;
		
		for(Moeda valorMoeda : listaMoedas) {
			valorTotal = valorTotal + valorMoeda.converter();
		}
		System.out.printf("Valor convertido: %.2f\n", valorTotal );
	}
}
