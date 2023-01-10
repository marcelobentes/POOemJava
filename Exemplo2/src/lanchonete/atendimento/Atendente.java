package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("SERVINDO A MESA.");
	}
	void atendenteTrocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS.");
	}
	private void pegarLancheCozinha() {
		System.out.println("PEGAR LANCHE NA COZINHA.");
	}
}
