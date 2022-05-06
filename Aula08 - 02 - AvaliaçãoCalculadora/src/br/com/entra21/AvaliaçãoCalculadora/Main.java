package br.com.entra21.AvaliaçãoCalculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String opcaoCalculo;
		Scanner entrada = new Scanner(System.in);
		float numeroA, numeroB;
		
		System.out.println("Bem vindo ao programa!!!");
		System.out.println("---------------------------");
		System.out.println("Você escolheu a opção para calcular");
		System.out.println("Digite o primeiro número:");
		numeroA = entrada.nextFloat();
		System.out.println("Digite o segundo número:");
		numeroB = entrada.nextFloat();
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("Agora que você informou os números, digite o calculo desejado");
		
		System.out.println("--------------------------");
		System.out.println(" 1 | Soma");
		System.out.println(" 2 | Subtração");
		System.out.println(" 3 | Multiplicação");
		System.out.println(" 4 | Divisão");
		System.out.println(" 0 | Para sair...");
		System.out.println("--------------------------");
		opcaoCalculo = entrada.next();
		
		switch (opcaoCalculo.toLowerCase()) {
		case "1":
		case "Soma":
			System.out.println("O resultado da soma entre "+numeroA+" e "+numeroB+" é "+somar(numeroA,numeroB));
			break;
		case "2" :
		case "Subtração":
			System.out.println("O resultado da subtração entre "+numeroA+" e "+numeroB+" é "+subtrair(numeroA, numeroB));
		break;
		case "3" :
		case "Multiplicação":
			System.out.println("O resultado da multiplicação entre "+numeroA+" e "+numeroB+" é "+multiplicar(numeroA, numeroB));
		break;
		case "4" :
		case "Divisão":
			System.out.println("O resultado da divisão entre "+numeroA+" e "+numeroB+" é "+dividir(numeroA, numeroB));
		break;
		case "0":
		case "Sair":
			System.out.println("Encerrando programa! Obrigado pela visita");
		default:
			System.out.println("Digite uma opção válida");}}
			
			
			public static float somar(float numeroA, float numeroB) {
				return numeroA + numeroB;
			}

			public static float subtrair(float numeroA, float numeroB) {
				return numeroA - numeroB;
			}

			public static float multiplicar(float numeroA, float numeroB) {
				return numeroA * numeroB;
			}

			public static float dividir(float numeroA, float numeroB) {
				return numeroA / numeroB;

			}

	}

