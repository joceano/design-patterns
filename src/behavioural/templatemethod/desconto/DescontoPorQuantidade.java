package behavioural.templatemethod.desconto;

import behavioural.templatemethod.Orcamento;

import java.math.BigDecimal;

public class DescontoPorQuantidade extends Desconto {

    public DescontoPorQuantidade(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
