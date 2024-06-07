package classes;

public class Circulo extends FigurasPlanas implements Cloneable{

    private double raio;
    final double pi = 3.14;

    public Circulo() {
        super.setNome("Círculo");
    }

    public Circulo(double raio) {
        super.setNome("Círculo");
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return this.pi;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio='" + getRaio() + "'" +
                '}';
    }

    @Override
    public double calcularArea() {
        return pi * (raio*raio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * pi * raio;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }
}
