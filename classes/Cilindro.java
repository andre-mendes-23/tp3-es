package classes;

public class Cilindro extends FigurasNaoPlanas implements Cloneable{

    private double raio;
    private double altura;
    final double pi = 3.14;

    public Cilindro() {
        super.setNome("Cilindro");
    }

    public Cilindro(double raio, double altura) {
        super.setNome("Cilindro");
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "raio='" + getRaio() + "'" +
                ", altura='" + getAltura() + "'" +
                '}';
    }

    @Override
    public double calcularArea() {
        return 2 * pi * raio * (raio + altura);
    }

    @Override
    public double calcularVolume() {
        return pi * raio * raio * altura;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }
}
