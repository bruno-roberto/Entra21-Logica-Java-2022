package br.com.entra21.operadores.relacionais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Operadores relacionais");
		
		System.out.println("Menor < ");
		
		byte idadeA;
		byte idadeB;
		boolean resultado;
		
		idadeA=30;
		idadeB=50;
		
		resultado = idadeA < idadeB;
		
		System.out.println("idadeA � < menor que idadeB? "+resultado);
		
		System.out.println("idadeA � < menor que idadeB? "+ (idadeA<idadeB));
		
		resultado = idadeA <= idadeB;
		
		System.out.println("idadeA � < menor ou = idadeB? "+resultado);
		
		System.out.println( idadeA+ "� maior ou igual que" + idadeB+ " ? " +resultado);
		
		resultado = idadeA > idadeB;
		
		System.out.println(idadeA+ "� maior que "+ idadeB+ "?" +resultado);
		
		resultado = idadeA >= idadeB;
		
		System.out.println(idadeA+ "� maior ou igual que"+ idadeB+ "?" +resultado);
				
		
		
		 
		
	}

}
