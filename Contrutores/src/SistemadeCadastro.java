
public class SistemadeCadastro {
	public static void main(String[] args) {
		Pessoa Maria = new Pessoa("Maria Rosa", "112315454");
		
		Maria.setEndereco("Rua 15");
		
		System.out.println("Dados Pessoais: ");
		System.out.println("Nome: "+Maria.getNome());
		System.out.println("CPF: "+Maria.getCpf());
		System.out.println("Endereço: "+Maria.getEndereco());
	}
}
