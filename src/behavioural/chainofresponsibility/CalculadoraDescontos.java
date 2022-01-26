package behavioural.chainofresponsibility;

import java.math.BigDecimal;

public class CalculadoraDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoPorQuantidade(new DescontoPorValor(new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
