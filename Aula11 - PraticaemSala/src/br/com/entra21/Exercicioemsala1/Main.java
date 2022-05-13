package br.com.entra21.Exercicioemsala1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		byte option;

		do {
			System.out.println(" \nEscolha uma das opções a seguir:");
			System.out.println(
					" 1 - Calculando a soma \n "
					+ "2 - Repetindo \n 3 - Entre 20 pessoas exibir a soma das idades ? \n "
					+ "4 - Entre 20 pessoas quantas são de maior \n "
					+ "5 - Vamos descobrir quem é o mais novo... \n"
					+ "6 - Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são \n"
					+ "7 -\n"
					+ "8 -\n"
					+ "9 - ");
			System.out.println(" 0 - \"Sair ");
			option = entrada.nextByte();
			switch (option) {
			case 1:
				calculandoSoma();
				break;
			case 0:
				System.out.println("Escolheu sair..");
			case 2:
				repetindo20Vezes();
			case 3:
				sumYears();
				break;
			case 4:
				maioresDeIdade();
				break;
			case 5:
				exibirMaisNovo();
				break;
			case 6:
				mediaAlunos();
				break;

			default:
				System.out.println("Escolha uma opção válida!");
				break;
			}
		} while (option != 0);
		System.out.println("Obrigado por usar o programa lista de exercício!");
	}
	public static void mediaAlunos() {
		Scanner input = new Scanner(System.in);
		byte quantidade, contador=0;
		float nota, soma=0f;
		System.out.println("Quantas notas você quer capturar ?");
		quantidade = input.nextByte();
		String resposta;
		
		do {
			contador++;
			System.out.println("Informe o valor uma nota");
			nota=input.nextFloat();
			if (contador>=quantidade) {
				System.out.println("Quer capturar mais alguma nota");
				resposta=input.next();
				if (resposta.equals("sim")) {
					contador--;
				}
			}
			soma = soma + nota;
		}while(contador<=quantidade);
		System.out.println("Soma= " +soma);
	}
	public static void calculandoSoma() {
		
	
		System.out.println("CALCULANDO SOMA");
		byte soma = 0;
		for (byte counter = 1; counter <= 15; counter++)
			System.out.println(
					"Soma = soma + counter, " + soma + " = " + soma + " + " + counter + "==>" + (soma = counter));

	}

	public static void repetindo20Vezes() { // Função repetição
		System.out.println("Você escolheu o looping de repetição");
		for (byte counter = 1; counter <= 20; counter++) {

			System.out.println("Palavra para repetir" + (counter % 5 == 0 ? "\n" : " "));
		}

		// No sysout acima foi utilizado uma maneira para que fosse quebrado o texto
		// %5 significa resto da divisão por 5, que se for 0 existe a quebra de linha \n
		// contra barra t significa tab
		// outra maneira de fazer é através do IF

	}

	public static void sumYears() {
		int sumYears = 0;
		byte age;
		Scanner input = new Scanner(System.in);
		for (byte count = 1; count <= 20; count++) {
			System.out.println("Por fsvor, insira a idade:");
			age = input.nextByte();
			sumYears = sumYears + age;
// Incremento, operação	
			System.out.println("A soma neste laço foi " + sumYears);
		}
		System.out.println("A soma total das idades foi" + sumYears);
	}

	public static void maioresDeIdade() {
		System.out.println("Exibir apenas maiores de idade");
		byte maiores = 0;
		byte idade;
		Scanner entrada = new Scanner(System.in);
		for (byte cont = 1; cont <= 20; cont++) {
			System.out.println("Informe a idade da pessoa " + cont);
			idade = entrada.nextByte();
			if (idade >= 18) {
				maiores++;
			}

			System.out.println("Entre" + (cont - 1) + " pessoas, apenas " + maiores + "");
		}

	}

	public static void exibirMaisNovo() {
		Scanner input = new Scanner(System.in);
		String name, youngername = "";
		byte age;
		byte ageMinimal = 0;
		for (byte count = 1; count <= 10; count++) {
			System.out.println("Digite seu nome: ");
			name = input.next();
			System.out.println("Digite sua idade, por gentileza " + name);
			age = input.nextByte();
			// no primeiro laço sempre a primeira idade vai ser a menor
			if (count == 1) {
				ageMinimal = age;
				youngername = name;
				System.out.println(" Sou o primeiro por isso sou o mais novo " + name + " com " + age);
			} else {
				// A partir do segundo laço já tem com o comparar com age minimal
				System.out.println("Estou no laço" +count+ "e preciso verificar ");
				if (age < ageMinimal) {
					System.out.println(
							"Ainda bem que testei porque a pessoa mais nova agora é" + name + "com a idade" + age);
					ageMinimal = age;
					youngername = name;
				}
				
				}
			}

		System.out.println( "Após isso tudo o mais novo é:" + youngername + " " + ageMinimal);
		}
	}


