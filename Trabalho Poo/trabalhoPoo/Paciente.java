package trabalhoPoo;

public class Paciente extends Pessoa {
	private int numConsulta;
	private String consultaExame;
	public Paciente(String nome, String idade, String sexo,int numConsulta) {
		super(nome, idade, sexo);
	}

	public int getNumConsulta() {
		return numConsulta;
	}

	public void setNumConsulta(int numConsulta) {
		this.numConsulta = numConsulta;
	}

}
