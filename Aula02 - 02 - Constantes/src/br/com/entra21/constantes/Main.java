package br.com.entra21.constantes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		byte idade;
		idade=33;
		
		byte outraIdade = 34;
		
		short ano=2022;
		
		short anoPassado;
		
		anoPassado=2021;
		
		System.out.println("Minha idade é "+(idade+outraIdade));
		
		System.out.println("Estamos em "+ano+" e ano passado foi "+anoPassado+".");

		int habitantesBrasil = 215000000;
		
		System.out.println("No Brasil em "+ano+" temos exatamente "+anoPassado+ ".");
		
		long habitantesTerra1500;
		habitantesTerra1500=790000000;
				
		double habitantesAtualmente =7900000000.00;
				
	    float peso =70.5f, altura= 2.05f; 
	    
	    System.out.println("Meu peso é " +peso);
	    System.out.println("Minha altura é " +altura);
	    
	    char letra= 'R';
	    
	    boolean intervaloAntesdasOito=false;
	    boolean intervaloAgora=true;
	    
	    String nomeCompleto= "";
	    
	    String nome;
	    byte minhaIdade;
	    float minhaAltura,peso2,salario;
	    
	    Scanner entrada;
	    entrada = new Scanner(System.in); 
	    
	    System.out.println("Por favor, qual o teu nome?");
	    nome = entrada.next();
	    
	    System.out.println("Informe a tua idade: ");
	    minhaIdade = entrada.nextByte(); 
	    
	    
	    
	    System.out.println("Bem-vindo, "+nome+", agora consigo interagir com humanos e já sei que você tem " +minhaIdade+ " anos" );
	    
	    System.out.println("Qual a tua altura?");
	    minhaAltura = entrada.nextFloat();
	    System.out.println( "Qual o teu peso?");
	    peso2 = entrada.nextFloat();
	     
	    System.out.println(" Tua altura é "+minhaAltura+ " e o teu peso é " +peso2+", certo?");
	    
	    nome = JOptionPane.showInputDialog("Informe noevamente o teu nome completo"); //syso + Scanner ao mesmo tempo
	    
	    JOptionPane.showMessageDialog(null, "Legal, agora aprendi o teu nome");
	
	   minhaIdade = Byte.parseByte(
			   JOptionPane.showInputDialog("Informe seu peso")
			   );
			   
			   
			   
	    		
	
	
	
	}
	

}
