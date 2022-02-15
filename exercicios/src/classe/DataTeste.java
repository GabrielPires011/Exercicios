package classe;

public class DataTeste {
	
	public static void main(String[] args) {
	
		DataTesteData d1 = new DataTesteData(1, 6, 2022);
		DataTesteData d2 = d1;
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());		
	}
	
	static void voltarDataParaValorPadrao (DataTesteData d) {
	    d.dia = 1;
	    d.mes = 1;
	    d.ano = 1970;
	}
	}


