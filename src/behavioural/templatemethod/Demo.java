package behavioural.templatemethod;

import behavioural.templatemethod.desconto.CalculadoraDescontos;

import java.math.BigDecimal;

public class Demo {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDescontos calculadora = new CalculadoraDescontos();
        System.out.println(calculadora.calcular(orcamento1));
        System.out.println(calculadora.calcular(orcamento2));
    }
}
