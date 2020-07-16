package desafioFinanciamento;

import java.util.Scanner;

public class DesafioFinanciamento {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double v1, parcela, taxa;

		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		System.out.println(
				"Os financiamentos disponiveis do veículo são de 6x, 12x, 18x, 24x, 30x, 36x, 42x, 48x, 54x e 60x");
		System.out.println("Escolha uma dentre essas opções de financiamento");
		int financ = teclado.nextInt();
		int financiamento[] = { 6, 12, 18, 24, 30, 36, 42, 48, 54, 60 };
		boolean isOpcaoErrada = true;
		int count = 0;
		while (isOpcaoErrada) {
			for (int v : financiamento) {
				if (financ == v) {
					isOpcaoErrada = false;
					break;
				}
			}
			if(count >= 3) {
				System.out.println("vai toma no cu");
				break;
			}
			if (isOpcaoErrada) {
				System.out.println(
						"Escolha uma dentre essas opções de financiamento: 6x, 12x, 18x, 24x, 30x, 36x, 42x, 48x, 54x e 60x");
				financ = teclado.nextInt();
				count ++;
			}
			

		}
		if(count != 3) {
			if (financ == 6 || financ == 12) {
				taxa = 0;
			} else if (financ == 18 || financ == 36) {
				taxa = 0.29;
			} else if (financ == 42 || financ == 48) {
				taxa = 0.49;
			} else {
				taxa = 0.69;
			}
			if (idade <= 25 && idade <= 50) {
				System.out.println();
				v1 = (12000 / financ);
				parcela = (((1 + 0.0099 + (taxa / 100)) * 12000) - 12000) + v1;

			} else if (idade <= 35) {
				v1 = (12000 / financ);
				parcela = (((1 + 0.0079 + (taxa / 100)) * 12000) - 12000) + v1;
			} else {
				v1 = (12000 / financ);
				parcela = (((1 + 0.0119 + (taxa / 100)) * 12000) - 12000) + v1;
			}
			System.out.println("O valor da sua parcela é de: " + parcela);
			teclado.close();
			
		}
		else {
			System.out.println("vai tomar no cu dnv");
		}
			
		
		

		
	}

}