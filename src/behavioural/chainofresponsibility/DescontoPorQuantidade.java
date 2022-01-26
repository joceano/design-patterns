package behavioural.chainofresponsibility;

import java.math.BigDecimal;

public class DescontoPorQuantidade extends Desconto {

    public DescontoPorQuantidade(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5)
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        return proximo.calcular(orcamento);
    }
}
