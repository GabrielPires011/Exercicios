package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
	   Scanner sc = new Scanner (System.in);
	   
	   System.out.println("Digite os �ltimos 3 s�lario: ");
	   String valor1 = sc.next().replace(",", ".");
	   String valor2 = sc.next().replace(",", ".");
	   String valor3 = sc.next().replace(",", ".");
	   
	   double salario1 = Double.parseDouble(valor1);
	   double salario2 = Double.parseDouble(valor2);
	   double salario3 = Double.parseDouble(valor3);
	   
	   Double media = (salario1 + salario2 + salario3) / 3;
	   
	   System.out.println("Media = " + media);
	   
	   
	   
	   
	   sc.close();	
	}
}
