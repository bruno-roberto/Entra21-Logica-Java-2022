package br.com.entra21.ecercicioAreaPerimetro;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Faça um programa que solicite a base e altura de um retângulo e informe sua área e perimetro.");
System.out.println("Sabendo que a área é calculada com base no produto entre base e altura.");
System.out.println("O perímetro é obtido ao somar todos os vertices do retângulo");

//primeiro passo é criar variáveis 
float base,altura,area,perimetro; //boas praticas de nomenclatura

Scanner entrada= new Scanner(System.in);

//segundo passo é determinar valores das variáveis 

System.out.println("Informe a base do retangulo");
base = entrada.nextFloat();

System.out.println("Informe a altura do retangulo");
altura = entrada.nextFloat();

//momento dos processamentos e das operações 
area = base*altura;
perimetro = 2 * base + altura * 2;

System.out.println("O resultado da área é: "+area+" , O resultado do perimetro é: "+perimetro+".");


		
		
	}

}
