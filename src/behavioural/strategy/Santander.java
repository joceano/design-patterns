package behavioural.strategy;

public class Santander implements CalculaJurosStrategyInterface {

    @Override
    public Double getTaxaDeJuros(Pedido pedido) {
        return Double.valueOf("10");
    }
}
