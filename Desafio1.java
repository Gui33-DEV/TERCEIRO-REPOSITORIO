package aulacondicional;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int nota1,nota2,nota3,nota4,resultado;
	
	System.out.println("qual a primeira nota?");
	nota1 = ler.nextInt();
	System.out.println("qual a segunda nota?");
	nota2 = ler.nextInt();
	System.out.println("qual a terceira nota?");
	nota3 = ler.nextInt();
	System.out.println("qual a quarta nota");
	nota4 = ler.nextInt();
	
	resultado = (nota1+nota2+nota3+nota4)/4 ;
	
	
	if (resultado < 6) {
		System.out.println("ficou reprovado");
		
	}
	
		else {
			System.out.println("está aprovado");
		}
		ler.close();
		
	}
	
	}


