package bank;

import java.util.ArrayList;
import java.util.Collection;

public class Cofrinho {
	
	private Collection<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<Moeda>();
	}
	
	public void adicionar(Moeda novaMoeda) {
		
		listaMoedas.add(novaMoeda);
		
		//debug
		System.out.println("Adicionado: "+ novaMoeda.valor);
	}
	

	
	public void remover(double moedaIndex) {
		
		for(Moeda moedas : listaMoedas)
		{
			if (moedas.valor == moedaIndex) {
				listaMoedas.remove(moedas);
				break;
			}
		}
	}
	
	public void listagemMoedas() {
		
		for(Moeda moeda : listaMoedas) {
			moeda.info();
		}
	}
	
	public void totalConvertido() {
		
		double valorTotal = 0;
		
		for(Moeda valorMoeda : listaMoedas) {
			valorTotal = valorTotal + valorMoeda.converter();
		}
		System.out.printf("Valor convertido: %.2f\n", valorTotal );
	}
}
