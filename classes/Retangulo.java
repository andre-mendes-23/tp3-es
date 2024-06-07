package classes;

public class Retangulo extends FigurasPlanas implements Cloneable {

    private double comprimento;
    private double largura;

    public Retangulo() {
        super.setNome("Retangulo");
    }

    public Retangulo(double comprimento, double largura) {
        super.setNome("Retangulo");
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "comprimento='" + getComprimento() + "'" +
                ", largura='" + getLargura() + "'" +
                '}';
    }

    @Override
    public double calcularArea() {
        return comprimento * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
