package br.com.entra21.operadoresaritimeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("funciona pfv");
		System.out.println (1+1);
		
		float numeroA, numeroB;
		float calculoSoma;
		float resto;
		
		
		//objeto entrada da classe Scanner precisa utilizar o System.in para ter acesso ao teclado
		Scanner entrada =new Scanner(System.in);
		// new Scanner significa construa um objeto da classe Scanner e atribua a variavel entrada
		
		System.out.println("Informe o numero A:");
		numeroA = entrada.nextFloat();
		
		System.out.println("Informe o numero B");
		numeroB = entrada.nextFloat();
		
		System.out.println("A soma entre esses 2 numeros �"+ (numeroA+numeroB));
		calculoSoma= numeroA+numeroB;
		
		
		System.out.println("Outra forma de exibir a soma �"+ calculoSoma);
		
		System.out.println("A subtra��o entre esses 2 n�meros �"+(numeroA-numeroB));
		
		System.out.println("multiplica��o " +numeroA*numeroB);
		
		System.out.println("divis�o " +numeroA/numeroB);
		
		resto = numeroA%numeroB;
		// resto neste caso � uma vari�vel auxiliar, mas utiliza mais mem�ria 
		System.out.println("O resto da divis�o" + resto);
		
		
				
		
		
				
		
	}

}
