package trabalhoPoo;

import java.util.Vector;




public class Paciente{

	private String convenio;
	private String dataCadastro;
	private String ID;
	private String nome;
	private int idade;
	private String sexo;
	
	private static Vector<Paciente> vector = new Vector<Paciente>();
	public Paciente(){
		
	}
	public Paciente(String nome, int idade, String sexo, String Convenio, String dataCadastro,
			String ID) {
	}
	public static void setVectorC(int indice, Object obj){
		vector.add(indice, (Paciente) obj);
	}
	
	public static Vector<Paciente> getVectorC(){
		return vector;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDataCadastro(String dataCadastro) {
		return this.dataCadastro;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getID(String ID) {
		return this.ID;
	}

	public String getConvenio() {
		return this.convenio;
	}

	public void setConvenio(String Convenio) {
		this.convenio = Convenio;
	}

}
