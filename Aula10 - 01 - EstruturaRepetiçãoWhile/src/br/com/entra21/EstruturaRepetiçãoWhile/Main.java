package br.com.entra21.EstruturaRepeti��oWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Aula sobre While e Do-While

		System.out.println("\t0 - Sair\n\t1 - While\n\t2 - do-while");
		System.out.println("Escolha uma op��o");

		// Instanciando um objeto da classe Scanner e j� utilizando o m�todo next
		switch (new Scanner(System.in).next().toLowerCase()) {
		case "socorro":
			System.out.println("");
		case "0", "sair":
			System.out.println("Escolheu sair");
			break;
		case "1", "while":
			aprenderWhile();
			System.out.println("");
			break;

		case "2", "do-while":
			aprenderDoWhile();
			break;

		default:
			System.out.println("Op��o invalida");
			main(null);
			break;

		}
	}

	private static void aprenderDoWhile() {

		System.out.println("Vamos aprender Do-While aqui:");
		Scanner entrada = new Scanner(System.in);
		String resposta;
		do {
			System.out.println("Existiam 2 dogs PITA e REPITA, Pita morreu, quem ficou ?");
			resposta = entrada.next();

		} while (resposta.equalsIgnoreCase("repita"));

		byte dia;
		do {
			System.out.println("Informe a data do seu anivers�rio");
			dia = entrada.nextByte();

		} while (dia > 31); // Pedir repeti�ao enquanto a var�avel dia informada for maior que 31
		System.out.println("Espero que n�o tenha errado muito");

		byte mes;
		byte contador=0;
		
		do {
			System.out.println("Informe o dia do seu anivers�rio");
			dia = entrada.nextByte();
			System.out.println("Informe o mes de anivers�rio");
			mes = entrada.nextByte();
			contador++;

			
		}while(dia<1 || mes>12 || mes<1 || dia>31); //para operadores de igualdade contr�rios < > utiliza-se || ou
		System.out.println("Finalmente voc� digitou certo"+dia+"/"+mes+"mas errou "+contador);

		main(null);

	}

	private static void aprenderWhile() {
		System.out.println("Vamos aprender o While aqui:");
		byte contagem = 1;
		while (contagem <= 10) { // condi��o de perman�ncia neste caso../// enquanto contagem for menor ou igual
									// a 10 execute
			System.out.println("Contando" + contagem);
			contagem++; // neste caso o contagem ++ � o implemtento
		}
		// para fazer uma repeti��o com base em quantidade � gerado muito c�digo
		System.out.println("acabei");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Deseja iniciar uma repeti��o?");
		String resposta = entrada.next();
		while (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("continuar")) {
			System.out.println("Voc� respondeu : " + resposta);
			System.out.println("Deseja continuar?");
			resposta = entrada.next();

		}
		System.out.println("Terminou meu while com base em decis�o");
		main(null);

	}
}
