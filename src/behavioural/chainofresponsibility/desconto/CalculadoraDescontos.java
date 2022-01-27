package behavioural.chainofresponsibility.desconto;

import behavioural.chainofresponsibility.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoPorQuantidade(new DescontoPorValor(new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
