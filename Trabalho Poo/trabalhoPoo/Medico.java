package trabalhoPoo;
/*
 * 
 */
public class Medico extends Pessoa {
	private String especializacao;
	private int registro;

	public Medico(String nome, String idade, String sexo,String telefone) {
		super(nome, idade, sexo,telefone);

	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

}