package operadores;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		//next ja tira as os espaços
		//nextline nao tira os espaço ai terei que usar trim
		String s2 = entrada.next();
		System.out.println(s2);
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
        entrada.close(); 
        }
}
