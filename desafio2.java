package aulacondicional;

import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int resposta;
		
		System.out.println("qual o número do mês?");
		resposta = ler.nextInt();
		
		if (resposta == 1) {
			System.out.println("Janeiro");
		} else if (resposta == 2) {
			System.out.println("Fevereiro");
		} else if (resposta == 3) {
			System.out.println("Março");
		} else if (resposta == 4) {
			System.out.println("Abril");
		} else if (resposta == 5) {
			System.out.println("Maio");
		} else if (resposta == 6) {
			System.out.println("Junho");
		} else if (resposta == 7) {
			System.out.println("Julho");
		} else if (resposta == 8) {
			System.out.println("Agosto");
		} else if (resposta == 9) {
			System.out.println("Setembro");
		} else if (resposta == 10) {
			System.out.println("Outubro");
		} else if (resposta == 11) {
			System.out.println("Novembro");
		} else if (resposta == 12) {
			System.out.println("Dezembro");
		} else {
			System.out.println("Mês inválido");
		}

	}

}
