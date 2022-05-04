package br.com.entra21.Switch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Condicionais - Switch");
		
		System.out.println("Serve para escolher entre opções pré definidas");
		
		System.out.println("Geralmente quando há muitos if elses ifs baseados em igualdade");
		
		float altura = 1.5f;
		
		if (altura == 1.0) {
			System.out.println("é baixinho");
		} else if (altura == 1.2) {	
			System.out.println("continua baixinho"); 
		} else if (altura == 1.5) {
			System.out.println("Baixinho mas nem tanto ");
		} else {
			System.out.println("já não é considerado baixinho");
			}
		System.out.println("1 = intervalo");
		System.out.println("2 = exercício");
		System.out.println("3 = prova");
		
	 Scanner entrada = new Scanner (System.in);
	 
	 byte opcao=3;
	 System.out.println("escolha a op 3 se tiver coragem");
	 opcao = entrada.nextByte();
	 
	 switch(opcao) {
	 case 1:
		 System.out.println("Vamos para o intervalo");
		break;
		
	 case 2:
		 System.out.println("Daqui a pouco tem exercício");
		 break;
		 
	 case 3:
		 System.out.println("Era dia 5 mas podemos fazer hoje");
		 break;
	 }
	 
	 String resposta;
	 System.out.println("Queremos intervalo");
	 resposta=entrada.next();
	 
	  System.out.println("Escolha ");
	 
	 // Vamos para outro exemplo 
	  
	  System.out.println("");
	 
	 
		 
		
		}
	}


