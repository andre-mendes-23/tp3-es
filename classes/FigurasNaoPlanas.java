package classes;

public abstract class FigurasNaoPlanas extends Figuras implements Area, Volume, Cloneable {

    @Override
    public String toString() {
        return "{" + super.toString() + "}";
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
