package teste;

import java.util.Scanner;

public class Teste1 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Escreva seu nome: ");
		nome = sc.next();
		
		System.out.println("Qual sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("Seu nome é " + nome + " e sua idade é " + idade);
		
		
		sc.close();
	}
}
