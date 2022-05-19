package br.com.entra21.Matrizes;

import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);

	// Definindo minhas variavel entrada do tipo Scanner acessivel em toda classe
	// Main
	// Como o metodo main � static, tanto metodos ou variaveis devem ser static para
	// se relacionarem com o metodo main

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		byte opcao;

		do {
			System.out.println(escreverMatrizes());
			opcao = entrada.nextByte();
			switch (opcao) {

			case 0:
				System.out.println("Saindo...");
				break;

			case 1:
				aprenderMatrizesSimples();
				break;

			case 2:
				aprenderMatrizesInicializados();
				break;

			default:
				System.out.println("Para!! O menu ta simples");
				break;
			}

		} while (opcao != 0);
		System.out.println("Fim da aula sobre matrizes");

	}

	private static String escreverMatrizes() {
		String conteudoMenu = "Escolha uma op��o para aprender:\n";
		conteudoMenu += "\t1 - Inicializnado matrizes com tamanho definidos\n";
		conteudoMenu += "\t2 - Inicializando martrizes com valores predeterminados";
		return conteudoMenu;
	}

	private static void aprenderMatrizesSimples() {
		System.out.println("Aprendendo sobre Matrizes simples");

		System.out.println("Armazenar as 3 notas de todos os 10 alunos\n");
		float notas[][];
		notas = new float[10][3];
		// primeiro indice � a quantidade de vetores
		// segundo indice � a capacidade de cada vetor
		// apenas no ultimo indice da criacao pela sintaxe ficam os valore

		byte quantidadeAlunos, quantidadeNotas;
		System.out.println("Informe a quantidade de alunos:");
		quantidadeAlunos = entrada.nextByte();

		System.out.println("Informe a quantidade de notas para cada alunos:");
		quantidadeNotas = entrada.nextByte();

		// quem, decide o tamanho da minha matriz � o usuario
		float novasNotas[][] = new float[quantidadeAlunos][quantidadeNotas];

		for (byte aluno = 0; aluno < novasNotas.length; aluno++) {
			System.out.println("Nessa posi��o [" + aluno + "] temos " + novasNotas[aluno].length + " notas");
			for (byte nota = 0; nota < novasNotas[aluno].length; nota++) {
				System.out.println("\t balor da nota [" + nota + " ] ==> " + novasNotas[aluno][nota]);

			}
		}
		System.out.println("Confiando que tenho no m�nimo 2 alunos");
		System.out.println("Olha as notas do segundo aluno");
		System.out.println(novasNotas[1][0]);
		System.out.println(novasNotas[1][1]);
		System.out.println(novasNotas[1][2]);

	}

	private static void aprenderMatrizesInicializados() {
		System.out.println("Aprendendo sobre matrizes inicializadas e irregulares");
		
		float salarioAlunos[][]= {
				{1000, 1250.50f, 2500.35f},
				{2600, 3500, 4500 },
				{50000, 150000, 2000000 },
				{50000, 150000, 2000000 },
		};
		//length 4
		byte matrizIrregular[][]= {
				{1,2,3,4,5,6,7},
				{4,3,2,1},
				{10,12},
				{-127,0,127}
				
				//length 4
		
		};
		String ementa[][]= {
				{"Metodologias �geis", "Introdu��o","metodologias","git"},
				{"L�jica com java","variaveis","constantes","coment�rios","desvios condicionais","la�os repeti��o"},
				{"poo", "Classes","objetos","heran�a","polimorfismo","encapsulamento","conceitos"},
				
		};// length 3

	}
}
