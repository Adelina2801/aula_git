package estrutura_decisao;

import java.util.Scanner;

public class Exemploifelseencadeado {

	public static void main(String[] args) {
		// Variaveis
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();
		
		
		// Processamento
		if (media >= 6) {
			System.out.println("Parabéns você foi aprovado(a)!");
			
		}else if (media >= 5){
			
		System.out.println("Participante de exame.");
		
		}
		
		if (media <= 4) {
			System.out.println("Infelismente você foi reprovado(a)!");
			
	}		
		
		
		

	}

}
