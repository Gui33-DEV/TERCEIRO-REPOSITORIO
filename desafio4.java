package aulacondicional;

import java.util.Scanner;

public class desafio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double medida1, medida2, medida3;
		
		System.out.println("qual a primeira medida");
		medida1 = ler.nextDouble();
		System.out.println("qual a segunda medida");
		medida2 = ler.nextDouble();
		System.out.println("qual a terceira medida");
		medida3 = ler.nextDouble();
		
		if (medida1 == medida2 && medida2 == medida3) {
			System.out.println("é um triângulo equilátero");
	   } else if (medida1 == medida2 || medida1 == medida3 || medida2 == medida3) {
		   System.out.println("é um triângulo isóceles");
	   } else {
		   System.out.println("é um triângulo escaleno");
	   }
		ler.close();
	}

}