package behavioural.strategy;

public class CalculadoraDeJuros {

    private final CalculaJurosStrategyInterface calculadorDeJuros;

    public CalculadoraDeJuros(CalculaJurosStrategyInterface calculadorDeJuros) {
        this.calculadorDeJuros = calculadorDeJuros;
    }

    public Double calculaJuros(Pedido pedido) {
        //strategy
        return this.calculadorDeJuros.getTaxaDeJuros(pedido);
    }
}
