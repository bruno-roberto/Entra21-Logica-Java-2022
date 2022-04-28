package br.com.entra21.exercicioNomePreço;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Faça um programa que solicite o nome e preço de custo de um produto qualquer, após, processe um aumento de 65% e informe qual será o preço de venda.");
		
		String nomeProduto;
		float precoCusto;
		float precoVenda;
		
		Scanner entrada= new Scanner(System.in);
		
		
		System.out.println("Qual o nome do produto?");
		nomeProduto = entrada.nextLine();
		
		
		System.out.println("Informe o preço de custo");
		precoCusto = entrada.nextFloat();
		
		precoVenda = precoCusto*1.65f;
		
		System.out.println("O preço de venda é " + precoVenda);
		
		
		
		
		
		
		
	}

}
