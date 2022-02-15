package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipos numéricos inteiross
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumuladas = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445_44F;
		double vendasAcumuladas = 2_991_797_1003.01;
		
		// tipos booleano
		boolean estaDeFerias = false; // true
		
		// Tipos caractrere
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumuladas / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias" + estaDeFerias);
		System.out.println("Status: " + status);
	}

}
