package br.com.entra21.exercicioNomePre�o;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Fa�a um programa que solicite o nome e pre�o de custo de um produto qualquer, ap�s, processe um aumento de 65% e informe qual ser� o pre�o de venda.");
		
		String nomeProduto;
		float precoCusto;
		float precoVenda;
		
		Scanner entrada= new Scanner(System.in);
		
		
		System.out.println("Qual o nome do produto?");
		nomeProduto = entrada.nextLine();
		
		
		System.out.println("Informe o pre�o de custo");
		precoCusto = entrada.nextFloat();
		
		precoVenda = precoCusto*1.65f;
		
		System.out.println("O pre�o de venda � " + precoVenda);
		
		
		
		
		
		
		
	}

}
