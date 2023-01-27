
public class Carro extends Ex_Heranca_Veiculo {
	public void ligar () {
		confereCombustivel();
		confereCambio();
		System.out.println("CARRO LIGADO.");
		
		
	}
		
	private void confereCombustivel() {
		System.out.println("Conferindo combustivel...");
	}
	private void confereCambio() {
		System.out.println("Conferindo cambio na posição...");
	}
}
