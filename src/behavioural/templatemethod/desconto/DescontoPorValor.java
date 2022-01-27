package behavioural.templatemethod.desconto;

import behavioural.templatemethod.Orcamento;

import java.math.BigDecimal;

public class DescontoPorValor extends Desconto {

    public DescontoPorValor(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.3"));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
