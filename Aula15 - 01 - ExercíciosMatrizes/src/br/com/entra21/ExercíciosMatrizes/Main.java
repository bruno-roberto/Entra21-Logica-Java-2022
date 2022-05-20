package br.com.entra21.ExercíciosMatrizes;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option;

		do {
			System.out.println(escreverMenu());
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				criarMatriz2Niveis();
				break;

			case 2:
				initializeMatrizTwolevel();
				break;

			case 3:
				createMatriz5Vetors3positions();
				break;
			case 4:
				solicitarTamanhoMatrizParaPreencher();
				break;
			case 6:
				atribuirAleatoriamenteValoresDetalhesVetores();
				break;
				

			default:
				System.out.println("Digite uma pção válida");
				break;

			}

		} while (option != 0);

	}

	public static String escreverMenu() {

		String menu = "Escolha uma das opções:";
		menu += "\n 0 - Sair\n ";
		menu += "\n 1 - Criar matriz de dois níveis";
		menu += "\n 2 - Inicializar matriz de dois níveis";
		menu += "\n 3 - Criar uma nova matriz de cinco vetores com tres posições";
		menu += "\n 4 - Criar matrizes de vetores conforme vontade do usuário";
		menu += "\n 5 - Outro";
		menu += "\n 6 - Preencher aleatóriamente valores na matriz";
		

		return menu;
	}

	public static void criarMatriz2Niveis() {

		char matrizChars[][] = new char[2][3]; // dois vetores onde cada um pode armazenar 3 letras
		boolean matrizBooleans[][];
		matrizBooleans = new boolean[2][4]; // dois vetores onde cada um pode armazenar 4 valores lógicos
		byte matrizByte[][] = new byte[1][3];
		short matrizShorts[][] = new short[2][1];
		int matrizInts[][] = new int[3][2];
		long matrizLongs[][] = new long[3][3];
		float matrizFloats[][] = new float[3][4];
		double matrizDoubles[][] = new double[5][3];

		System.out.println(
				"matrizCharz tamanho = " + matrizChars.length + " e cada vetor tem tamanho " + matrizChars[0].length);
		System.out.println("matrizBooleans tamanho =  " + matrizBooleans.length + " e cada vetor tem tamanho "
				+ matrizBooleans[0].length);
		System.out.println(
				"matrizBytes tamanho =  " + matrizByte.length + " e cada vetor tem tamanho " + matrizByte[0].length);
		System.out.println("matrizShorts tamanho =  " + matrizShorts.length + " e cada vetor tem tamanho "
				+ matrizShorts[0].length);
		System.out.println(
				"matrizInts tamanho =  " + matrizInts.length + " e cada vetor tem tamanho " + matrizInts[0].length);
		System.out.println(
				"matrizLongs tamanho =  " + matrizLongs.length + " e cada vetor tem tamanho " + matrizLongs[0].length);
		System.out.println("matrizFloats tamanho =  " + matrizFloats.length + " e cada vetor tem tamanho "
				+ matrizFloats[0].length);
		System.out.println("matrizDoubles tamanho =  " + matrizDoubles.length + " e cada vetor tem tamanho "
				+ matrizDoubles[0].length);

	}

	public static void initializeMatrizTwolevel() { // QUEM DEFINE O TAMANHO DE CADA VETOR É A INICIALIZAÇÃO, QUE PODE
													// SER IRREGULAR

		char matrizChars[][] = { { 'B', 'R', 'P', 'S' }, { 'A', 'B', 'C', 'D' },

		};

		boolean matrizBooleans[][] = { { true, false, true, false }, { true, false, true, false },
				{ true, false, true, false }

		};

		byte matrizBytes[][] = { { 1, 2, 3, 4, 5 }, { 10, 20, 20 }, { 10, 25, 10 }, { 5, 10, 15, 20 },

		};
		short matrizShorts[][] = {

				{ 300, 400, 1000 }, { 500, 600, 100 }, { 1000, 4000, 5000 },

		};
		int matrizInts[][] = { { 100 }, { 200 }, { 10000 },

		};
		long matrizLongs[][] = { { 300, 400, 500, 600 }, { 1000000, 500000, 300 }, { 100000, 100000 }, };
		float matrizFloats[][] = { { 1000000f }, { 200000f, 30000f }, { 300000000f },

		};
		double matrizDouble[][] = { // quem define o tamanho de cada vetor é a incialização, que pode ser irregular.
				{ 100, 400, 500 }, { 100, 200, 400 }, { 1000, 4000, 5000, 6000 }, // irregular porque tem tamanhos
		};
	}

	public static void createMatriz5Vetors3positions() {

		byte matrizBytes[][] = new byte[5][3];
		System.out.println("Para o primeiro vetor informe o primeiro valor:");
		matrizBytes[0][0] = input.nextByte();
		System.out.println("Para o primeiro vetor informe o segundo valor");
		matrizBytes[0][1] = input.nextByte();
		System.out.println("Para o primeiro vetor informe o terceiro vetor");
		matrizBytes[0][2] = input.nextByte();
		// ---------------------------------------------------------------------

		System.out.println("Para o segundo vetor informe o primeiro valor:");
		matrizBytes[1][0] = input.nextByte();
		System.out.println("Para o segundo vetor informe o segundo valor");
		matrizBytes[1][1] = input.nextByte();
		System.out.println("Para o segundo vetor informe o terceiro vetor");
		matrizBytes[1][2] = input.nextByte();
		// ---------------------------------------------------------------------

		for (byte vetor = 2; vetor < matrizBytes.length; vetor++) { // [2][3][4]// continuando com for, começamos
																	// manualmente acima a captura
			for (byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {
				System.out.println("Para o " + (vetor + 1) + "º vetor informe o " + (detalhe + 1) + "º valor");
				matrizBytes[vetor][detalhe] = input.nextByte();

			}
		}

	}

	public static void solicitarTamanhoMatrizParaPreencher() {
		byte tamanhoVetor, tamanhoDetalhe;
		byte matrizBytes[][];

		System.out.println("Quantos vetores vc quer na sua matriz: ");
		tamanhoVetor = input.nextByte();
		System.out.println("Quantos itens vc quer em cada vetor: ");
		tamanhoDetalhe = input.nextByte();

		matrizBytes = new byte[tamanhoVetor][tamanhoDetalhe];

		for (byte vetor = 0; vetor < matrizBytes.length; vetor++) {

			for (byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {

				System.out.println("Para o indice [" + vetor + "] detalhe [" + detalhe + "] informe o valor ");
				matrizBytes[vetor][detalhe] = input.nextByte();
			}
		}

		for (byte vetor = 0; vetor < matrizBytes.length; vetor++) {

			for (byte detalhe = 0; detalhe < matrizBytes[vetor].length; detalhe++) {

				System.out.println(
						"Matriz bytes [" + vetor + "] detalhe [" + detalhe + "] ==> " + matrizBytes[vetor][detalhe]);

			}
		}

	}

	
	/*
	 * //Criar uma matriz de inteiros não inicializado //Repita indefinidamente até
	 * que o usuário responda não para a pergunta //Gostaria de inicializar o valor
	 * de uma das posições entre 1 e TAMANHO? /Caso responda sim Capturar todos os
	 * valores para aquele índice Repetir a captura até o fim da capacidade do
	 * índice Caso responda não Sair da repetição de inicializações Exibir todos os
	 * valores da matriz
	 */
	public static void atribuirAleatoriamenteValoresDetalhesVetores() {
		
		byte matrizBytes[][]= new byte [30][10];
		String resposta;
		byte vetor=0, detalhe=0;
		
		
		do {
			System.out.println("Para o vetor" +vetor+ "e detalhe" +detalhe+ "informe o valor");
			matrizBytes[vetor][detalhe] = input.nextByte();
			
			System.out.println("Gostaria de inicializar outro valô ?");
			resposta = input.next();
			if(resposta.equalsIgnoreCase("sim")) {
				System.out.println("Qual vetor você quer acessar?");
				vetor = input.nextByte();
				System.out.println("Qual detalhe deste vetor você quer atualizar o valor?");
				detalhe = input.nextByte();
				
				
				
			}
		}while(resposta.equalsIgnoreCase("sim"));
		
		
				
		
		
	}}
