package br.com.entra21.ecercicioAreaPerimetro;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Fa�a um programa que solicite a base e altura de um ret�ngulo e informe sua �rea e perimetro.");
System.out.println("Sabendo que a �rea � calculada com base no produto entre base e altura.");
System.out.println("O per�metro � obtido ao somar todos os vertices do ret�ngulo");

//primeiro passo � criar vari�veis 
float base,altura,area,perimetro; //boas praticas de nomenclatura

Scanner entrada= new Scanner(System.in);

//segundo passo � determinar valores das vari�veis 

System.out.println("Informe a base do retangulo");
base = entrada.nextFloat();

System.out.println("Informe a altura do retangulo");
altura = entrada.nextFloat();

//momento dos processamentos e das opera��es 
area = base*altura;
perimetro = 2 * base + altura * 2;

System.out.println("O resultado da �rea �: "+area+" , O resultado do perimetro �: "+perimetro+".");


		
		
	}

}
