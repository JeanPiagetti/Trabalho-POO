package poo;
public class MountainBike extends Bicicleta {

    // a subclasse MountainBike adiciona 1 atributo
    public int alturaAssento;

    // contrutor
    public MountainBike(int alturaInicial, int cadenciaInicial, int velocidadeInicial, int marchaInicial) {
        super(cadenciaInicial, velocidadeInicial, marchaInicial);
        alturaAssento = alturaInicial;
    }

    // tem um metodo de set
    public void setAltura(int valor) {
        alturaAssento = valor;
    }
    
    public static void main(String ags[])
    {
    Bicicleta minhaBike = new MountainBike(10,4,1,1);
    int vel = minhaBike.velocidade;
   System.out.println(vel);
     }

}

