
public class MSNMessenger {
	public void enviarMensagem() {
		validarConectadoInternet();
		
		System.out.println("Enviando mensagem...");
		receberMensagem();
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem...");
	}
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado à internet...");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando historico de mensagem...");
	}

}
