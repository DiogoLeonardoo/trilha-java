package diogo;

import java.util.Scanner;


public class mediasimples {
	public static void main (String[] args) {
		//Algoritmo que permite a leitura de notas inseridas por usuários

		Scanner scanner  = new Scanner(System.in);

		System.out.println("Digite a primeira nota");
		double nota1 = scanner.nextDouble();

		System.out.println("Digite a segunda nota");
		double nota2 = scanner.nextDouble();

		System.out.println("Digite a terceira nota");
		double nota3 = scanner.nextDouble();

		//Algoritmo que estabelece a média das notas inseridas por usuários 
		double media = (nota1 + nota2 + nota3) / 3;

			//Algoritmo de acordo com média do usuário 
		if (media > 10) {
			System.out.println("Parabéns Você foi aprovado");
		} else { 
			System.out.println("Reprovado");

		}

		 
			

	}
}
