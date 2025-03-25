package combat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//game variables
		boolean start = true;
		int gameState = 0;
		Scanner input = new Scanner(System.in);
		int userInput;
		
		while(start)
		{
			
			switch(gameState)
			{
			
				case 0:
					System.out.println();
					System.out.println("Welcome to The turn based roguelike game.");
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.printf(" 1.Start game\n 2.Option\n 3.Exit\n");
	
					try {
						
						userInput = input.nextInt();
						if(userInput < 0 || userInput > 3)
						{
							throw new RuntimeException("Choose one of the options");
						}
						gameState = userInput;
						
					}
					catch(Exception e) {
						e.getMessage();
					}
					break;
				case 1:
					
					System.out.println();
					System.out.println("Welcome, adventurer, please choose a race:");
					System.out.println("1.Human 2.Elf 3.Dwarf");
					
					
					try {
						userInput = input.nextInt();
						if(userInput < 1 || userInput > 3)
						{
							throw new RuntimeException("Choose one of the options");
						}
						
						switch(userInput) {
							case 1:
							break;
						}
						
						
					}catch(Exception a)
					{
						System.out.println(a.getMessage());
					}
					
					
						
					
						
						
					break;
				case 2:
					System.out.println("options");
					break;
				case 3:
					System.out.println("Leaving...");
					input.close();
					start = false;
					break;
			
			}
			
						
			
			
			
			
			
			
			
			
			
			
			
		}
		

		
	}

}
