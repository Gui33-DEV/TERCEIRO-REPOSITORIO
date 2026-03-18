package aulacondicional;

import java.util.Scanner;

public class desafio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numero1, numero2, numero3;
		
		System.out.println("qual o primeiro numero?");
		numero1 = ler.nextDouble();
		System.out.println("qual o segundo numero?");
		numero2 = ler.nextDouble();
		System.out.println("qual o terceiro numero?");
		numero3 = ler.nextDouble();
		
	if (numero1 > numero2 && numero1 > numero3) {
		System.out.println(numero1 + " é o maior numero");
	} else if (numero2 > numero1 && numero2 > numero3) {
		System.out.println(numero2 + " é o maior numero");
	} else {
		System.out.println(numero3 + " é o maior numero");
	}
	ler.close();
	}

}
