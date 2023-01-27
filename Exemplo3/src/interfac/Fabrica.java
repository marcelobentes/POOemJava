package interfac;

public class Fabrica {
	
	public static void main(String[] args) {
		Multifuncional impressora = new Multifuncional();
		impressora.imprimir();
		impressora.copiar();
		impressora.scannear();
	}

}
