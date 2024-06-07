package classes;

public class Trapezio extends FigurasPlanas implements Cloneable {
	
    public double baseMaior;
    public double baseMenor;
    public double lado1;
    public double lado2;
    public double altura;

    public Trapezio() {
        super.setNome("Trapezio");
    }

    public Trapezio(double baseMaior, double baseMenor, double lado1, double lado2, double altura) {
        super.setNome("Trapezio");
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double getBaseMaior() {
        return this.baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return this.baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getLado1() {
        return this.lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Trapezio{" +
                "baseMaior='" + getBaseMaior() + "'" +
                ", baseMenor='" + getBaseMenor() + "'" +
                ", lado1='" + getLado1() + "'" +
                ", lado2='" + getLado2() + "'" +
                ", altura='" + getAltura() + "'" +
                '}';
    }

    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return baseMaior + baseMenor + lado1 + lado2;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }

}