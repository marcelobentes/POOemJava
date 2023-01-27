
public class Autodromo {
	public static void main(String[] args) {
		
		Carro butaro = new Carro();
		
		butaro.ligar();
		butaro.setChassi("45412313");
		butaro.setPlaca("BHSO84");
		
		Moto maxie600 = new Moto();
		maxie600.setChassi("34141qwe");
		maxie600.setPlaca("RTEW452");
		maxie600.ligar();
	}
}
