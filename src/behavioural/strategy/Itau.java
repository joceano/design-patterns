package behavioural.strategy;

public class Itau implements CalculaJurosStrategyInterface {

    @Override
    public Double getTaxaDeJuros(Pedido pedido) {
        return Double.valueOf("20");
    }
}
