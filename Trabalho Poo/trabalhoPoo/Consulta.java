package trabalhoPoo;

public class Consulta {
	private String dataConsulta;
	private String reconsulta;
	private String escolhaMedico;
	
	public Consulta(String dataConsulta, String reconsulta, String escolhaMedico) {
		
		this.dataConsulta = dataConsulta;
		this.reconsulta = reconsulta;
		this.escolhaMedico = escolhaMedico;
	}
	public String getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getReconsulta() {
		return reconsulta;
	}
	public void setReconsulta(String reconsulta) {
		this.reconsulta = reconsulta;
	}
	
	public String getEscolhaMedico() {
		return escolhaMedico;
	}
	public void setEscolhaMedico(String escolhaMedico) {
		this.escolhaMedico = escolhaMedico;
	}

}
