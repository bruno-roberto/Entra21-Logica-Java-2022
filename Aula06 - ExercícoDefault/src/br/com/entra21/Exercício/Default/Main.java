package br.com.entra21.Exerc�cio.Default;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exerc�cio: Escreva um menu de op��es e trate a situa��o onde o usu�rio n�o escolha uma op��o informada na lista");
		
		String opcoes;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Corinthians");
		System.out.println("Santos");
		System.out.println("Internacional");
		System.out.println("S�o Paulo");
		System.out.println("Quais destes times campe�es mundiais voc� mais gosta?");
	opcoes = entrada.nextLine();
	
	switch(opcoes) {
	
	case "Corinthians":
		System.out.println("Campe�o em 2000 e em 2012");
		break;
	case "Santos":
		System.out.println("Campe�o em 1962 e em 1963");
		break;
	case "Internacional":
		System.out.println("Campe�o em 2006");
		break;
	case "S�o Paulo":
		System.out.println("Campe�o em 1992, em 1963 e em 2005");
		break;
		default:
			System.out.println("Este time n�o � campe�o Mundial");
	}
	
	
		
	}

}
