package br.com.entra21.avaliaçãosigno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		encontrarSigno();}
		
		public static void encontrarSigno() {

			String Nome, signo, opcao = null;
			byte DiaAniversario, MesAniversario;
			
Scanner entrada = new Scanner(System.in);
	
	System.out.println("Vamos descobrir seu signo?");
	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	
	System.out.println("Qual o seu nome ?");
	Nome = entrada.nextLine();
	
	System.out.println("Seja bem vindo");
	System.out.println("Qual é o dia do seu aniversário?");
	DiaAniversario = entrada.nextByte();
	
	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
	System.out.println("Qual o mes do seu aniversário?");
	System.out.println(" 1 - Janeiro  2 - Fevereiro  3 - Março  4 - Abril");
	System.out.println(" 5 - Maio  6 - Junho  7 - Julho  8 - Agosto ");
	System.out.println(" 9 - Setembro  10 - Outubro  11 - Novembro  12 - Dezembro");
	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	
	switch (opcao.toLowerCase()) {
	case "1":
	case "Janeiro":
		MesAniversario = 1;
		break;
	case "2":
	case "fevereiro":
		MesAniversario = 2;
		break;
	case "3":
	case "marco":
		MesAniversario = 3;
		break;
	case "4":
	case "abril":
		MesAniversario = 4;
		break;
	case "5":
	case "maio":
		MesAniversario = 5;
		break;
	case "6":
	case "junho":
		MesAniversario = 6;
		break;
	case "7":
	case "julho":
		MesAniversario = 7;
		break;
	case "8":
	case "agosto":
		MesAniversario = 8;
		break;
	case "9":
	case "setembro":
		MesAniversario = 9;
		break;
	case "10":
	case "outubro":
		MesAniversario = 10;
		break;
	case "11":
	case "novembro":
		MesAniversario = 11;
		break;
	case "12":
	case "dezembro":
		MesAniversario = 12;
		break;
	default:
		System.out.println("Opcao invalida! Tente novamente!");}
	}
	
		
		
		public static void verificarDiaMes(byte mesAniversario, byte diaAniversario) {
			final byte diasLimiteMes29 = 29;
			final byte diasLimiteMes30 = 30;
			final byte diasLimiteMes31 = 31;
			
			if (mesAniversario == 2 && diaAniversario >diasLimiteMes29) {
				System.out.println("Por favor, digite uma op��o v�lida FEVEREIRO TEM no m�ximo 29 dias.");
			} else if (mesAniversario == 4 && diaAniversario >diasLimiteMes30) {
				System.out.println("Por favor, digite uma op��o v�lida ABRIL TEM no m�ximo 30 dias.");
			} else if (mesAniversario == 6 && diaAniversario >diasLimiteMes30) {
				System.out.println("Por favor, digite uma op��o v�lida JUNHO TEM no m�ximo 30 dias.");
			} else if (mesAniversario == 9 && diaAniversario >diasLimiteMes30) {
				System.out.println("Por favor, digite uma op��o v�lida SETEMBRO TEM no m�ximo 30 dias.");
			} else if (mesAniversario == 11 && diaAniversario >diasLimiteMes30) {
				System.out.println("Por favor, digite uma op��o v�lida NOVEMBRO TEM no m�ximo 30 dias.");
			} else if (diaAniversario >diasLimiteMes31){
				System.out.println("Por favor, digite uma op��o v�lida. Um m�s tem no m�ximo 31 dias.");
			} else {
				verificarSigno(mesAniversario,diaAniversario);
			}
		}
		
		
		public static String verificarSigno(byte mesAniversario, byte diaAniversario) {

			String signo;

			if (mesAniversario == 3 && diaAniversario >= 21 && diaAniversario <= 31 || mesAniversario == 4 && diaAniversario <= 20) {
				signo = "ARIES";
			} else if (mesAniversario == 4 && diaAniversario >= 21 && diaAniversario <= 30 || mesAniversario == 5 && diaAniversario <= 20) {
				signo = "TOURO";
			} else if (mesAniversario == 5 && diaAniversario >= 21 && diaAniversario <= 31 || mesAniversario == 6 && diaAniversario <= 20) {
				signo = "GEMEOS";
			} else if (mesAniversario == 6 && diaAniversario >= 21 && diaAniversario <= 30 || mesAniversario == 7 && diaAniversario <= 22) {
				signo = "CANCER";
			} else if (mesAniversario == 7 && diaAniversario >= 23 && diaAniversario <= 31 || mesAniversario == 8 && diaAniversario <= 22) {
				signo = "LEAO";
			} else if (mesAniversario == 8 && diaAniversario >= 23 && diaAniversario <= 31 || mesAniversario == 9 && diaAniversario <= 22) {
				signo = "VIRGE";
			} else if (mesAniversario == 9 && diaAniversario >= 23 && diaAniversario <= 30 || mesAniversario == 10 && diaAniversario <= 22) {
				signo = "LIBRA";
			} else if (mesAniversario == 10 && diaAniversario >= 23 && diaAniversario <= 31 || mesAniversario == 11 && diaAniversario <= 21) {
				signo = "ESCORPIAO";
			} else if (mesAniversario == 11 && diaAniversario >= 22 && diaAniversario <= 30 || mesAniversario == 12 && diaAniversario <= 21) {
				signo = "SAGITARIO";
			} else if (mesAniversario == 12 && diaAniversario >= 22 && diaAniversario <= 31 || mesAniversario == 1 && diaAniversario <= 20) {
				signo = "CAPRICORNIO";
			} else if (mesAniversario == 1 && diaAniversario >= 21 && diaAniversario <= 31 || mesAniversario == 2 && diaAniversario <= 18) {
				signo = "AQUARIO";
			} else if (mesAniversario == 2 && diaAniversario >= 19 && diaAniversario <= 29|| mesAniversario == 3 && diaAniversario <= 20) {
				signo = "PEIXES";
			} else {
				signo = "error";
			}

			return signo;
		
	
	
	
	
	}}
