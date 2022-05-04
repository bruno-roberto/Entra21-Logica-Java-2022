package br.com.entra21.exercicio.cor.favorita;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Dentre as opções escolha sua cor favorita:");

Scanner entrada = new Scanner (System.in);

System.out.println("Verde");
System.out.println("Azul");
System.out.println("Amarelo");
System.out.println("Vermelho");

String opcoes;

System.out.println("Qual destas é sua cor favorita ?");
opcoes=entrada.nextLine();

switch (opcoes) {

case "verde":
	System.out.println("Cor da esperança");
	break;
case "azul":
	System.out.println("Cor do céu");
	break;
case "amarelo":
	System.out.println("Cor de ouro");
	break;
case "vermelho":
	System.out.println("Cor Sangue");
	break;
	
	

}




	}

}
