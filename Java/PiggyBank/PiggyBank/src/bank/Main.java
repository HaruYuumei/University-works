package bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Cofrinho banco = new Cofrinho();
		Scanner input = new Scanner(System.in);
		double userDoubleInput;
		int userInput;
		boolean a = true;
		System.out.println("");
		System.out.println("Boas vindas ao Banco do Porquinho!");
		while(a) {	
			System.out.println("Por favor Selecione uma opção abaixo: ");
			System.out.println();
			System.out.println("1.Adicionar Moeda, 2.Remover Moeda, 3.Listar Moedas, 4.Calcular Moedas em Reais. 5.Sair");
			
			//tratando erros
			try {
				
				userInput = input.nextInt();
				
				if(userInput < 1 || userInput > 5)
				{
					throw new RuntimeException("Opção invalida");
				}
				
				switch(userInput) {
					//Adicionar moedas
					case 1:
						System.out.println();
						System.out.println("Adicionar moedas");
						System.out.println("Qual moeda gostaria de adicionar?");
						System.out.println("1.Euro, 2.Dolar, 3.Real");
					
							userInput = input.nextInt();
							if(userInput > 3 || userInput < 1)
							{
								throw new RuntimeException("Escolha Inválida");
							}
					
							switch(userInput) {
								
								case 1:
									Moeda Euro = new Euro("Euro");
									System.out.println("Qual o valor da moeda?");
									
									userDoubleInput = input.nextDouble();
									
									if(userDoubleInput <= 0)
									{
										throw new RuntimeException("Valor Inválido");
									}
									
									Euro.valor = userDoubleInput;
									banco.adicionar(Euro);
									break;
									
								case 2:
									Moeda Dolar = new Dolar("Dolar");
									System.out.println("Qual o valor da moeda?");
									userDoubleInput = input.nextDouble();
									if(userDoubleInput <= 0)
									{
										throw new RuntimeException("Valor Inválido");
									}
									Dolar.valor = userDoubleInput;
									banco.adicionar(Dolar);
									break;
									
								case 3:
									Moeda Real = new Real("Real");
									System.out.println("Qual o valor da moeda?");
									userDoubleInput = input.nextDouble();
									if(userDoubleInput <= 0)
									{
										throw new RuntimeException("Valor Inválido");
									}
									Real.valor = userDoubleInput;
									banco.adicionar(Real);
									break;
							}
						break;
						
						
					//Remover moedas
					case 2:
						System.out.println();
						System.out.println("Remover Moedas");
						System.out.println("Lista de moedas no banco:");
						banco.listagemMoedas();
						
						System.out.println("Escolha o valor da moeda a ser removida:");
						userDoubleInput = input.nextDouble();
						if(userDoubleInput < 0)
						{
							throw new RuntimeException("Valor Inválido");
						}
						System.out.println("Moeda removida");
						banco.remover(userDoubleInput);
						break;
						
						
					//Listar as moedas
					case 3:
						banco.listagemMoedas();
						break;
						
					//Calcular valor das moedas em reais
					case 4:
						banco.totalConvertido();
						break;
						
					//Sair do app
					case 5:
						System.out.println("Saindo...");
						input.close();
						a = false;
						break;
				}
				
				
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		
	}
	

}
