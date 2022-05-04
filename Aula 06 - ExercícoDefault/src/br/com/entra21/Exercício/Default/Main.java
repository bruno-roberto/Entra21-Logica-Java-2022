package br.com.entra21.Exercício.Default;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exercício: Escreva um menu de opções e trate a situação onde o usuário não escolha uma opção informada na lista");
		
		String opcoes;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Corinthians");
		System.out.println("Santos");
		System.out.println("Internacional");
		System.out.println("São Paulo");
		System.out.println("Quais destes times campeões mundiais você mais gosta?");
	opcoes = entrada.nextLine();
	
	switch(opcoes) {
	
	case "Corinthians":
		System.out.println("Campeão em 2000 e em 2012");
		break;
	case "Santos":
		System.out.println("Campeão em 1962 e em 1963");
		break;
	case "Internacional":
		System.out.println("Campeão em 2006");
		break;
	case "São Paulo":
		System.out.println("Campeão em 1992, em 1963 e em 2005");
		break;
		default:
			System.out.println("Este time não é campeão Mundial");
	}
	
	
		
	}

}
