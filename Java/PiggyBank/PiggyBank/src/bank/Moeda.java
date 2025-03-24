package bank;

public abstract class Moeda {

	//Valor da moeda
	double valor;
	
	//Nome da moeda para print no Info()
	String type;
	
	//Construtor
	Moeda(String name){
		type=name;
	}
	
	abstract void info();
	public abstract double converter();
	
}
