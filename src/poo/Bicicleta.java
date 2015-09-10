package poo;

public class Bicicleta {

	// a classe bicicleta tem tres atributos
	protected int cadencia;
	protected int marcha;
	protected int velocidade;

	// método construtor
	public Bicicleta(int cadenciaInicial, int velocidadeInicial, int marchaInicial) {
		marcha = marchaInicial;
		cadencia = cadenciaInicial;
		velocidade = velocidadeInicial;
	}

	public void setCadencia(int valor) {
		cadencia = valor;
	}

	public void setMarcha(int valor) {
		marcha = valor;
	}

	public void usaFreio(int decrementa) {
		velocidade -= decrementa;
	}

	public void acelera(int incrementa) {
		velocidade += incrementa;
	}

}
