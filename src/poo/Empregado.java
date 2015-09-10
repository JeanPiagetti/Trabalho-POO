package poo;

public class Empregado {
	private String nome;
	private int idade;

	public Empregado(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}
}
