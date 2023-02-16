package interfac;

public class Multifuncional implements Digitalizadora, Copiadora, Impressora{

	@Override
	public void scannear() {
		System.out.println("DIGITALIZANDO MULTIFUNCIONAL...");
	}

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO MULTIFUNCIONAL...");
		
	}

	@Override
	public void copiar() {
		System.out.println("COPIANDO MULTIFUNCIONAL...");
		
	}

}
