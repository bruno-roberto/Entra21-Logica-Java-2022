package br.com.entra21.prova01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String opcao;
		Scanner entrada = new Scanner(System.in);
		float numero;
		
		System.out.println("Bem vindo ao programa");
		System.out.println("Escolha a fun��o que voc� deseja:");
		System.out.println(" 1 - Signo");
		System.out.println(" 2 - Calculadora");
		
		opcao = entrada.next();
		
		switch (opcao.toLowerCase()) {
		case "1":
		case "Signo":
				break;
			String opcaoSigno;
			
			
			System.out.println("Voc� escolheu a op��o para descobrir o seu signo:");
			System.out.println("Para continuar digite o m�s em que voc� nasceu:");
			System.out.println(" 1 - Janeiro");
			System.out.println(" 2 - Fevereiro");
			System.out.println(" 3 - Mar�o");
			System.out.println(" 4 - Abril");
			System.out.println(" 5 - Maio");
			System.out.println(" 6 - Junho");
			System.out.println(" 7 - Julho");
			System.out.println(" 8 - Agosto");
			System.out.println(" 9 - Setembro");
			System.out.println(" 10 - Ourubro");
			System.out.println(" 11 - Novembro");
			System.out.println(" 12 - Dezembro");
			String opcaoSigno;opcaoSigno = entrada.next();
			
			switch (opcaoSigno.toLowerCase()) {
			case "1":
			case "Janeiro":
				System.out.println("Temos algu�m que nasceu em Janeiro aqui...");
				System.out.println("Posso saber qual dia de Janeiro?");
				
				
			break;
			case "2":
			case "Fevereiro":
				System.out.println("Temos um  filho do m�s Fevereiro aqui");
				System.out.println("Mas me conta, qual dia de Fevereiro?");
			break;
			case "3":
			case "Mar�o":
				System.out.println("Ent�o voc� nasceu em Mar�o");
				System.out.println("Posso saber qual dia de Mar�o?");
			break;
			case "4":
			case "Abril":
				System.out.println("Temos um filho do m�s de Abril");
				System.out.println("Me fala qual dia de Abril?");
			break;
			case "5":
			case "Maio":
				System.out.println("Parece que temos algu�m que nasceu em Maio aqui...");
				System.out.println("Mas me conta, qual dia de Maio?");
			break;
			case "6":
			case "Junho":
				System.out.println("Temos um filho do m�s de Junho");
				System.out.println("Me fala qual dia de Junho ?");
			break;
			case "7":
			case "Julho":
				System.out.println("Parece que temos algu�m que nasceu em Julho");
				System.out.println("Mas qual dia de Julho?");
			break;
			case "8":
			case "Agosto":
				System.out.println("Temos algu�m que nasceu em Agosto");
				System.out.println("Posso saber em qual dia de Agosto?");
			break;
			case "9":
			case "Setembro":
				System.out.println("Temos algu�m que nasceu em Setembro");
				System.out.println("Posso saber em qual dia de Setembro?");
			break;
			case "10":
			case "Outubro":
				System.out.println("Temos algu�m que nasceu em Outubro");
				System.out.println("Qual dia de Outubro ?");
			break;
			case "11":
			case "Novembro":
				System.out.println("Temos um filho do carnaval aqui");
				System.out.println("Qual dia de Novembro ?");
			break;
			case "12":
			case "Dezembro":
				System.out.println("Olha, alguem de Dezembro aqui");
				System.out.println("Qual dia de Dezembro?");
			break;
		switch (opcao.toLowerCase()) {
		case "2":
		case "calculadora":
			
				String opcaoCalculo;
			float numeroA, numeroB;
			
			System.out.println("Voc� escolheu a op��o para calcular");
			System.out.println("Digite o primeiro n�mero");
			numeroA = entrada.nextFloat();
			System.out.println("Digite o segundo n�mero");
			numeroB = entrada.nextFloat();
			
			System.out.println("Agora que voc� informou os n�meros, digite o calculo desejado");
			System.out.println(" 1 - Soma");
			System.out.println(" 2 - Subtra��o");
			System.out.println(" 3 - Multiplica��o");
			System.out.println(" 4 - Divis�o");
			opcaoCalculo = entrada.next();
			break;
			
			
			int dia, mes;
			
			System.out.println("Informe o dia de nascimento");
			dia = entrada.nextInt();
			
			System.out.println("Informe o mes de nascimento");
			mes = entrada.nextInt();
			

		      if (((mes == 12) && ((dia >= 22) && (dia <= 31))) ||
		          ((mes == 1)  && ((dia >= 1)  && (dia <= 20))))
		         System.out.printf("\nCapricornio.\n");
		      else if (((mes == 1) && ((dia >= 21) && (dia <= 31))) ||
		               ((mes == 2) && ((dia >= 1)  && (dia <= 19))))
		              System.out.printf("\nAquario.\n");
					 else if (((mes == 2) && ((dia >= 20) && (dia <= 29))) ||
				               ((mes == 3) && ((dia >= 1)  && (dia <= 20))))
				              System.out.printf("\nPeixes.\n");
				      else if (((mes == 3) && ((dia >= 21) && (dia <= 31))) ||
				               ((mes == 4) && ((dia >= 1)  && (dia <= 20))))
				              System.out.printf("\nAries.\n");
				      else if (((mes == 4) && ((dia >= 21) && (dia <= 30))) ||
				               ((mes == 5) && ((dia >= 1)  && (dia <= 20))))
				              System.out.printf("\nTouro.\n");
				      else if (((mes == 5) && ((dia >= 21) && (dia <= 31))) ||
				               ((mes == 6) && ((dia >= 1)  && (dia <= 20))))
				              System.out.printf("\nGemeos.\n");
				      else if (((mes == 6) && ((dia >= 21) && (dia <= 30))) ||
				               ((mes == 7) && ((dia >= 1)  && (dia <= 21))))
				              System.out.printf("\nCancer.\n");
				      else if (((mes == 7) && ((dia >= 22) && (dia <= 31))) ||
				               ((mes == 8) && ((dia >= 1)  && (dia <= 22))))
				              System.out.printf("\nLeao.\n");
				      else if (((mes == 8) && ((dia >= 23) && (dia <= 31))) ||
				               ((mes == 9) && ((dia >= 1)  && (dia <= 22))))
				              System.out.printf("\nVirgem.\n");
				      else if (((mes == 9)  && ((dia >= 23) && (dia <= 30))) ||
				               ((mes == 10) && ((dia >= 1)  && (dia <= 22))))
				              System.out.printf("\nLibra.\n");
				      else if (((mes == 10) && ((dia >= 23) && (dia <= 31))) ||
				               ((mes == 11) && ((dia >= 1)  && (dia <= 21))))
				              System.out.printf("\nEscorpiao.\n");
				      else if (((mes == 11) && ((dia >= 22) && (dia <= 30))) ||
				               ((mes == 12) && ((dia >= 1)  && (dia <= 21))))
				              System.out.printf("\nSagitario.\n");
				           else
				              System.out.printf("\nErro: dia ou mes de nascimento invalidos !!!\n");
			
				
			
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
				System.out.println();
			default:
				System.out.println("Digite uma op��o v�lida");
			}}}}

			
				
		

		
	
		

	
	}

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
