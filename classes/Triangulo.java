package classes;

public class Triangulo extends FigurasPlanas implements Cloneable{

     private double lado1;
     private double lado2;
     private double altura;

     public Triangulo() {
         super.setNome("Triangulo");
     }

    public Triangulo(double lado1, double lado2, double altura) {
        super.setNome("Triangulo");
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
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
        return "Triangulo{" +
                "lado1='" + getLado1() + "'" +
                ", lado2='" + getLado2() + "'" +
                ", altura='" + getAltura() + "'" +
                '}';
    }

    @Override
    public double calcularArea() {
        return (lado1*altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + altura;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
