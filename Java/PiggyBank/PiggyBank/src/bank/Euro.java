package bank;

public class Euro extends Moeda {
	

	
	Euro(String name) {
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
		exchange = this.valor * 6.1;
		return exchange;
		
	}

}
