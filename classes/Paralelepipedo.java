package classes;

public class Paralelepipedo extends FigurasNaoPlanas {

    private double comprimento;
    private double largura;
    private double altura;

    public Paralelepipedo() {
        super.setNome("Paralelepipedo");
    }

    public Paralelepipedo(double comprimento, double largura, double altura) {
        super.setNome("Paralelepipedo");
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
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

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Paralelepipedo{" +
                "comprimento='" + getComprimento() + "'" +
                ", largura='" + getLargura() + "'" +
                ", altura='" + getAltura() + "'" +
                '}';
    }

    @Override
    public double calcularArea() {
        return 2.0 * (comprimento * largura + comprimento * altura + largura * altura);
    }

    @Override
    public double calcularVolume() {
        return comprimento * largura * altura;
    }

    public Object clone() throws CloneNotSupportedException {
        return (Paralelepipedo) super.clone();
    }

}
