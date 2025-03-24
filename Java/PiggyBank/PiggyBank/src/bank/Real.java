package bank;

public class Real extends Moeda {

	Real(String name) {
		super(name);
	}

	@Override
	void info() {
		//imprimindo nome da moeda + valor
		System.out.println(this.type +" "+ this.valor);
	}

	@Override
	public double converter() {
		return this.valor;
	}

}
