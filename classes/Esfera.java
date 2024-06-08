package classes;

public class Esfera extends FigurasNaoPlanas {

    public double raio;
    final double pi = 3.14;
    
    public Esfera() {
        super.setNome("Esfera");
    }

    public Esfera(double raio) {
        super.setNome("Esfera");
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double getPi() {
        return pi;
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "raio='" + getRaio() + "'" +
                '}';
    }

    @Override
    public double calcularArea() {
        return 4.0 * pi * raio * raio;
    }

    @Override
    public double calcularVolume() {
        return (4.0 / 3.0) * pi * raio * raio * raio;
    }

    public Object clone() throws CloneNotSupportedException {
        return (Esfera) super.clone();

    }

}
