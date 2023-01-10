package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLAR A ENTRADA DOS ITENS.");
	}
	
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS.");
	}
	
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES.");
		controlarEntrada();
	}
}
