package br.com.entra21.Avalia��oCalculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String opcaoCalculo;
		Scanner entrada = new Scanner(System.in);
		float numeroA, numeroB;
		
		System.out.println("Bem vindo ao programa!!!");
		System.out.println("---------------------------");
		System.out.println("Voc� escolheu a op��o para calcular");
		System.out.println("Digite o primeiro n�mero:");
		numeroA = entrada.nextFloat();
		System.out.println("Digite o segundo n�mero:");
		numeroB = entrada.nextFloat();
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("Agora que voc� informou os n�meros, digite o calculo desejado");
		
		System.out.println("--------------------------");
		System.out.println(" 1 | Soma");
		System.out.println(" 2 | Subtra��o");
		System.out.println(" 3 | Multiplica��o");
		System.out.println(" 4 | Divis�o");
		System.out.println(" 0 | Para sair...");
		System.out.println("--------------------------");
		opcaoCalculo = entrada.next();
		
		switch (opcaoCalculo.toLowerCase()) {
		case "1":
		case "Soma":
			System.out.println("O resultado da soma entre "+numeroA+" e "+numeroB+" � "+somar(numeroA,numeroB));
			break;
		case "2" :
		case "Subtra��o":
			System.out.println("O resultado da subtra��o entre "+numeroA+" e "+numeroB+" � "+subtrair(numeroA, numeroB));
		break;
		case "3" :
		case "Multiplica��o":
			System.out.println("O resultado da multiplica��o entre "+numeroA+" e "+numeroB+" � "+multiplicar(numeroA, numeroB));
		break;
		case "4" :
		case "Divis�o":
			System.out.println("O resultado da divis�o entre "+numeroA+" e "+numeroB+" � "+dividir(numeroA, numeroB));
		break;
		case "0":
		case "Sair":
			System.out.println("Encerrando programa! Obrigado pela visita");
		default:
			System.out.println("Digite uma op��o v�lida");}}
			
			
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

