package aulacondicional;

import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int numero;
	
	System.out.println("informe o número: ");
	numero= ler.nextInt();
	
	if (numero > 10) {
		System.out.println("o número é maior que dez");
	}
    ler.close();
	}

}
