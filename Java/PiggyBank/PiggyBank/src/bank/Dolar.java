package bank;

public class Dolar extends Moeda {



	Dolar(String name) {
		super(name);
	}

	@Override
	void info() {
		//imprimindo nome da moeda + valor
		System.out.println(this.type +" "+ this.valor);
		
	}

	@Override
	public double converter() {
		double exchange;
		exchange = this.valor * 5.7;
		return exchange;
	}

}
