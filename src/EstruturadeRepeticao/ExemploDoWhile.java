package EstruturadeRepeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		int numero, resultado, contador = 3;
        Scanner leia = new Scanner(System.in);
        
        do {
        	
           System.out.println("\nDigite um número inteiro: ");
            numero = leia.nextInt();
           
            
        
        }while (numero >=0); { // condição limite para repetir, aqui é a trava
	}

}
}