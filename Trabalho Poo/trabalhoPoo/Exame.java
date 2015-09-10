package trabalhoPoo;

public class Exame {
	private String dataExame;
	private String dataRetirada;
	private String tipodeExame; // jcombox na classe janela
	
	public Exame(String dataExame, String dataRetirada, String tipodeExame) {
		
		this.dataExame = dataExame;
		this.dataRetirada = dataRetirada;
		this.tipodeExame = tipodeExame;
	}
	public String getDataExame() {
		return dataExame;
	}
	public void setDataExame(String dataExame) {
		this.dataExame = dataExame;
	}
	public String getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(String dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public String getTipodeExame() {
		return tipodeExame;
	}
	public void setTipodeExame(String tipodeExame) {
		this.tipodeExame = tipodeExame;
	}

	
}
