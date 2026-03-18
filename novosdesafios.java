package aulacondicional;

import java.util.Scanner;

public class novosdesafios {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int  numero;
	
	System.out.println("qual o número?");
	numero = ler.nextInt();
	
	if (numero % 2 == 0) {
	System.out.println("o número é par");
	}
	else if (numero %2 != 0) {
		System.out.println("o número é impar");
	}
	ler.close();
	}
}
