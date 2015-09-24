package trabalhoPoo;

public class Pessoa {
	private String nome;
	private String idade;
	private String sexo;
	private String telefone;

	public Pessoa(String nome, String idade, String sexo, String telefone) {
		this.telefone = telefone;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone(String telefone){
		return this.telefone;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
