package classes;

public class Figuras {

    private String nome;

    public Figuras(){

    }

    public Figuras(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Figuras{" +
                "nome='" + getNome() + "'" +
                '}';
    }
}
