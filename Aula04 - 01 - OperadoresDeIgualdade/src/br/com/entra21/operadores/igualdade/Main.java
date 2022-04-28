package br.com.entra21.operadores.igualdade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Operadores de igualdade");
		
		System.out.println("igual == ");
		
		byte idadeA,idadeB;
		boolean resultado;
		
		
		idadeA=5;
		idadeB=10;
		
		resultado= idadeA==idadeB;
		
		System.out.println("Ao comparar a igualdade em "+resultado);
		
		resultado = idadeA != idadeB;
		
		System.out.println("Ao comparar a diferença em "+resultado);
		
	}

}
