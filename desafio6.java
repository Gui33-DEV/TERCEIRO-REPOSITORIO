package aulacondicional;

import java.util.Scanner;

public class desafio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String cpf2, senha2;
		Double valorinicial, valorsubtraido;
		
		System.out.println("CADASTRO");
		System.out.println("qual seu CPF?");
		final String cpf = ler.next();
		System.out.println("qual a senha?");
		final String senha = ler.next();
		System.out.println("quanto deseja depositar na conta?");
		valorinicial = ler.nextDouble();
		
		System.out.println("login");
		System.out.println("qual o CPF?");
		cpf2 = ler.next();
		System.out.println("qual a senha?");
		senha2 = ler.next();
		
		if (cpf.equals(cpf2) && senha.equals(senha2)) {
			System.out.println("Efetuando Login");
			System.out.println("Quanto você deseja sacar de " + valorinicial + "?");
			valorsubtraido = ler.nextDouble();
			if (valorsubtraido < valorinicial) {
				System.out.println("Transferência realizada");
			System.out.println("Seu novo saldo é de" + (valorinicial - valorsubtraido));
			} else {
			System.out.println("saldo insuficiente");
		}
		} else {
			System.out.println("Usuário não encontrado, tente novamente");
		}
		ler.close();
	}
}
