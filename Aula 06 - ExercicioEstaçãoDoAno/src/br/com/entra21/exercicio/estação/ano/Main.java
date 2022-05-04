package br.com.entra21.exercicio.estação.ano;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Qual sua estação do ano favorita?");
		
		System.out.println("1 = Primavera");
		System.out.println("2 = Outono");
		System.out.println("3 = Inverno");
		System.out.println("4 = Verão");
		
		Scanner entrada = new Scanner (System.in);
		
		byte opcao=4;
		
	System.out.println("Qual sua estação do ano preferida ?");
	opcao=entrada.nextByte();
	
	switch (opcao) {
	case 1:
		System.out.println("Primavera - Estação das flores");
		break;
	case 2:
		System.out.println("Outono - Quase frio");
		break;
	case 3:
		System.out.println("Inverno - Olha a neve Urubici");
		break;
	case 4:
		System.out.println("Verão - Ah uma praia");
		break;
		
		
	
		
		
	}
	
		
		
		
		
		
		
		
		
		

	}

}
