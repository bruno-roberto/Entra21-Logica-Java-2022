package br.com.entra21.operadores.logicos;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Operadores l�gicos");
		
		System.out.println("E - AND - && - eComercial - (SHIFT+7) - (ALT+38) = express�o restritiva");
		System.out.println("Entre 2 booleans ao utilizar o && para resultar em true , ambos tem que ser true");
		System.out.println("Em outras palavras se houver um false em uma compara��o com && resultar� em false");
		
		System.out.println("Tabela da verdade do E");
		System.out.println();
		System.out.println();
		
		byte idade=30;
		float altura=1.80f;
		boolean resultado;
		
		resultado = idade<18; //false
		
		resultado = altura>2.0f; //false
		
		resultado = (idade<18) && (altura>=2.0f);
		//          False && false  
		//          False 
		
		idade=15;
		
		
		
	}
}
