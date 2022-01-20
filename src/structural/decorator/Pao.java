package structural.decorator;

public abstract class Pao {

    protected String nome;

    public String getNome() {
        return nome;
    }

    abstract Double valor();
}
