package classes;

public class Quadrado extends FigurasPlanas implements Cloneable{

    private double lado;

    public Quadrado() {
        super.setNome("Quadrado");
    }

    public Quadrado(double lado) {
        super.setNome("Quadrado");
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado='" + getLado() + "'" +
                '}';
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }
}
