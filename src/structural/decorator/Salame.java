package structural.decorator;

public class Salame extends RecheioDecorator {

    private final Pao pao;

    public Salame(Pao pao) {
        this.pao = pao;
    }

    @Override
    public String getNome() {
        return pao.getNome() + ", Salame";
    }

    public Double valor() {
        return 1 + this.pao.valor();
    }
}
