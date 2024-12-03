package intruducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		
		//Variaveis
		String nome;
		float temperatura;
		float fahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados - Inserir o nome, temperatura
		System.out.println("Insira o seu nome:");
		nome = leia.next();
		
		System.out.println("Insira a temperatura em Celsius:");
		temperatura = leia.nextFloat();
		
		//Processamento
		fahrenheit = temperatura * 1.8f + 32;
		
		//Saida dos Dados
	    System.out.println("Bom dia, " + nome);		
		System.out.println("A temperatura em fahrenheit é: " + fahrenheit);

	}

}
