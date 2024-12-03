package estrutura_decisao;

import java.util.Scanner;

public class Exemploif {

	public static void main(String[] args) {
		// Variaveis
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();
		
		
		// Processamento
		if (media >= 6) {
			System.out.println("Parabéns você foi aparovado(a)!");
			
			
		}

	}

}
