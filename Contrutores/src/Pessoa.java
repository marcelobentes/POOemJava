
public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	//metodo construtor
	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	
	public String getNome() {
		return nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
