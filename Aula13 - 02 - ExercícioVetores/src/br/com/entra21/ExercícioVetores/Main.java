package br.com.entra21.ExercícioVetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		byte option;
		do {
			System.out.println(escreverMenu());
			option = input.nextByte();
			switch (option) {
			case 0:
				System.out.println("Obrigado por usar o programa!");
				break;
			case 1:
				exibirVetores();
				break;
			case 2:
				exibirVetoresInicializados();
				break;
			case 3:
				vetorCom5ParaInicializar();
				break;
			case 4:
				definirTamanhoVetorParaInicializar();
				break;
			case 5:
				percorrerVetorInicializadoCrescenteDecrescente();
				break;
			case 6:
				exibirVetorInteirosNoaInicializado();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (option != 0);

		// utilizando o do-while, pois permite entrar no bloco antes de testar a
		// condição de permanência

		// System.out.println("0 - Sair");
		// System.out.println("1 - Criar vetores para cada tipo primitivo e exibir o
		// delas no console");
		// System.out.println("2 - Criar vetores inicializados para cada tipo primirivo
		// e exibir o deles no concole");
		// System.out.println("3 - ");
		// System.out.println("4 - Criar um vetor com o tamanho informado pelo
		// usuário");
		// System.out.println("5 - ");
		// System.out.println("6 - ");
		option = input.nextByte();

		// caso a condição de permanência seja true, repita o bloco
		while (option != 0)
			; // enquanto não for zero, repita

	}

	public static void exibirVetores() {
		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInts[] = new int[3];
		long vetorLongs[] = new long[4];
		char vetorChars[] = new char[5];
		float vetorFloats[] = new float[6];
		double vetorDoubles[] = new double[7];
		boolean vetorBooleans[] = new boolean[8];

		System.out.println("vetorByte tamanho = " + vetorBytes.length);
		System.out.println("vetorShort tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void exibirVetoresInicializados() {
		byte vetorBytes[] = { 1, 2, 10, 20, 30 };
		short vetorShorts[] = { 130, 150, 195, 200 };
		int vetorInts[] = { 1600, 1250 };
		long vetorLongs[] = { 100000, 200000, 300000 };
		float vetorFloats[] = { 10000.50f, 4000000.2f, 50000.32f };
		double vetorDoubles[] = { 150000.354d, 400000.12345d };
		char vetorChars[] = { 'a', 'b', 'c', 'd' };
		boolean vetorBooleans[] = { true, false, true, false };

		System.out.println("vetoresBytes tamanho = " + vetorBytes.length);
		System.out.println("vetoresShorts tamanho = " + vetorShorts.length);
		System.out.println("vetorInts tamanho = " + vetorInts.length);
		System.out.println("vetorLongs tamanho = " + vetorLongs.length);
		System.out.println("vetorFloats tamanho = " + vetorFloats.length);
		System.out.println("vetorChars tamanho = " + vetorChars.length);
		System.out.println("vetorDoubles tamanho = " + vetorDoubles.length);
		System.out.println("vetorBooleans tamanho = " + vetorBooleans.length);

	}

	public static void vetorCom5ParaInicializar() {

		byte vetorBytes[] = new byte[5];
		Scanner input = new Scanner(System.in);

		for (byte count = 0; count < vetorBytes.length; count++) {
			System.out.println("Inicializando a posição " + (count + 1) + "no indice " + count);
			vetorBytes[count] = input.nextByte();

		}

	}

	public static void definirTamanhoVetorParaInicializar() {
		Scanner input = new Scanner(System.in);
		byte tamanho;
		byte vetorBytes[];

		System.out.println("Informe o tamanho do vetor");
		tamanho = input.nextByte();

		vetorBytes = new byte[tamanho];

		for (byte count = 0; count < vetorBytes.length; count++) {
			System.out.println("Informe o valor para o item " + (count + 1) + " no indice [ " + count + "]");
			vetorBytes[count] = input.nextByte();

		}

	}

	private static void percorrerVetorInicializadoCrescenteDecrescente() {
		byte vetorInt[] = { 12, 28, 37, 59, 6 };
		for (byte count = 0; count < vetorInt.length; count++) {
			System.out.println(vetorInt[count]);

		}
		System.out.println("----");
		for (byte count = (byte) (vetorInt.length - 1); count >= 0; count--) {
// começando com o tamanho -1, pq o indice sempre tem um valor a menos
// condição de permanencia, enquanto meu contado for maior que 0, comcei com
// valor alto e pretendo para ao chegar no zero
// como uma repetição decrescente utilizo o dcremento no contador
			System.out.println(vetorInt[count]);
		}
	}

	public static void exibirVetorInteirosNoaInicializado() {
		byte vetorByte[] = new byte[10];
		Scanner input = new Scanner(System.in);

		;
	}

	public static String escreverMenu() {
		String menu = "Escolha uma opção do menu de Práticas\n";
		menu += "0 - Sair\n";
		menu += "1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console\n";
		menu += "3 - Criar um vetor de 5 posições, para que o usuário alimente esses valores\n";
		menu += "4 - Criar um vetor com o tamanho informado pelo usuário e depois solicitar que o usuário informe os respectivos valores\n";
		menu += "5 - Criar um vetor de inteiros inicializado , para percorrer: Do inicio ao fim, Do fim ao inicio, Para exibir os valores\n";
		menu += "6 - Criar um vetor de inteiros não inicializado\n";
		menu += "---------------------------------------------";
		return menu;
	}
}
