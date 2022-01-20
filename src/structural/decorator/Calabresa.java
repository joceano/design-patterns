package structural.decorator;

public class Calabresa extends RecheioDecorator {

    private final Pao pao;

    public Calabresa(Pao pao) {
        this.pao = pao;
    }

    @Override
    public String getNome() {
        return pao.getNome() + ", Calabresa";
    }

    public Double valor() {
        return 2 + this.pao.valor();
    }
}
