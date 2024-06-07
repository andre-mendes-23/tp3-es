package classes;

public abstract class FigurasPlanas extends Figuras implements Area, Perimetro {

    @Override
    public String toString() {
        return "{" + super.toString() + "}";
    }
}
