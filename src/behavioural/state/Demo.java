package behavioural.state;

import java.math.BigDecimal;

public class Demo {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);

        orcamento.aplicarDescontoExtra();
        System.out.println("Status: " + orcamento.getSituacao() + " - Valor: R$ " + orcamento.getValor());

        //state
        orcamento.aprovar();
        orcamento.aplicarDescontoExtra();
        System.out.println("Status: " + orcamento.getSituacao() + " - Valor: R$ " + orcamento.getValor());

        orcamento.finalizar();
        orcamento.aplicarDescontoExtra();
        System.out.println("Status: " + orcamento.getSituacao() + " - Valor: R$ " + orcamento.getValor());

    }
}
