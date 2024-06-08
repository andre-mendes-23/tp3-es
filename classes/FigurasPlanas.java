package classes;

public abstract class FigurasPlanas extends Figuras implements Area, Perimetro, Cloneable {

    @Override
    public String toString() {
        return "{" + super.toString() + "}";
    }

    public Object clone() throws CloneNotSupportedException{
        return (Cilindro) super.clone();
    } 
}
