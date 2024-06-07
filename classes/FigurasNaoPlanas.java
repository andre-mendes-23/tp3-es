package classes;

public abstract class FigurasNaoPlanas extends Figuras implements Area, Volume {

    @Override
    public String toString() {
        return "{" + super.toString() + "}";
    }
}
