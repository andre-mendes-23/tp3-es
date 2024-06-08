package classes;
import java.lang.Math;

public class Piramide extends FigurasNaoPlanas implements Cloneable{

    private double arestaDaBase;
    private double altura;

    public Piramide() {
        super.setNome("Pirâmide");
    }

    public Piramide(double arestaDaBase, double altura) {
        super.setNome("Pirâmide");
        this.arestaDaBase = arestaDaBase;
        this.altura = altura;
    }

    public double getArestaDaBase() {
        return this.arestaDaBase;
    }

    public void setArestaDaBase(double arestaDaBase) {
        this.arestaDaBase = arestaDaBase;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Piramide{" +
                "arestaDaBase='" + getArestaDaBase() + "'" +
                ", altura='" + getAltura() + "'" +
                '}';
    }

    @Override
    public double calcularArea() {
        double hipotenusa = (altura * altura) + ((arestaDaBase / 2.0 )*(arestaDaBase / 2.0));
        double alturaDaFace = Math.sqrt(hipotenusa);
        double areaLateral = (arestaDaBase * alturaDaFace) / 2.0;
        double area = (areaLateral * 4.0) + (arestaDaBase * arestaDaBase);
        return area;
    }

    @Override
    public double calcularVolume() {
        double areaDaBase = arestaDaBase * arestaDaBase;
        return (areaDaBase * altura) / 3.0;
    }

    public Object clone() throws CloneNotSupportedException{
        return (Piramide) super.clone();

    }
}
